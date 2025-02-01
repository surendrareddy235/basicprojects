package com.projects.springbootproject6;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloJavaController {

    @GetMapping("/")
    public String showIndex() {
        return "index"; // Renders index.html
    }

    @GetMapping("/submitform")
    public String showSubmitForm(@RequestParam String name, @RequestParam String email, Model model) {
        model.addAttribute("name", name);
        model.addAttribute("email", email);
        return "welcome"; // Renders welcome.html
    }
}