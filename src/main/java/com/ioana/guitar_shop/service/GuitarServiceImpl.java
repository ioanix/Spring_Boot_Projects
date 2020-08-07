package com.ioana.guitar_shop.service;

import com.ioana.guitar_shop.model.Guitar;
import com.ioana.guitar_shop.repository.GuitarRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GuitarServiceImpl implements GuitarService {

    @Autowired
    GuitarRepo guitarRepo;

    @Override
    public void addGuitar(Guitar guitar) {

        guitarRepo.save(guitar);

    }

    @Override
    public List<Guitar> getAllGuitars() {

        return guitarRepo.findAll();
    }

    @Override
    public Guitar getGuitarById(String serialNumber) {

        return guitarRepo.findById(serialNumber).orElse(null);
    }

    @Override
    public List<Guitar> getGuitarByBuilder(String builder) {

        return guitarRepo.findByBuilder(builder);
    }

    @Override
    public List<Guitar> getGuitarByModel(String model) {

        return guitarRepo.findByModel(model);
    }

    @Override
    public void deleteGuitarById(String serialNumber) {

        Guitar guitar = guitarRepo.findById(serialNumber).orElse(null);

        if(guitar != null) {

            guitarRepo.delete(guitar);
        }

    }
}
