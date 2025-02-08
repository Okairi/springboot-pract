package cursoSpringBoot.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingRestController {


@GetMapping({"/saludo/{name}", "/hola/{name}"})
    public String greeting(@PathVariable String name){
        return "Hola " + name;

    }


    @GetMapping("/palindromo/{key}")
    public String palindromo( @PathVariable String key){


    String wordTemp ="";

        for (int i = key.length()-1; i >=0;i--){
            wordTemp += key.charAt(i);

        }


    if(key.equals(wordTemp)){
        return "Es un palíndromo";
    }else {
        return "No es palíndromo";
    }

    }


}
