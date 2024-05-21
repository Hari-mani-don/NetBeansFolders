/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;



@WebServlet(urlPatterns = "/register")
public class Register extends HttpServlet {

  
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try(PrintWriter pw = response.getWriter()){
            
            response.setContentType("text/html;charset=UTF-8");
            String name = request.getParameter("name");
            pw.println("name:"+ name);
            pw.println("<html>");
            pw.println("<body>");
            pw.println("<h1>helo hari</h1>");
            pw.println("</body>");
            pw.println("</html>");
        
        }catch(Exception e){
            e.printStackTrace();
        }
    }

       
   
}
