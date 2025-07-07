package br.com.meli.springdataexercicio.dto;

public class AtletaResponseDto {

    private Long id;
    private String nome;
    private String posicao;
    private TimeSummaryDto time;

    public AtletaResponseDto(Long id, String nome, String posicao, TimeSummaryDto time) {
        this.id = id;
        this.nome = nome;
        this.posicao = posicao;
        this.time = time;
    }

    public TimeSummaryDto getTime() {
        return time;
    }

    public void setTime(TimeSummaryDto time) {
        this.time = time;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
