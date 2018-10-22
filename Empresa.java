package ava3;

public class Empresa {
	private String nome_empresa;
	private Frota frota = new Frota(); 

	public Empresa(String nome) {
		this.nome_empresa = nome;
	}

	public Frota getFrota() {
	      return frota;		
	}

	public void novoOnibus(int numero, int lugares) {
		this.frota.novoOnibus(numero, lugares);
		
		
	}

}
