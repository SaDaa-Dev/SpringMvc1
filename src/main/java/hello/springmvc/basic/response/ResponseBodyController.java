package hello.springmvc.basic.response;

import hello.springmvc.basic.HelloData;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@Slf4j
@Controller
public class ResponseBodyController {
    @GetMapping("/response-body-v1")
    public HttpEntity<String> responseBodyV1(HttpServletResponse response){
        return new ResponseEntity<>("ok", HttpStatus.OK);
    }

    @GetMapping("/response-body-v2")
    public String responseBodyV2(HttpServletResponse response){
        return "ok";
    }

    @GetMapping("/response-body-v3")
    public HttpEntity<HelloData> responseBodyV3(){
        HelloData helloData = new HelloData();
        helloData.setUsername("yoyo");
        helloData.setAge(12);

        return new ResponseEntity<>(helloData, HttpStatus.OK);
    }

    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    @GetMapping("/response-body-json-v2")
    public HelloData responseBodyJsonV2(){
        HelloData helloData = new HelloData();
        helloData.setUsername("zz");
        helloData.setAge(12);

        return helloData;
    }
}
