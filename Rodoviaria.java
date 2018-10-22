package ava3;

public class Rodoviaria {
	private final String nome_rodoviaria;
	private Viagem [] viagens = new Viagem [100];
	private int cont_viagem = 0;
	
	
	

	public Rodoviaria(String nome) {
		 this.nome_rodoviaria = nome; 
		
	}
	

	public String getNome() {
		return nome_rodoviaria;
	}


	public Viagem criarViagem(String destino, Date data, Time hora, Onibus onibus) {
		Viagem v = new Viagem(cont_viagem +1 ,this, destino, data, hora, onibus);
		viagens[cont_viagem] = v;
		cont_viagem++;
		return v;
	}

	public Viagem getViagem(int numero) {
		
		return this.viagens[numero - 1];
	}

	public Passagem comprarPassagem(int numero_viagem, int assento) {
		//Passagem p = new Passagem(viagem, assento);
		//return p;
		Viagem viagem = getViagem(numero_viagem);
		// TODO se viagem null
		return viagem.comprarPassagem(assento);
		
		
		
	}

}
