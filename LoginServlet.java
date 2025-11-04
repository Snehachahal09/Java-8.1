import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Retrieving form data
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Hardcoded validation
        if(username.equals("admin") && password.equals("12345")) {
            out.println("<h2>Welcome, " + username + "!</h2>");
            out.println("<p>Login Successful.</p>");
        } else {
            out.println("<h2>Invalid Username or Password!</h2>");
            out.println("<a href='login.html'>Try Again</a>");
        }
    }
}
