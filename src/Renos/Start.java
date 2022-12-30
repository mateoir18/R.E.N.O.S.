package Renos;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Robot robot1 = new Robot("R2-D2");
		robot1.getPuntosDeVida();
		robot1.getAtaque();
		robot1.getDefensa();
		
		System.out.println(robot1);
		
		
		
		
		
		Robot robot2 = new Robot("C-3PO");
		robot2.getPuntosDeVida();
		robot2.getAtaque();
		robot2.getDefensa();
		
		System.out.println(robot2);
		
	}

}
