package com.RobotMaze.UI;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

//Used to manage User Interface
@Controller
@RequestMapping("/")
public class UIController {

    @GetMapping
    public String index() {
        return "html/index";
    }
}

