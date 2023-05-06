package servlet;

import data.Data;
import model.Student;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(
        name = "WelcomeServlet",
        urlPatterns = {"/welcome"}
)
public class WelcomeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String message = request.getParameter("message");
        request.setAttribute("text", message);
        request.setAttribute("deps", Data.getInstance().getDeps());
//        request.setAttribute("students", Data.getInstance().getStudents());

//        request.getRequestDispatcher("/ExampleThree.jsp").forward(request, response);
        request.getRequestDispatcher("/welcome.jsp").forward(request, response);
    }

/*
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        ServletOutputStream out = resp.getOutputStream();
        out.write("Welcome".getBytes());
        out.flush();
        out.close();
    }
*/

}
