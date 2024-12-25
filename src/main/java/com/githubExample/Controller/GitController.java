package com.githubExample.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GitController
{
    @GetMapping
    public  String getMessage()
    {
        return "Hllow gitMembers...!!!";
    }
    @GetMapping("/abc")
    public  String getgreet()
    {
        return "Hllow sakshi...!!!";
    }
}
