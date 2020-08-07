package com.ioana.guitar_shop.repository;


import com.ioana.guitar_shop.model.Guitar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GuitarRepo extends JpaRepository<Guitar, String> {

    List<Guitar> findByBuilder(String builder);

    List<Guitar> findByModel(String model);
}
