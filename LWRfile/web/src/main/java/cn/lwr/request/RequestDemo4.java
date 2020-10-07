package cn.lwr.request;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Map;

@WebServlet("/requestDemo4")
public class RequestDemo4 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // String username = request.getParameter("username");
        // String[] hobbies = request.getParameterValues("hobby");
        // for (String hobby : hobbies) {
        //     System.out.println(hobby);
        // }
        // Enumeration<String> parameterNames = request.getParameterNames();
        // while (parameterNames.hasMoreElements()){
        //     String s = parameterNames.nextElement();
        //     System.out.println(s);
        //     String parameter = request.getParameter(s);
        //     System.out.println(parameter);
        // }
        request.setCharacterEncoding("utf-8");
        Map<String, String[]> parameterMap = request.getParameterMap();
        for (String name : parameterMap.keySet()) {
            String[] values = parameterMap.get(name);
            for (String value : values) {
                System.out.println(name+":"+value);
            }
            System.out.println("---------------");
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            // doPost(request,response);
    }
}
