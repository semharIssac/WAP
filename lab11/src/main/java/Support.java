import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Support")
public class Support extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        ServletContext sc = this.getServletContext();

        String supportEmail =   sc.getInitParameter("support-email");
        PrintWriter printer = response.getWriter();
        printer.printf("Thank you! %s for contacting us. We should receive reply from us with in 24 hrs in your email address %s Let us know in our support email %s if you don’t receive reply within 24 hrs. Please be sure to attach your reference %s in your email.", name, email, supportEmail, 123);
        printer.close();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("support.jsp").forward(request, response);
    }
}
