import Sourse.Questionnaire;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import org.apache.commons.lang3.ArrayUtils;

@WebServlet(name = "logicServlet", value = "/logic")
public class logicServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int[] finichIndexArray = new int[]{6,7,8,13,14,15};
        HttpSession session = req.getSession();
        int index = (Integer) session.getAttribute("index");

        int indexAns = 0;
        try {
            indexAns = Integer.parseInt(req.getParameter("ans"));
        }catch (Exception e){
            System.out.println("Error");
            resp.sendRedirect("/index.jsp");
        }

        Questionnaire questionnaire = new Questionnaire();
        session.setAttribute("index",questionnaire.getQuestionIndex(index,indexAns));
        int newIndex = (Integer) session.getAttribute("index");
        System.out.println(newIndex);
        if (ArrayUtils.contains(finichIndexArray,newIndex)) {
            System.out.println("Кажется сработало");
            getServletContext().getRequestDispatcher("/finish.jsp").forward(req, resp);
        }else {
            resp.sendRedirect("/index.jsp");
        }

    }

}
