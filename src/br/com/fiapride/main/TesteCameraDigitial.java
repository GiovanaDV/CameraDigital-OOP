package br.com.fiapride.main;
import br.com.fiapride.model.CameraDigital;
import br.com.fiapride.model.Lente;

public class TesteCameraDigitial {

	public static void main(String[] args) {
	
		//Atores independentes
		Lente lente1 = new Lente(50, 1.8);
		Lente lente2 = new Lente(18, 8.0);
		
		//Criando Camera, associando com Lente
		CameraDigital camera_lente1 = new CameraDigital("Nikon", "Modelo 2.0", 10, lente1);
		System.out.println("Tirando fotos na camera 1");
		camera_lente1.tirarFoto(1);
		camera_lente1.exibirResumo();
		System.out.println();
			
		CameraDigital camera_lente2 = new CameraDigital("Sony", "Modelo 6.0", 10, lente2);
		camera_lente2.getLente().alterarAbertura(5.6); //testando metodo de Lente
		System.out.println("Gravando video na camera 2");
		camera_lente2.gravarVideo(20);
		camera_lente2.exibirResumo();

	}

}
