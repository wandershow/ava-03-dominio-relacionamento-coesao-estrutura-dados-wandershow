package ava3;

public class Passagem {
	
	private Viagem viagem;
	private int numeroAssento;
	private int numeroPassageiro;
	private boolean disponivel = true;
	
	
	public Passagem(Viagem viagem, int numeroAssento ) {
		this.viagem = viagem;
		this.numeroAssento = numeroAssento;
		
	}

	public String getCodigo() {
		String c = "00000" + viagem.getCodigo() + "." + "00000" + numeroPassageiro + "." + numeroAssento;
		return c;
	}

	public boolean isDisponivel() {
		return disponivel;
		
	}

	public int getAssento() {
		
		return this.numeroAssento;
	}

	public void comprar() {
		if (!this.isDisponivel() ) throw new AssentoIndisponivelException();
		disponivel = false ;
		numeroPassageiro = viagem.cont_pass++;
		
		
		
	}

	@Override
	public String toString() {
		return getCodigo();
	}
	
	

}
