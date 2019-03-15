package com.gabara.complaintservices.complaint;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.RequestScope;

@RestController
@RequestMapping("/complaint")
public class ComplaintController {

    @GetMapping
    public String index(@RequestParam(name="name", required=false, defaultValue = "") String name, Model model){
        model.addAttribute("name", name);
        return "Hi, " + model.toString();
    }
}
