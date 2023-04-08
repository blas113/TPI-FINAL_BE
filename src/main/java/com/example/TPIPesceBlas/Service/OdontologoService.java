package com.example.TPIPesceBlas.Service;

import com.example.TPIPesceBlas.Model.Odontologo;
import com.example.TPIPesceBlas.Repository.OdontologoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class OdontologoService {
    private final OdontologoRepository repo;
    public Odontologo addOdontologo(Odontologo o) {
        return repo.save(o);
    }
    public List<Odontologo> listOdontologos() {
        return repo.findAll();
    }
    public Odontologo modificarOdontologo(Odontologo o) {
        return repo.save(o);
    }
    public void deleteOdontologo(Integer matricula) {repo.deleteById(matricula);}
    public Optional<Odontologo> searchOdontologo(Integer matricula) {return repo.findById(matricula);}
}
