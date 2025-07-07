package br.com.meli.springdataexercicio.dto;

import java.time.LocalDate;

public class TimeSummaryDto {
    private Long id;
    private String nome;
    private String pais;
    private LocalDate fundacao;

    public TimeSummaryDto(Long id, String nome, String pais, LocalDate fundacao) {
        this.id = id;
        this.nome = nome;
        this.pais = pais;
        this.fundacao = fundacao;
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
}
