package com.gabara.complaintservices.controllers;

import com.gabara.complaintservices.repositories.ComplaintRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class ComplaintController {

    private ComplaintRepository complaintRepository;

    public ComplaintController(ComplaintRepository complaintRepository) {
        this.complaintRepository = complaintRepository;
    }

    @GetMapping("/hello")
    public String index(@RequestParam(name = "name", required = false, defaultValue = "") String name, Model model) {
        model.addAttribute("name", name);
        return "Hi, " + model.toString();
    }

    @GetMapping("/complaints")
    public String getComplaints(Model model) {
        model.addAttribute("complaints", complaintRepository.findAll());

        return "complaints";
    }
}
