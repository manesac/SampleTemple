
package com.temple.controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet({"/index","/Contactus","/PersonalInfo"})
public class DemoServlet extends HttpServlet {

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
      String contextPath=request.getContextPath();
       String reqUrl=request.getRequestURI();
      String ipAddress=request.getRemoteAddr();
        
        if(request.getRequestURI().equals(contextPath +"/index"))
        {
        RequestDispatcher rd=request.getRequestDispatcher("index.html");
        rd.forward(request,response);
                
        }
        else if(request.getRequestURI().equals(contextPath +"/Contactus"))
        {
        RequestDispatcher rd=request.getRequestDispatcher("Contactus.jsp");
        rd.forward(request,response);
        }
        
        
        else if(request.getRequestURI().equals(contextPath +"/PersonalInfo"))
        {
        
        RequestDispatcher rd=request.getRequestDispatcher("PersonalInfo.jsp");
        rd.forward(request,response);
        
        }
//        System.out.println(ContextPath);
//        System.out.println(reqUrl);
//        System.out.println(ipAddress);
//        
   
        
        RequestDispatcher rd=request.getRequestDispatcher("index.html");
        rd.forward(request,response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
    }

    
    
}
