package org.app.viajes.services;

import org.app.viajes.models.entities.Viaje;
import org.app.viajes.repositories.ViajeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("viajes")
public class ViajeService {

    @Autowired
    private ViajeRepository viajeRepository;

    public List<Viaje> getViajes() {
        return viajeRepository.findAll();
    }

    public Viaje addViaje(Viaje v) {
        return viajeRepository.save(v);
    }

    public Optional<Viaje> getById(Long id) {
        return viajeRepository.findById(id);
    }

    public boolean deleteViaje(long id) throws Exception {
        try{
            if(viajeRepository.existsById(id)){
                viajeRepository.deleteById(id);
                return true;
            }else{
                throw new Exception();
            }
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}
