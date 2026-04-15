package br.com.fiapride.model;

public class CameraVideo extends CameraDigital{	
	private String resolucaoVideo;
	
	public CameraVideo(String marca, String modelo, double memoria, Lente lente, String resolucaoVideo){
		super(marca, modelo, memoria, lente);
		this.resolucaoVideo = resolucaoVideo;
	}
	
	public String getResolucaoVideo() {
		return this.resolucaoVideo;
	}

	public void gravarVideo(double tempo) {
		if (tempo > 15.0) {
			System.out.println("Vídeo maior que 15 minutos!");
			return;
		}
		if (tempo < 15.0) {
			this.setMemoria(this.getMemoria() + 6.0); 
	        System.out.println("Vídeo gravado com sucesso! Sua memoria é: " + this.getMemoria());
		}
	}
}


