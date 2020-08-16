package com.ioana.guitar_shop.controller;

import com.ioana.guitar_shop.model.Guitar;
import com.ioana.guitar_shop.service.GuitarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Controller
@CrossOrigin(origins = "*")  // to allow access from any address to the api
public class GuitarController {

    @Autowired
    GuitarService guitarService;


    @GetMapping("/guitars")
    @ResponseBody
    public List<Guitar> getGuitars() {

        return guitarService.getAllGuitars();
    }

    @GetMapping("/guitar/{serialNumber}")
    @ResponseBody
    public Guitar getGuitarById(@PathVariable("serialNumber") String serialNumber) {

        Guitar returnedGuitar =  guitarService.getGuitarById(serialNumber);

        if(returnedGuitar.equals(null)) {

            throw new ResponseStatusException(HttpStatus.NOT_FOUND);

        }

        return returnedGuitar;
    }

//    @GetMapping("/error")
//    public ResponseEntity getError(HttpServletResponse res) {
//
//        res.setStatus(404);
//
//        return null;
//    }


    @PostMapping("/guitar")
    public Guitar addGuitar(@RequestBody Guitar guitar) {

        guitarService.addGuitar(guitar);

        return guitar;
    }

    @DeleteMapping("/delete/{serialNumber}")
    @ResponseBody
    public String deleteGuitarById(@PathVariable("serialNumber") String serialNumber) {

        guitarService.deleteGuitarById(serialNumber);

        return "Guitar deleted";
    }

//    @PutMapping("/update_guitar")
//    public Guitar saveOrUpdateGuitar(@RequestBody Guitar guitar) {
//
//        guitarService.addGuitar(guitar);
//
//        return guitar;
//    }


}
