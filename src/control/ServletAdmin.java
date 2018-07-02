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

public class ServletAdmin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("--- dentro del servlet Menu");

		try {

			IServiciosMoviles servicios = new ServiciosMovilesImp();

			ArrayList<Movil> listaMoviles = new ArrayList<Movil>();
			listaMoviles = servicios.listarMoviles();
			request.setAttribute("moviles", listaMoviles);

			String operacion = request.getParameter("operacion");

			System.out.print("jfrvhhrvf");
			if (operacion != null) {

				if (operacion.equals("detalles")) {
					// ALTA

					ArrayList<Movil> listaMoviles2 = new ArrayList<Movil>();
					 String id = request.getParameter("id");
					 int idMovil = Integer.parseInt(id);
					 Movil movil = new Movil();					 				 
					movil= servicios.bucarMovil(idMovil);
					listaMoviles2.add(movil);
					request.setAttribute("moviles2", listaMoviles2);
					RequestDispatcher view = request.getRequestDispatcher("actualizarMovil.jsp");
					view.forward(request, response);
				} else if (operacion.equals("baja")){
					// BAJA
					// response.sendRedirect("paises?operacion=listado");
					
				} else if (operacion.equals("alta")){					
					// BAJA
					// response.sendRedirect("paises?operacion=listado");
					RequestDispatcher view = request.getRequestDispatcher("InsertarMovil.jsp");
					view.forward(request, response);
				}
				
			} else {
				
			}
			

			RequestDispatcher view = request.getRequestDispatcher("menuAdmin.jsp");
			view.forward(request, response);
		} catch (Exception e) {
			System.out.println("--------------------  FALLO  -----------------------------");
			System.out.println(e.getMessage());
			System.out.println("----------------------------------------------------------");
		}

	}

	// <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on
	// the + sign on the left to edit the code.">
	/**
	 * Handles the HTTP <code>GET</code> method.
	 *
	 * @param request
	 *            servlet request
	 * @param response
	 *            servlet response
	 * @throws ServletException
	 *             if a servlet-specific error occurs
	 * @throws IOException
	 *             if an I/O error occurs
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		processRequest(request, response);
	}

	/**
	 * Handles the HTTP <code>POST</code> method.
	 *
	 * @param request
	 *            servlet request
	 * @param response
	 *            servlet response
	 * @throws ServletException
	 *             if a servlet-specific error occurs
	 * @throws IOException
	 *             if an I/O error occurs
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
