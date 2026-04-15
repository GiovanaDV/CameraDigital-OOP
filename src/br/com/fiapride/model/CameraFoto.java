package br.com.fiapride.model;

public class CameraFoto extends CameraDigital {
	private double resolucaoMegaPixels;
	
	public CameraFoto(String marca, String modelo, double memoria, Lente lente,  double resolucaoMegaPixels){
		super(marca, modelo, memoria, lente);
		this.resolucaoMegaPixels = resolucaoMegaPixels;
	}
	
	public double getResolucaoMegaPixels() {
		return this.resolucaoMegaPixels;
	}
	
	public void tirarFoto(double foto) {
		if (foto == 0) {
			System.out.println("Tecle 1 para tirar foto!");
			return;
		}
		if (foto == 1) {
			this.setMemoria(this.getMemoria() + 5.0);
			System.out.println("Foto tirada com sucesso! Sua memoria é: " + this.getMemoria());
		}
			
		}
}
