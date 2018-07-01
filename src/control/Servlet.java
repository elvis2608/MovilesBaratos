package control;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import datos.IMetodosMoviles;
import datos.MetodosMovilesImp;
import modelo.entidades.Marca;
import modelo.entidades.Movil;
import servicios.IServiciosMoviles;
import servicios.ServiciosMovilesImp;

import javax.servlet.http.*;


public class Servlet extends HttpServlet{
	private static final long serialVersionUID = 1L;

	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("--- dentro del servlet Menu");
        try {
               	       	 
        	IServiciosMoviles servicios = new ServiciosMovilesImp();
        	ArrayList<Marca> listaMarcas = new ArrayList<Marca>();
        	listaMarcas = servicios.ListarMarca();
        	
        	
        	
        	ArrayList<Movil> listaMoviles = new ArrayList<Movil>();
        	String c = request.getParameter("id");
        	
        	if(c == null){
            	listaMoviles=servicios.listarMoviles();
        	}else{
        		int numEntero = Integer.parseInt(c);
        		listaMoviles =servicios.listarMovilMarca(numEntero);
        		//listaMarcas= servicios.listarMarcas();
        	}
        	

        	request.setAttribute("marcas", listaMarcas); 
        	request.setAttribute("moviles", listaMoviles); 
                 
            RequestDispatcher view = request.getRequestDispatcher("plantillaGeneral.jsp");
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


