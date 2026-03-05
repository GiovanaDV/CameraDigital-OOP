package br.com.fiapride.main;
import br.com.fiapride.model.CameraDigital;

public class TesteCameraDigitial {

	public static void main(String[] args) {
	
		CameraDigital camera1 = new CameraDigital("Nikon", "Modelo 2.0", 10);
		System.out.println("Tirando fotos na camera 1");
		camera1.tirarFoto(1);
			
		CameraDigital camera2 = new CameraDigital("Sony", "Modelo 6.0", 0);
		System.out.println("Gravando video na camera 2");
		camera2.gravarVideo(10);
		
		System.out.println("Camera: " +camera1.getMarca() + "| Modelo: " + camera1.getNomeModelo() + "| Memoria: " + camera1.getMemoria());
	
		

	}

}
