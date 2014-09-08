package com.acrof.model;

public class Jogador {
	
	//Dados do jogador
	private String nomeJogador;
	
	//Estatisticas
	private Integer rodadas;
	private Integer vitorias;
	private Integer derrotas;
	private Double average; //Percentual de vit�rias.
	
	public String getNomeJogador() {
		return nomeJogador;
	}
	public void setNomeJogador(String nomeJogador) {
		this.nomeJogador = nomeJogador;
	}
	public Integer getRodadas() {
		return rodadas;
	}
	public void setRodadas(Integer rodadas) {
		this.rodadas = rodadas;
	}
	public Integer getVitorias() {
		return vitorias;
	}
	public void setVitorias(Integer vitorias) {
		this.vitorias = vitorias;
	}
	public Integer getDerrotas() {
		return derrotas;
	}
	public void setDerrotas(Integer derrotas) {
		this.derrotas = derrotas;
	}
	public Double getAverage() {
		return average;
	}
	public void setAverage(Double average) {
		this.average = average;
	}

}
