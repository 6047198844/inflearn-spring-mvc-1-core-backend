package hello.inflearnspringmvc1corebackend.basic.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

@WebServlet(name = "requestHeaderServlet", urlPatterns = "/request-header")
public class RequestHeaderServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        printHeaders(request);
    }

    private void printHeaders(HttpServletRequest request) {
        System.out.println("--- Headers - start ---");

//        final Enumeration<String> headerNames = request.getHeaderNames();
//        while (headerNames.hasMoreElements()) {
//            final String headerName = headerNames.nextElement();
//            System.out.println(headerName + ": " + headerName);
//        }

        request.getHeaderNames().asIterator()
                        .forEachRemaining(headerName -> System.out.println("headerName = " + headerName));


        System.out.println("--- Headers - end ---");
        System.out.println();
    }
}
