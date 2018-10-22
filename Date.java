package ava3;

public class Date {
	private int dia;
	private int mes;
	private int ano;

	public Date(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		
	}

	@Override
	public String toString() {
		return   dia + "/" + mes + "/" + ano;
	}
	

}
