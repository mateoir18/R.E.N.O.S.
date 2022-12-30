package Renos;

	public class Robot {
	
	private String Nombre;
	private int puntosDeVida;
	private int ataque;
	private int defensa;
	
	
	
	public Robot(String Nombre) {

		this.Nombre = Nombre;
	}
	

	
	
	
		
		
		
		
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public int getPuntosDeVida() {
		puntosDeVida=100;
		return puntosDeVida;
	}
	public double getAtaque() {
		ataque = (int) (Math.random()*20);
		return ataque;
	}
	public double getDefensa() {
		defensa = (int) (Math.random()*100);
		return defensa;
	}
	
	
	
	
	
	
	@Override
	public String toString() {
		return "Robots [Nombre=" + Nombre + ", puntosDeVida=" + puntosDeVida + ", ataque=" + ataque + ", defensa="
				+ defensa + "]";
	}
	
	
	
	
	
	
	
	

}
