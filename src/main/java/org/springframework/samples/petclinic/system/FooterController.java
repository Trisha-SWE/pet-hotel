package org.springframework.samples.petclinic.system;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FooterController {

    @GetMapping("/footer")
    public String footer(Model model) {
        model.addAttribute("email", "Trisha292@diu.edu.bd");
        model.addAttribute("phone", "+8801900-000000");
        model.addAttribute("developer", "Rukaiya Akter Trisha");
        model.addAttribute("developerGithub", "https://github.com/Trisha-SWE");
        return "footer";
    }
}
