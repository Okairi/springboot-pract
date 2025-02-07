package cursoSpringBoot.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldRestController {


@GetMapping("/deyvis")
public String helloWorld (){

    return "Deyvis se la come";
}



}
