package com.example.demo.portfolio;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyPortfolio {

    @GetMapping("/mySelf")
    public String mySelf() {
        return """
                <html>
                <body>
                    
                    <p>
                    Hi, I am <b>Rishabh Kumar Singh</b>, a Computer Science Engineering student
                    passionate about Java Full Stack Development, Machine Learning, and Problem Solving.
                    I enjoy building scalable web applications using Spring Boot and React.
                    </p>

                    <h2>Profiles</h2>
                    <ul>
                        <li>GitHub: https://github.com/your-github</li>
                        <li>LeetCode: https://leetcode.com/your-profile</li>
                    </ul>

                </body>
                </html>
                """;
    }

    @GetMapping("/mySkill")
    public String mySkill() {
        return """
                <html>
                <body>
                    

                    <h2>Programming Languages</h2>
                    <ul>
                        <li>Java</li>
                        <li>Python</li>
                        <li>SQL</li>
                    </ul>

                    <h2>Backend</h2>
                    <ul>
                        <li>Spring Boot</li>
                        <li>Spring MVC</li>
                        <li>Spring Data JPA</li>
                        <li>Spring Security</li>
                        <li>REST APIs</li>
                    </ul>

                    <h2>Frontend</h2>
                    

                    <h2>Database</h2>
                    <a href="/mySelf">Home</a>
                </body>
                </html>
                """;
    }

    @GetMapping("/education")
    public String education() {
        return """
                <html>
                <body>
                    <table border="1" cellpadding="10">
                        <tr>
                            <th>Qualification</th>
                          
                            <th>Year</th>
                        </tr>
                        <tr>
                            <td>B.Tech (Computer Science Engineering)</td>
                            <td>LPU</td>
                            <td>2023 - 2027</td>
                           
                        </tr>

                      

                    <a href="/mySelf">Home</a>
                </body>
                </html>
                """;
    }

}