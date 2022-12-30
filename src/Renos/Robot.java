package Renos;

	public class Robot {
	
	private String Nombre;
	private int puntosDeVida;
	private int ataque;
	private int defensa;
	
	
	
		
		
		
		
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public int getPuntosDeVida() {
		return puntosDeVida;
	}
	public void setPuntosDeVida(int puntosDeVida) {
		if(puntosDeVida>=0) {
		this.puntosDeVida = puntosDeVida;
		}
	}
	public double getAtaque() {
		return ataque;
	}
	public void setAtaque(int ataque) {
		if(ataque>=0) {
		this.ataque = ataque;
		}
	}
	public double getDefensa() {
		return defensa;
	}
	public void setDefensa(int defensa) {
		this.defensa = defensa;
	}
	
	
	
	
	
	@Override
	public String toString() {
		return "Robots [Nombre=" + Nombre + ", puntosDeVida=" + puntosDeVida + ", ataque=" + ataque + ", defensa="
				+ defensa + "]";
	}
	
	
	
	
	
	
	
	

}
