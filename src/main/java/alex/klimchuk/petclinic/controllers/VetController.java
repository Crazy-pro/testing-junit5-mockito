package alex.klimchuk.petclinic.controllers;

import alex.klimchuk.petclinic.fauxspring.Model;
import alex.klimchuk.petclinic.services.VetService;

public class VetController {

    private final VetService vetService;

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }

    public String listVets(Model model) {

        model.addAttribute("vets", vetService.findAll());

        return "vets/index";
    }
}
