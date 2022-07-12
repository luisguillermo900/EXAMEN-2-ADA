
public class Prueba {

	public static Rubik rubik;
	public static void main (String[]args) {

		System.out.println("Pruebas Rubik");
		System.out.println("**************");
		prueba1();
		prueba2();
		prueba3();
		prueba4();
		prueba5();

	}

	private static void prueba1() {
		rubik = new Rubik();
		String T[] = {"arriba","derecha","rotizquierda","abajo","abajo","abajo"};
		String K[] = {"arriba","rotderecha","rotizquierda","abajo","arriba","abajo"};
		String p1= rubik.resolver(T, K) ;
		System.out.println("Prueba 1: "+p1);
	}


	private static void prueba2() {
		rubik = new Rubik();
		String T[] = {"derecha","abajo","izquierda","arriba","abajo","rotizquierda","rotizquierda","rotderecha"};
		String K[] = {"derecha","arriba","izquierda","arriba","abajo"};
		String p2= rubik.resolver(T, K) ;
		System.out.println("Prueba 2: "+p2);
	}


	private static void prueba3() {	
		rubik = new Rubik();
		String T[] = {"arriba","abajo","derecha","izquierda","rotderecha","rotizquierda"};
		String K[] = {"derecha","arriba","derecha","arriba","derecha","arriba","derecha","arriba","derecha","arriba","derecha","arriba"};
		String p3= rubik.resolver(T, K) ;
		System.out.println("Prueba 3: "+p3);
	}


	private static void prueba4() {	
		rubik = new Rubik();
		String T[] = {"arriba","abajo"};
		String K[] = {"arriba","abajo","arriba","abajo"};
		String p4= rubik.resolver(T, K) ;
		System.out.println("Prueba 4: "+p4);
	}

	private static void prueba5() {
		rubik = new Rubik();
		String T[] = {"arriba","abajo","arriba","abajo"};
		String K[] = {"arriba","rotizquierda"};
		String p5= rubik.resolver(T, K) ;
		System.out.println("Prueba 5: "+p5);
	}

}
