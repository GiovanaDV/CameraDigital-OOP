package br.com.fiapride.model;

public class CameraDigital {
	private String marca;
	private String nomeModelo;
	private double memoria;

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
	
	public CameraDigital(String marca, String nomeModelo, double memoria) {
		this.setMarca(marca);
		this.setNomeModelo(nomeModelo);
		this.setMemoria(memoria); 
	}
	
	public String getMarca() {
		return this.marca;
	}
	
	private void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getNomeModelo() {
		return this.nomeModelo;
	}
	
	private void setNomeModelo(String nomeModelo) {
		this.nomeModelo = nomeModelo;
	}
	
	public double getMemoria() {
		return this.memoria;
	}
	
	private void setMemoria(double memoria) {
		if (memoria < 0) {
			System.out.println("Memória não pode ser negativa!");
			return;
		}
		
		this.memoria = memoria;
	}
	
	
	
	
}


