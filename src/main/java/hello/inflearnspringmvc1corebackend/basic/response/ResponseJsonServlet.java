package hello.inflearnspringmvc1corebackend.basic.response;

import com.fasterxml.jackson.databind.ObjectMapper;
import hello.inflearnspringmvc1corebackend.basic.HelloData;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "responseJsonServlet", urlPatterns = "/response-json")
public class ResponseJsonServlet extends HttpServlet {
    private ObjectMapper objectMapper = new ObjectMapper();

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //Content-Type: application/json
        response.setContentType("application/json");
        response.setCharacterEncoding("utf-8");

        final HelloData helloData = new HelloData();
        helloData.setUsername("kim");
        helloData.setAge(20);

        final String result = objectMapper.writeValueAsString(helloData);
        response.getWriter().write(result);
    }
}
