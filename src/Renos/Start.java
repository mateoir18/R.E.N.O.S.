package Renos;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Robot robot1 = new Robot();
		robot1.setNombre("R2D2");
		robot1.setPuntosDeVida(50);
		robot1.setAtaque(20);
		robot1.setDefensa(70);
		
		System.out.println(robot1);
		
		
		
		
		Robot robot2 = new Robot();
		robot2.setNombre("C-3PO");
		robot2.setPuntosDeVida(90);
		robot2.setAtaque(11);
		robot2.setDefensa(80);
		
		System.out.println(robot2);

	}

}
