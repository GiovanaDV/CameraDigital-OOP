package br.com.fiapride.model;

public class Lente {
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

}
