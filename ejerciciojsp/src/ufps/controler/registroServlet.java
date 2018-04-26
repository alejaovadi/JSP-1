package ufps.controler;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import convencion.dao.ParticipanteDao;
import convencion.dao.ParticipanteDaoMySQL;
import convencion.model.Participante;


/**
 * Servlet implementation class registroServlet
 */
@WebServlet("/registroServlet")
public class registroServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public registroServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String nombre= request.getParameter("name");
		String pass= request.getParameter("pass");
		String tel= request.getParameter("tel");
		
		Participante p = new Participante();
		
		p.setNombre(nombre);
		p.setEstado(pass);
		p.setId(1);
		p.setTelefono(tel);
		p.setEmail("daniel@hotmail.com");
		
		ParticipanteDao pDao = new ParticipanteDaoMySQL();
		pDao.insertar(p);
		
		
		//ESTE CODIGO SIRVE PARA  REDIRECCIONAR LA PETICION AL SERVLET LOGIN Y GUARDAR EL
		//OBJETO PARTICIPANTE EN LA SESION
		//HttpSession s = request.getSession();
		//s.setAttribute("part", p);
		
		//RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
		//rd.forward(request, response);
		
		//response.getWriter().append("</br> Nombre").append(nombre);
		//response.getWriter().append("</br> Pass").append(pass);
		//response.getWriter().append("</br> Tel").append(tel);
	}

}
