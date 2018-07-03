package control;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.entidades.Movil;
import servicios.IServiciosMoviles;
import servicios.ServiciosAdminImp;
import servicios.ServiciosMovilesImp;

public class ServletCrearMovil extends HttpServlet{
	private static final long serialVersionUID = 1L;

	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("--- dentro del servlet crear movil");
        try {
               	       	 
        	ServiciosAdminImp servicios = new ServiciosAdminImp();
        	IServiciosMoviles servicios2 = new ServiciosMovilesImp();
        		
        	ArrayList<Movil> listaMoviles = new ArrayList<Movil>();
			listaMoviles = servicios2.listarMoviles();
			request.setAttribute("moviles", listaMoviles);
        	
        	
        	String idMovil=request.getParameter("Idmovil");
        	String nombre = request.getParameter("Nombre");
        	 String  precio= request.getParameter("Precio");
        	 String procesador = request.getParameter("Procesador");
        	 String stock = request.getParameter("Stock");
        	 String memoria = request.getParameter("Memoria");
        	 String bateria = request.getParameter("Bateria");
        	 
        	 int idMovilI= Integer.parseInt(idMovil);
        	 int precioI = Integer.parseInt(precio);
        	 int stockI = Integer.parseInt(stock);
        	 int memoriaI = Integer.parseInt(memoria);
        	 int bateriaI = Integer.parseInt(bateria);
        	 
        	 Movil movil= new Movil();
        	 movil.setNombre(nombre);
        	 movil.setIdMovil(idMovilI);
        	 movil.setPrecio(precioI);
        	 movil.setProcesador(procesador);
        	 movil.setStock(stockI);
        	 movil.setMemoria(memoriaI);
        	 movil.setBateria(bateriaI);
        	 System.out.println(movil.toString());
        	 servicios.updateMovil(movil);

              
            RequestDispatcher view = request.getRequestDispatcher("menuAdmin.jsp");
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
