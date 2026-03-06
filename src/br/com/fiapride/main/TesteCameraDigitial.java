package br.com.fiapride.main;
import br.com.fiapride.model.CameraDigital;

public class TesteCameraDigitial {

	public static void main(String[] args) {
	
		CameraDigital camera1 = new CameraDigital("Nikon", "Modelo 2.0", 10);
		System.out.println("Tirando fotos na camera 1");
		camera1.tirarFoto(1);
			
		CameraDigital camera2 = new CameraDigital("Sony", "Modelo 6.0", 10);
		System.out.println("Gravando video na camera 2");
		camera2.gravarVideo(20);
		
		System.out.println("Camera 1: " +camera1.getMarca() + "| Modelo: " + camera1.getNomeModelo() + "| Memoria: " + camera1.getMemoria());
		System.out.println("Camera 2: " +camera2.getMarca() + "| Modelo: " + camera2.getNomeModelo() + "| Memoria: " + camera2.getMemoria());
		
		// Tentando hackear o sistema
		camera1.memoria = 15;
		// The field CameraDigital.memoria is not visible

	}

}
