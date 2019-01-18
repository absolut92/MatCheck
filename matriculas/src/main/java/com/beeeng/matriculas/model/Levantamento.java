package com.beeeng.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Levantamento")
public class Levantamento {
	
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	 int userId;
	 String matricula;
	 String nome;
	 String apelido;
	 int data;
	 int dataSaida;
	 int dataChegada;
	 int km;
	 float combustivel;
	 boolean aprovacao;
	 
	 
//	public Levantamento(String matricula, String nome, String apelido, int data, int dataSaida, int dataChegada,
//			int km, float combustivel, boolean aprovacao) {
//		super();
//		this.matricula = matricula;
//		this.nome = nome;
//		this.apelido = apelido;
//		this.data = data;
//		this.dataSaida = dataSaida;
//		this.dataChegada = dataChegada;
//		this.km = km;
//		this.combustivel = combustivel;
//		this.aprovacao = aprovacao;
//	}
//	
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String dataMatricula) {
		this.matricula = dataMatricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getApelido() {
		return apelido;
	}
	public void setApelido(String apelido) {
		this.apelido = apelido;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public int getDataSaida() {
		return dataSaida;
	}
	public void setDataSaida(int dataSaida) {
		this.dataSaida = dataSaida;
	}
	public int getHoraChegada() {
		return dataChegada;
	}
	public void setHoraChegada(int dataChegada) {
		this.dataChegada = dataChegada;
	}
	public int getKm() {
		return km;
	}
	public void setKm(int km) {
		this.km = km;
	}
	public float getCombustivel() {
		return combustivel;
	}
	public void setCombustivel(float combustivel) {
		this.combustivel = combustivel;
	}
	public boolean isAprovacao() {
		return aprovacao;
	}
	public void setAprovacao(boolean aprovacao) {
		this.aprovacao = aprovacao;
	}


	@Override
	public String toString() {
		return "Gestao [userId=" + userId + ", matricula=" + matricula + ", nome=" + nome + ", apelido=" + apelido
				+ ", data=" + data + ", dataSaida=" + dataSaida + ", dataChegada=" + dataChegada + ", km=" + km
				+ ", combustivel=" + combustivel + ", aprovacao=" + aprovacao + "]";
	}
	 
	 



}



