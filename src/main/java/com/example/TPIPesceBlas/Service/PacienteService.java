package com.example.TPIPesceBlas.Service;

import com.example.TPIPesceBlas.Model.Paciente;
import com.example.TPIPesceBlas.Repository.PacienteRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class PacienteService {
    private final PacienteRepository repo;
    public Paciente addPaciente(Paciente p) {
        return repo.save(p);
    }
    public List<Paciente> listPacientes() {
        return repo.findAll();
    }
    public Paciente modifyPaciente(Paciente p) {
        return repo.save(p);
    }
    public void deletePaciente(Integer dni) {repo.deleteById(dni);}
    public Optional<Paciente> searchPaciente(Integer dni) {return repo.findById(dni);}
}
