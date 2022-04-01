import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "changeColorServlet", value = "/changeColorServlet")
public class changeColorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String newColor = (String)request.getAttribute("bg_color");
        request.setAttribute("newColor", newColor);
        request.getRequestDispatcher("/viewcolor.jsp").forward(request, response);
    }

}
