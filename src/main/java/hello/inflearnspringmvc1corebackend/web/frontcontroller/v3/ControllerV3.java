package hello.inflearnspringmvc1corebackend.web.frontcontroller.v3;

import hello.inflearnspringmvc1corebackend.web.frontcontroller.ModelView;

import java.util.Map;

public interface ControllerV3 {
    ModelView process(Map<String, String> paramMap);
}
