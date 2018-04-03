package org.manas.server.tomcat.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.manas.server.tomcat.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;

/*@WebServlet(
        name = "MyServlet",
        urlPatterns = {"/hello"}
    )*/
public class HelloServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	@Autowired
	private UserService userService;

	@Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        ServletOutputStream out = resp.getOutputStream();
       // out.write(userService.getUser().toString().getBytes());
        out.write("hello heroku".getBytes());
        out.flush();
        out.close();
    }
}