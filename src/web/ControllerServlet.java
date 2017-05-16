package web;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException ;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dao.IUser;
import dao.UserDaoImplementation;
import metier.User;
@SuppressWarnings("serial")
public class ControllerServlet extends HttpServlet {
	private IUser metier ;
	
	@Override
	public void init() throws ServletException{
		metier = new UserDaoImplementation() ;
	}
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String path = request.getServletPath();
		if(path.equals("/index.do")){
			request.getRequestDispatcher("user.jsp").forward(request, response);
			
		}
		else if(path.equals("/chercher.do")){
			String motCle = request.getParameter("motCle");
			UserModel model = new UserModel() ;
			model.setMotCle(motCle);
			List<User> user = metier.chercherUser("%"+motCle+"%") ;
			model.setUser(user);
			request.setAttribute("model", model);
			request.getRequestDispatcher("user.jsp").forward(request, response);	
			
		}else if(path.equals("/saisie.do")){
			request.getRequestDispatcher("saisieUser.jsp").forward(request, response);
		}else if(path.equals("/supprimer.do")){
			int id = Integer.parseInt(request.getParameter("id"));
			metier.deleteUser(id);
			response.sendRedirect("chercher.do?motCle=");
			
			
		}else if (path.equals("/edit.do")){
			int id = Integer.parseInt(request.getParameter("id"));
			User u = metier.getUser(id);
			u.setId(id);
			request.setAttribute("user", u);
			request.getRequestDispatcher("editUser.jsp").forward(request, response);
			
		}else if (path.equals("/updateUser.do") && (request.getMethod().equals("POST"))){
			String nom = request.getParameter("nom");
			String prenom = request.getParameter("prenom");
			String username = request.getParameter("username");
			String password = request.getParameter("password");
			int id = Integer.parseInt(request.getParameter("id"));
			User u = new User(nom, prenom, username, password) ;
			u.setId(id);
			metier.update(u);
			request.setAttribute("user", u);
			request.getRequestDispatcher("confirmation.jsp").forward(request, response);
			
		}else if (path.equals("/saveUser.do") && (request.getMethod().equals("POST"))){
			String nom = request.getParameter("nom");
			String prenom = request.getParameter("prenom");
			String username = request.getParameter("username");
			String password = request.getParameter("password");
			User u = new User(nom, prenom, username, password) ;
			metier.save(u);
			request.setAttribute("user", u);
			request.getRequestDispatcher("confirmation.jsp").forward(request, response);
		}
		
		
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
