package org.monopatin.services;

import org.monopatin.entities.Monopatin;
import org.monopatin.repositories.MonopatinRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("monopatines")
public class MonopatinService {
    @Autowired
    private MonopatinRepository monopatinRepository;

    public List<Monopatin> getMonopatines() {
        return monopatinRepository.findAll();
    }

    public Monopatin addMonopatin(Monopatin m) {
        return monopatinRepository.save(m);
    }

    public Optional<Monopatin> getById(Long id) {
        return monopatinRepository.findById(id);
    }

    public boolean deleteMonopatin (Long id) throws Exception {
        try{
            if(monopatinRepository.existsById(id)){
                monopatinRepository.deleteById(id);
                return true;
            } else{
                throw new Exception();
            }
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}
