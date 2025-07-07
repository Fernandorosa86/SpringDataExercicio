package br.com.meli.springdataexercicio.dto;

import java.time.LocalDate;
import java.util.List;

public class TimeResponseDto {
    private Long id;
    private String nome;
    private String pais;
    private LocalDate fundacao;
    private List<AtletaSummaryDto> atletas;

    public TimeResponseDto(Long id, String nome, String pais, LocalDate fundacao, List<AtletaSummaryDto> atletas) {
        this.id = id;
        this.nome = nome;
        this.pais = pais;
        this.fundacao = fundacao;
        this.atletas = atletas;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public LocalDate getFundacao() {
        return fundacao;
    }

    public void setFundacao(LocalDate fundacao) {
        this.fundacao = fundacao;
    }

    public List<AtletaSummaryDto> getAtletas() {
        return atletas;
    }

    public void setAtletas(List<AtletaSummaryDto> atletas) {
        this.atletas = atletas;
    }
}
