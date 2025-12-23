package fi15ae.kw52.tag2.spring;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HeathCheckerController {


  @GetMapping("/health")
  public String health() {
    return "Irgendwas worauf wir lust haben als JSON String";
  }

}
