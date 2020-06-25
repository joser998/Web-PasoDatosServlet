package web;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Login")
public class Login extends HttpServlet{
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
       
        //Opcion Request:
        request.setAttribute("usuario", request.getParameter("usuario"));
        
       
        //Opcion session: este tipo de variable dura durante toda la sesion
        request.getSession().setAttribute("userSesion", request.getParameter("usuario"));
      
        
        //Opcion Contexto: esta variable solamente dura mientras dure el servlet
        getServletContext().setAttribute("userContext", request.getParameter("usuario"));
        
        
        
        //Manda el objeto a la JSP
        RequestDispatcher objeto;
        objeto = request.getRequestDispatcher("/Presentacion.jsp");
        objeto.forward(request, response);
        
    }
}