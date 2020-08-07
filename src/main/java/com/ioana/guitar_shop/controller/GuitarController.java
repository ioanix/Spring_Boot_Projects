package com.ioana.guitar_shop.controller;

import com.ioana.guitar_shop.model.Guitar;
import com.ioana.guitar_shop.service.GuitarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GuitarController {

    @Autowired
    GuitarService guitarService;


    @GetMapping("/guitars")
    public List<Guitar> getGuitars() {

        return guitarService.getAllGuitars();
    }

    @PostMapping("/guitar")
    public Guitar addGuitar(@RequestBody Guitar guitar) {

        guitarService.addGuitar(guitar);

        return guitar;
    }

    @GetMapping("/")
    public String shoeHomePage() {

        return "index";
    }
}
