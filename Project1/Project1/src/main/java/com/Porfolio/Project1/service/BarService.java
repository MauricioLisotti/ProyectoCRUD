package com.Porfolio.Project1.service;


import com.Porfolio.Project1.model.Bar;

import java.util.List;
import java.util.Optional;

public interface BarService {

    public List<Bar> findAllBars();

    public Optional<Bar> findBarById(Long id);

    public Bar saveBar(Bar barNew);

    public String deleteBar(Long id);

    public String updateBar(Bar barNew);
}