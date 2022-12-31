package Renos;


public class Robot {
	
	private String Nombre;
	protected int puntosDeVida;
	protected int ataque;
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
	
	
	public void lucha(int ataque, int puntosDeVida, int defensa, int turno, Robot robot1, Robot robot2) {
		while(turno==1) {
			while(robot1.puntosDeVida>0 && robot2.puntosDeVida>0) {
				if(robot1.ataque>robot2.defensa) {
					robot1.ataque -= robot2.puntosDeVida;
					
				}
					
				else if(robot1.ataque<robot2.defensa){
					;
				}
				turno++;
					
			}
					
		}
			while(turno==2) {
				while(robot1.puntosDeVida>0 && robot2.puntosDeVida>0) {
					if(robot2.ataque>robot1.defensa) {
						robot2.ataque -= robot1.puntosDeVida;
						
					}
						
					else if(robot2.ataque<robot1.defensa){
						
					}
				}
			}		
	}
	
	
		
		public int vidaPostBatallarobot1(Robot robot1) {
			return robot1.puntosDeVida;
		}
		public int vidaPostBatallarobot2(Robot robot2) {
			return robot2.puntosDeVida;
		}









		@Override
		public String toString() {
			return "Robot [Nombre=" + Nombre + ", puntosDeVida=" + puntosDeVida + ", ataque=" + ataque + ", defensa="
					+ defensa + "]";
		}
		






	









	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
