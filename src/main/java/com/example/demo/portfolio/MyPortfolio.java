package com.example.demo.portfolio;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyPortfolio {

    @GetMapping("/mySelf")
    public String mySelf(){
        return """
                    <h1> MySelf</h1>
                    <p> simple line about yourself </p>
                    <ul> 
                    <li>gitHub Link</li>
                    <li>Leetcode</li>
                    </ul>
                    """;
    }
}
