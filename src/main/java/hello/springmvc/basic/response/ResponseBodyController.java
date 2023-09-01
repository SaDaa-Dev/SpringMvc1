package hello.springmvc.basic.response;

import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller
public class ResponseBodyController {
    @GetMapping("/response-body-v1")
    public HttpEntity<String> responseBodyV1(HttpServletResponse response){
        return new ResponseEntity<>("ok", HttpStatus.OK);
    }
}
