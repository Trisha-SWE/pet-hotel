package org.springframework.samples.petclinic.system;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

@ControllerAdvice
public class GlobalControllerAdvice {

    @ModelAttribute
    public void addGlobalAttributes(Model model) {
        model.addAttribute("address", "S-292, Daffodil, Dhaka");
        model.addAttribute("phone", "+8801900-000000");
        model.addAttribute("developer", "Rukaiya Akter Trisha");
        model.addAttribute("developerGithub", "https://github.com/Trisha-SWE");
    }
}
