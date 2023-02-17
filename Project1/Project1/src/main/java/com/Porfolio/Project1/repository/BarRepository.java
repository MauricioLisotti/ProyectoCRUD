package com.Porfolio.Project1.repository;

import com.Porfolio.Project1.model.Bar;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BarRepository extends JpaRepository<Bar, Long> {

    Void save(Optional<Bar> barToUpdate);

}
