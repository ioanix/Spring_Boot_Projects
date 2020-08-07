package com.ioana.guitar_shop.service;


import com.ioana.guitar_shop.model.Guitar;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface GuitarService {

    void addGuitar(Guitar guitar);

    List<Guitar> getAllGuitars();

    Guitar getGuitarById(String serialNumber);

    List<Guitar> getGuitarByBuilder(String builder);

    List<Guitar> getGuitarByModel(String model);

    void deleteGuitarById(String serialNumber);
}
