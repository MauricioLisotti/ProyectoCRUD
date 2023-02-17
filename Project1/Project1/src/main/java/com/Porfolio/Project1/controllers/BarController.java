package com.Porfolio.Project1.controllers;

import com.Porfolio.Project1.model.Bar;

import java.util.List;
import java.util.Optional;

public interface BarController {

    public List<Bar> getBar();

    public Optional<Bar> getBarById(Long id);

    public Bar addBar(Bar bar);

    public String deleteBar(Long id);

    public String updateBar(Bar barNew);

    public String test();

}
