package br.com.fiapride.model;

// Moto também é um Veiculo, mas com atributo próprio
public class Moto extends Veiculo {

	private boolean isEletrica;
	
	public Moto(String placa, String modelo, boolean isEletrica) {
		super(placa, modelo); //repassa pra mae
		this.isEletrica = isEletrica;
	}
	
	public boolean isEletrica() {
		return this.isEletrica;
	

	}
}
