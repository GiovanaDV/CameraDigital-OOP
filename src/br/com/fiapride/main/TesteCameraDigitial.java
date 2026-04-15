package br.com.fiapride.main;
import br.com.fiapride.model.Lente;
import br.com.fiapride.model.CameraFoto;
import br.com.fiapride.model.CameraVideo;

public class TesteCameraDigitial {

	public static void main(String[] args) {
		//Atores independentes
		Lente lente1 = new Lente(50, 1.8);
		Lente lente2 = new Lente(18, 8.0);
		
		// Instanciando objs especificos
		CameraFoto foto = new CameraFoto("Nikon", "Modelo 2.0", 10, lente1, 50.0);
		CameraVideo video = new CameraVideo("Sony", "Modelo 6.0", 10, lente2, "220 ss");
		
		//Teste FOTO
		System.out.println("Camera de Foto modelo: " + foto.getModelo() + " Marca: " + foto.getMarca());
		System.out.println("Resolucao Mega Pixels: " + foto.getResolucaoMegaPixels());
		System.out.println("Tirando foto");
		foto.tirarFoto(1);
		
		//Teste VIDEO
		System.out.println("Camera de Video modelo: " + video.getModelo() + " Marca: " + video.getMarca());
		System.out.println("Resolucao do Video: " + video.getResolucaoVideo());
		System.out.println("Gravando video");
		video.gravarVideo(10);
		
		
		
		
		
		

		
	}

}
