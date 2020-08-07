package com.ioana.guitar_shop.controller;

import com.ioana.guitar_shop.model.Guitar;
import com.ioana.guitar_shop.service.GuitarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class GuitarController {

    @Autowired
    GuitarService guitarService;


    @GetMapping("/guitars")
    @ResponseBody
    public List<Guitar> getGuitars() {

        return guitarService.getAllGuitars();
    }

    @GetMapping("/guitars/{serialNumber}")
    @ResponseBody
    public Guitar getGuitarById(@PathVariable("serialNumber") String serialNumber) {

        return guitarService.getGuitarById(serialNumber);
    }

    @PostMapping("/guitar")
    public Guitar addGuitar(@RequestBody Guitar guitar) {

        guitarService.addGuitar(guitar);

        return guitar;
    }



//    @GetMapping("/")
//    public String shoeHomePage() {
//
//        return "index";
//    }
}
