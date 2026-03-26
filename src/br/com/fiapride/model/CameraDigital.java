package br.com.fiapride.model;

public class CameraDigital {
	
	//ENCAPSULAMENTO
	private String marca;
	private String modelo;
	private double memoria;
	
	//Atributo de associação
	private Lente lente;

	//CONSTRUTOR
	public CameraDigital(String marca, String modelo, double memoria, Lente lente) {
		this.marca = marca;
		this.modelo = modelo;
		this.setMemoria(memoria);  //único que pode mudar (set privado)
		this.lente = lente;
		System.out.println("Registro inicial - Marca: " + this.marca + " Modelo: " + this.modelo + " Memória: " + this.memoria + "Lente" + this.lente);
	}
	
	//GETTERS
	public String getMarca() {
		return this.marca;
	}
	
	public String getModelo() {
		return this.modelo;
	}
	
	public double getMemoria() {
		return this.memoria;
	}
	
	public Lente getLente() {
		return this.lente;
	}
	
	// COMPORTAMENTO PÚBLICO
	// consumo de memoria
	public void tirarFoto(double foto) {
		if (foto == 0) {
			System.out.println("Tecle 1 para tirar foto!");
			return;
		}
		if (foto == 1) {
			this.memoria += 5.0;
			System.out.println("Foto tirada com sucesso! Sua memoria é: " + this.memoria);
		}
			
		}
	
	public void gravarVideo(double tempo) {
		if (tempo > 15.0) {
			System.out.println("Vídeo maior que 15 minutos!");
			return;
		}
		if (tempo < 15.0) {
			this.memoria += 6.0;
			System.out.println("Vídeo gravado com sucesso! Sua memoria é: " + this.memoria);
		}
	}
	
	//SETTERS (apenas memoria - unica que muda de valor)
	private void setMemoria(double memoria) {
		if (memoria < 0) {
			System.out.println("Memória não pode ser negativa!");
			return;
		}
		
		this.memoria = memoria;
	}
	
	
}


