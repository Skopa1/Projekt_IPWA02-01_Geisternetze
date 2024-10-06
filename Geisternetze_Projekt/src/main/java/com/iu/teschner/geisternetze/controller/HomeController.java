package com.iu.teschner.geisternetze.controller;


import com.iu.teschner.geisternetze.model.Netz;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;
import com.iu.teschner.geisternetze.service.NetzService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;


@Controller
@RequestMapping("/home")
public class HomeController {

    @Autowired
    private NetzService netzService;

    @GetMapping
    public String showHomePage(Model model) {
        List<Netz> netze = netzService.findAll();
        model.addAttribute("netze", netze);
        return "home";
    }

    @GetMapping("/add")
    public String addNetzForm(Model model) {
        model.addAttribute("netz", new Netz());
        return "add-netz";
    }

    @PostMapping
    public String createNetz(@ModelAttribute Netz netz) {
        netzService.save(netz);
        return "redirect:/home";
    }

    @GetMapping("/edit/{id}")
    public String editNetzForm(@PathVariable Long id, Model model) {
        Optional<Netz> netz = netzService.findById(id);
        if (netz.isPresent()) {
            model.addAttribute("netz", netz.get());
            return "edit-netz";
        } else {
            return "redirect:/home";
        }
    }

    @PostMapping("/update/{id}")
    public String updateNetz(@PathVariable Long id, @ModelAttribute Netz netzDetails) {
        Netz netz = netzService.findById(id).orElseThrow();
        netz.setKoordinaten(netzDetails.getKoordinaten());
        netz.setStatus(netzDetails.getStatus());
        netz.setSchiffname(netzDetails.getSchiffname());
        netzService.save(netz);
        return "redirect:/home";
    }

    @GetMapping("/delete/{id}")
    public String deleteNetz(@PathVariable Long id) {
        netzService.deleteById(id);
        return "redirect:/home";
    }
}

