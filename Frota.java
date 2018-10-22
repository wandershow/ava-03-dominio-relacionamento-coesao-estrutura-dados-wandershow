package ava3;


public class Frota {
	private Onibus[] onibus = new Onibus[100];
	private int cont_onibus = 0;

	public int getQuantidade() {

		return cont_onibus;

	}

	public Onibus getOnibus(int numeroOnibus) {
		for (Onibus o : onibus) {
			if (o != null && o.getNumero() == numeroOnibus) return o;
		}
		return null;
	}

	public Onibus novoOnibus(int numero, int lugares) {
		Onibus o = new Onibus(numero, lugares);
		onibus[cont_onibus] = o;
		cont_onibus++;
		return o;

	}
}