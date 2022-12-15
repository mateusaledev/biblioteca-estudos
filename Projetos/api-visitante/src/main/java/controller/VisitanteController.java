package controller;


import dto.VisitanteRequestDto;
import entity.Visitante;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import service.VisitanteService;

@RestController
@RequestMapping("/visitantes")
@RequiredArgsConstructor
public class VisitanteController {

    private final VisitanteService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Visitante criar(@RequestBody VisitanteRequestDto dto){
        return service.criar(dto);
    }
}
