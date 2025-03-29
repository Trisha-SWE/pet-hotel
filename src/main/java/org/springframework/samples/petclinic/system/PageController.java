package org.springframework.samples.petclinic.system;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/about")
    public String about() {
        return "about";
    }
    @GetMapping("/privacy")
    public String privacy() {
        return "privacy";
    }
    @GetMapping("/terms")
    public String terms() {
        return "terms";
    }
    @GetMapping("/contact")
    public String contact() {
        return "contact";
    }
}
