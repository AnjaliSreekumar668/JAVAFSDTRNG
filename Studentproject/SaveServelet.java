package com.ust.trng;


import java.io.PrintWriter;  
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SaveServlet
 */
@WebServlet("/SaveServelet")
public class SaveServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
   /* public SaveServlet() {
        // TODO Auto-generated constructor stub
    }*/

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");  
		PrintWriter out=response.getWriter(); 
		String name=request.getParameter("name");  
			        String password=request.getParameter("password");  
			        String email=request.getParameter("email");  
			        String country=request.getParameter("country");  
			          
			        Student e=new Student();  
			        e.setName(name);  
		        e.setPassword(password);  
			        e.setEmail(email);  
			        e.setCountry(country);  
			          
			        int status=StudentDao.save(e);  
			        if(status>0){  
		           out.print("<p>Record saved successfully!</p>");  
		            request.getRequestDispatcher("index.html").include(request, response);  
		        }else{  
			            out.println("Sorry! unable to save record");  
	        }  
			          
		        out.close();  
		    }  
		  
		}  


	

	