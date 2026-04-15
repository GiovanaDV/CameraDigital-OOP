package br.com.fiapride.model;

public class Lente {
<<<<<<< HEAD
	int distanciaFocal;
	double abertura;
	
	public Lente(int distanciaFocal, double abertura) {
		this.distanciaFocal = distanciaFocal;
		this.abertura = abertura;
	}
	 
	 public int getDistanciaFocal() {
		 return this.distanciaFocal;
	 }
	 
	 public double getAbertura() {
		 return this.abertura;
	 }
	 
	 public void alterarAbertura(double novaAbertura) {
	        abertura = novaAbertura;
	        System.out.println("Abertura alterada para: f/" + abertura);
	}
=======
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
	
	
>>>>>>> d91453650b375488d2d7e5e8385783c7abeaed3e

}
