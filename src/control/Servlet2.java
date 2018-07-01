package control;
import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;

import modelo.entidades.Marca;
import modelo.entidades.Movil;
import servicios.IServiciosMoviles;
import servicios.ServiciosMovilesImp;


public class Servlet2 extends HttpServlet{
	private static final long serialVersionUID = 1L;

	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("--- dentro del servlet Menu");
        try {
               	       	 
        	IServiciosMoviles servicios = new ServiciosMovilesImp();
        	ArrayList<Marca> listaMarcas = new ArrayList<Marca>();
        	listaMarcas = servicios.ListarMarca();
        	
        	
        	
        	ArrayList<Movil> listaMoviles = new ArrayList<Movil>();
        	String c = request.getParameter("idMovil");
        	
        	request.setAttribute("marcas", listaMarcas); 
            	
        	if(c == null){
        		request.setAttribute("moviles", listaMoviles); 
            	listaMoviles=servicios.listarMoviles();
            	RequestDispatcher view = request.getRequestDispatcher("plantillaGeneral.jsp");
        	}else{
            	Movil movil =new Movil();
            	int numEntero = Integer.parseInt(c);
            	ArrayList<Movil> listaMoviles2 = new ArrayList<Movil>();
            	movil = servicios.bucarMovil(numEntero);
            	System.out.print(movil);
            	listaMoviles2.add(movil);
            	request.setAttribute("movilGamero", listaMoviles2); 
        		//RequestDispatcher view = request.getRequestDispatcher("fichaTecnica.jsp");
        		//listaMarcas= servicios.listarMarcas();
        	}
        	

        	
                 
            RequestDispatcher view = request.getRequestDispatcher("fichaTecnica.jsp");
            view.forward(request, response);
        } catch (Exception e) {
            System.out.println("--------------------  FALLO  -----------------------------");
            System.out.println(e.getMessage());
            System.out.println("----------------------------------------------------------");
        }

    }

// <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
