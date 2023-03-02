package co.develhope.deploy2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@RequestMapping("/sum")
public class BasicController {

    @GetMapping("/random")
    public Integer sumRandom(){
        Random rand = new Random();
        int x = rand.nextInt();
        int y = rand.nextInt();
        return x + y;
    }
}