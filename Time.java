package ava3;

public class Time {
	
	private int hora;
	private int minutos;
	private int segundos;

	public Time(int hora) {
		this.hora = hora;
		this.minutos = 0;
		this.segundos = 0;
		
	}

	public Time(int hora, int minutos) {
		this.hora = hora;
		this.minutos = minutos;
		this.segundos = 0;
	}
	 
	@Override
	public String toString() {
	    
	    return this.hora + (this.hora < 10 ? "0" : "") + ":" + this.minutos + 
	    		(this.minutos < 10 ? "0" : "") + ":" + this.segundos + (this.segundos < 10 ? "0" : "");
	  
	}
}
