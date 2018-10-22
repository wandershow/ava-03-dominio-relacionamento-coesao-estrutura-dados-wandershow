package ava3;

public class Viagem {
	private String destino;
	private Date data;
	private Time hora;
	private Rodoviaria rodoviaria;
	private int codigo;
	private Passagem[] passagens; // = new Passagem[44];
	int cont_pass = 0;

	public Viagem(int codigo, Rodoviaria rodoviaria, String destino, Date data, Time hora, Onibus onibus) {
		this.destino = destino;
		this.data = data;
		this.hora = hora;
		this.rodoviaria = rodoviaria;
		this.codigo = codigo;
		this.passagens = new Passagem[onibus.getLugares()];
		for (int i = 0; i < passagens.length; i++) {
			passagens[i] = new Passagem(this, i+1);
		}
	}

	public int getCodigo() {

		return codigo;
	}

	public String getOrigem() {

		return rodoviaria.getNome();
	}

	public String getDestino() {

		return this.destino;
	}

	public Object getData() {

		return this.data;
	}

	public Object getHora() {

		return this.hora;
	}

	public int getTotalPassagensDisponiveis() {
		int disponivel = passagens.length - cont_pass;
		return disponivel;
	}

	public int getTotalPassagens() {

		return passagens.length;
	}

	public Passagem comprarPassagem(int numeroAssento) {
		Passagem p =passagens[numeroAssento - 1];
		
		p.comprar();

		return p;
	}
	/*
	 * public Passagem comprarPassagem(int codigo, int numeroAssento) { Passagem p =
	 * new Passagem (codigo, cont_pass+1, numeroAssento); passagens[cont_pass] = p;
	 * cont_pass++;
	 * 
	 * return p; }
	 */

	public Passagem[] getPassagens() {

		return this.passagens;
	}

}
