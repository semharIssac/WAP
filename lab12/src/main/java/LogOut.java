import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/logout")
public class LogOut extends HttpServlet {
    public  void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        req.getSession().invalidate();
        res.sendRedirect("index.jsp");
        return; //
    }
}
