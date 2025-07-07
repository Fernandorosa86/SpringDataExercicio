package br.com.meli.springdataexercicio.controller;


import br.com.meli.springdataexercicio.dto.AtletaResponseDto;
import br.com.meli.springdataexercicio.dto.TimeSummaryDto;
import br.com.meli.springdataexercicio.entity.Atleta;
import br.com.meli.springdataexercicio.entity.Time;
import br.com.meli.springdataexercicio.repository.AtletaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/atletas")
public class AtletaController {

    @Autowired
    private AtletaRepository atletaRepository;

    @GetMapping
    public List<AtletaResponseDto> listarTodos() {
        return atletaRepository.findAll().stream().map(atleta -> {
            Time time = atleta.getTime();
            TimeSummaryDto timeSummaryDto = new TimeSummaryDto(
                    time.getId(), time.getNome(), time.getPais(), time.getFundacao()
            );
            return new AtletaResponseDto(
                    atleta.getId(),
                    atleta.getNome(),
                    atleta.getPosicao(),
                    timeSummaryDto
            );
        }).collect(Collectors.toList());
    }



    @PostMapping
    public Atleta inserirAtleta(@RequestBody Atleta atleta) {
        return atletaRepository.save(atleta);
    }
}
