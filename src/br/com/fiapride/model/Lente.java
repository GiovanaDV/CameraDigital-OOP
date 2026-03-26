package br.com.fiapride.model;

public class Lente {
	private String marca;
	private String tipoLente;
	
	public Lente(String marca, String tipoLente) {
		this.marca = marca;
		this.tipoLente = tipoLente;
	}
	
	public void exibirResumo() {
		System.out.println("Resumo Lente");
		System.out.println("Marca: " + this.marca + "Tipo Lente: " + this.tipoLente);
	
		
	
	}
	
	public String getMarca() {
		return this.marca;
	}
	
	public String getTipoLente() {
		return this.tipoLente;
	}
	
	

}
