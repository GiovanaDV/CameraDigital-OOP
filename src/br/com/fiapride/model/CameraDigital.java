package br.com.fiapride.model;

public class CameraDigital {
	
	//ENCAPSULAMENTO
	private String marca;
	private String modelo;
	private double memoria;
	
	//Atributo de Associação (classe Lente)
	private Lente lente;

	//CONSTRUTOR
	public CameraDigital(String marca, String modelo, double memoria, Lente lente) {
		this.marca = marca;
		this.modelo = modelo;
		this.setMemoria(memoria);  //único que pode mudar (set privado)
		this.lente = lente;

		System.out.println("\n -- RESUMO DA CAMERA --");
		System.out.println("Marca: " + this.marca + " Modelo: " + this.modelo + " Memória: " + this.memoria);
	}
	
	public void exibirResumo() {
		System.out.println("\n -- RESUMO DA LENTE --");
		System.out.println("Distancia Focal: " + this.lente.getDistanciaFocal() + " Abertura: " + this.lente.getAbertura());
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
	

	//SETTERS (apenas memoria - unica que muda de valor)
	protected void setMemoria(double memoria) { // mudando de private para protected para assim os metodos gravarVideo e tirarFoto serem usados nas subclasses (faz mais sentido)
		if (memoria < 0) {
			System.out.println("Memória não pode ser negativa!");
			return;
		}
		
		this.memoria = memoria;
	}
	
	
}


