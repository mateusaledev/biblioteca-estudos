package service;


import dto.VisitanteRequestDto;
import entity.Visitante;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import repository.VisitanteRepository;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class VisitanteService {

    private final VisitanteRepository repository;

    public Visitante criar(VisitanteRequestDto dto){
        var id = UUID.randomUUID().toString();
        var visitante = new Visitante(id, dto.getCpf(), dto.getNome());
        repository.save(visitante);
        return visitante;
    }
}