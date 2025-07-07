package br.com.meli.springdataexercicio.controller;

import br.com.meli.springdataexercicio.dto.AtletaSummaryDto;
import br.com.meli.springdataexercicio.dto.TimeResponseDto;
import br.com.meli.springdataexercicio.entity.Time;
import br.com.meli.springdataexercicio.repository.TimeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/times")
public class TimeController {

    @Autowired
    private TimeRepository timeRepository;

    @GetMapping
    public List<TimeResponseDto> listarTodos() {
        return timeRepository.findAll().stream().map(time -> {
            List<AtletaSummaryDto> atletas = time.getAtletas().stream().map(a ->
                    new AtletaSummaryDto(a.getId(), a.getNome(), a.getPosicao())
            ).collect(Collectors.toList());
            return new TimeResponseDto(
                    time.getId(),
                    time.getNome(),
                    time.getPais(),
                    time.getFundacao(),
                    atletas
            );
        }).collect(Collectors.toList());
    }


    @PostMapping
    public Time inserirTime(@RequestBody Time time) {
        return timeRepository.save(time);
    }
}
