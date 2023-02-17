package com.Porfolio.Project1.serviceImp;

import com.Porfolio.Project1.model.Bar;
import com.Porfolio.Project1.repository.BarRepository;
import com.Porfolio.Project1.service.BarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BarServiceImp implements BarService {

    @Autowired
    BarRepository barRepository;

    @Override
    public List<Bar> findAllBars() {
        return barRepository.findAll();
    }


    @Override
    public Optional<Bar> findBarById(Long id) {
        Optional<Bar> bar = barRepository.findById(id);
        return bar;
    }

    @Override
    public Bar saveBar(Bar barNew) {
        if (barNew != null) {
            return barRepository.save(barNew);
        }
        return new Bar();
    }

    @Override
    public String deleteBar(Long id) {
        if (barRepository.findById(id).isPresent()) {
            barRepository.deleteById(id);
            return "Bar eliminado correctamente.";
        }
        return "Error! El bar no existe";
    }

    @Override
    public String updateBar(Bar barUpdated) {
        Long num = barUpdated.getIdBar();
        if (barRepository.findById(num).isPresent()) {
            Bar barToUpdate = new Bar();
            barToUpdate.setIdBar(barUpdated.getIdBar());
            barToUpdate.setNombre(barUpdated.getNombre());
            barToUpdate.setTelefono(barUpdated.getTelefono());
            barToUpdate.setDireccion(barUpdated.getDireccion());

            barRepository.save(barToUpdate);
            return "Bar modificado";
        }
        return "Error al modificar el bar";
    }
}
