package simpleinterest;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@SuppressWarnings("serial")
@WebServlet("/calculate")
public class Simpleinteresetcal extends HttpServlet {
	

	    public void service(HttpServletRequest request, HttpServletResponse response) 
	            throws ServletException, IOException {
	        
	        response.setContentType("text/html");
	        PrintWriter out = response.getWriter();
	        
	        
	        String p = request.getParameter("principal");
	        String r = request.getParameter("rate");
	        String t = request.getParameter("time");
	        
	        out.println("<html>");
	        out.println("<head><title>Simple Interest Result</title>");
	        out.println("<style>");
	        out.println("body { font-family: Arial, sans-serif; background: #f0f0f0; padding: 50px; }");
	        out.println(".result { background: white; padding: 30px; border-radius: 10px; box-shadow: 0 0 10px rgba(0,0,0,0.1); width: 350px; margin: 0 auto; }");
	        out.println("h2 { color: #333; text-align: center; margin-bottom: 20px; }");
	        out.println(".row { display: flex; justify-content: space-between; margin: 10px 0; padding: 10px; border-bottom: 1px solid #eee; }");
	        out.println(".label { color: #666; }");
	        out.println(".value { color: #333; font-weight: bold; }");
	        out.println(".interest { background: #e8f5e9; padding: 15px; border-radius: 5px; text-align: center; margin: 20px 0; }");
	        out.println(".back-btn { background: #2196F3; color: white; padding: 10px 20px; border: none; border-radius: 4px; cursor: pointer; display: block; margin: 20px auto; text-decoration: none; text-align: center; }");
	        out.println(".back-btn:hover { background: #1976D2; }");
	        out.println("</style>");
	        out.println("</head>");
	        out.println("<body>");
	        out.println("<div class='result'>");
	        out.println("<h2>Calculation Result</h2>");
	        
	        try {
	            
	            double principal = Double.parseDouble(p);
	            double rate = Double.parseDouble(r);
	            double time = Double.parseDouble(t);
	            
	            
	            double interest = (principal * rate * time) / 100;
	            double total = principal + interest;
	            
	            
	            out.println("<div class='row'>");
	            out.println("<span class='label'>Principal (P):</span>");
	            out.println("<span class='value'>₹" + String.format("%.2f", principal) + "</span>");
	            out.println("</div>");
	            
	            out.println("<div class='row'>");
	            out.println("<span class='label'>Rate (R):</span>");
	            out.println("<span class='value'>" + String.format("%.2f", rate) + "%</span>");
	            out.println("</div>");
	            
	            out.println("<div class='row'>");
	            out.println("<span class='label'>Time (T):</span>");
	            out.println("<span class='value'>" + String.format("%.2f", time) + " years</span>");
	            out.println("</div>");
	            
	            // Display result
	            out.println("<div class='interest'>");
	            out.println("<h3>Simple Interest: ₹" + String.format("%.2f", interest) + "</h3>");
	            out.println("<p>Total Amount: ₹" + String.format("%.2f", total) + "</p>");
	            out.println("</div>");
	            
	        } catch (Exception e) {
	            out.println("<div style='color: red; text-align: center; padding: 20px;'>");
	            out.println("Error: Please enter valid numbers");
	            out.println("</div>");
	        }
	        
	        
	        out.println("<a href='SI.html' class='back-btn'>Calculate Again</a>");
	        
	        out.println("</div>");
	        out.println("</body>");
	        out.println("</html>");
	        
	        out.close();
	    }
	}
	


