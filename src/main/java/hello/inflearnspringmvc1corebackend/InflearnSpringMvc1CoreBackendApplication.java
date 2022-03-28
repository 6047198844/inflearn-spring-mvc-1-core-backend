package hello.inflearnspringmvc1corebackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan // 서블릿 자동 등록
@SpringBootApplication
public class InflearnSpringMvc1CoreBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(InflearnSpringMvc1CoreBackendApplication.class, args);
    }

}
