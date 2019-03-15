import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class login extends HttpServlet {
        public  void doGet(HttpServletRequest req, HttpServletResponse res){

        }
        public  void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
            String id = req.getParameter("username");
            String password = req.getParameter("pass");

            usermap umap=new usermap();
            umap.createUser();
            boolean islogin=umap.getUser(id,password);

            if(islogin==true){
                Cookie cookie= new Cookie("user", id);
                cookie.setMaxAge(30*24*3600); //in seconds
                res.addCookie(cookie);
                req.getSession().setAttribute("loggeduser",id);
                req.getRequestDispatcher("welcome.jsp").forward(req,res);

            }
            else{
                req.setAttribute("errorMsg","Invalid Username or Password");
                req.getRequestDispatcher("index.jsp").forward(req,res);
            }

            //PrintWriter out= res.getWriter();
            //out.print(id+""+password+""+islogin);
        }
}
