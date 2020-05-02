package l24_servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String html = "<HTML>" +
                      "<HEAD>" +
                      "<TITLE>" +
                      "First page" +
                      "</TITLE>" +
                      "</HEAD>" +
                      "<BODY>" +
                      "<H1>" +
                      "Hello guys \n" + LocalDateTime.now() +
                      "<H1>" +
                      "</BODY>" +
                      "";

        final PrintWriter writer = resp.getWriter();
        writer.println(html);
    }
}
