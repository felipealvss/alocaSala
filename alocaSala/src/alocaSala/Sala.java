package alocaSala;

public class Sala {

	private boolean alocacao;
	private int capacidade;
	
	//construct
	public Sala(int capacidade) {
		this.setCapacidade(capacidade);
		alocacao = true;
	}
	
	// Get & Set
	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}



	public boolean isAlocacao() {
		return alocacao;
	}
}
