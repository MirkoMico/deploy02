package co.develhope.deploy2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {
    @GetMapping
    public int get(){
        int a = (int) Math.random();
        int b = (int) Math.random();
        int c= a+b;
        return c;
    }
}