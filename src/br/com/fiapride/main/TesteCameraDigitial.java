package br.com.fiapride.main;
import br.com.fiapride.model.CameraDigital;
import br.com.fiapride.model.Lente;

public class TesteCameraDigitial {

	public static void main(String[] args) {
		
		Lente lente1 = new Lente("Canon", "Angular");
		Lente lente2 = new Lente("Nikon", "Angular");
	
		CameraDigital camera1 = new CameraDigital("Nikon", "Modelo 2.0", 10, lente1);
		System.out.println("Tirando fotos na camera 1");
		camera1.tirarFoto(1);
		System.out.println();
			
		CameraDigital camera2 = new CameraDigital("Sony", "Modelo 6.0", 10, lente2);
		System.out.println("Gravando video na camera 2");
		camera2.gravarVideo(20);
	}

}
