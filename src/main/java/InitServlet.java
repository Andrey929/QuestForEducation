import Sourse.Questionnaire;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "InitServlet", value = "/init")
public class InitServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Questionnaire questionnaire = new Questionnaire();
        HttpSession session = req.getSession();
        session.setAttribute("index",1);
        getServletContext().getRequestDispatcher("/index.jsp").forward(req, resp);
    }
}
