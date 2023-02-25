import java.util.Scanner;

public class BuscaMinasArray {
	
	/*
	 * BUSCAMINAS
		•Programa que
		• Cree un grid de 3 x 4
		• Después el usuario deberá ir indicando posiciones intentando no encontrar los *.
		• Se puede ayudar al ususario indicando cuantos * hay a su alrededor.
	 */

	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String [][] mina = {
				{"*", "3", "5", "*"},
				{"*", "*", "*", "1"},
				{"23", "*", "*", "2"},

		};
		// Variable para controlar el bucle
		boolean control = false;
		
		System.out.println("Juego realizado por: Antonio Ruiz Benito.");
		System.out.println(); // Añado un salto de linea
		System.out.println("Bienvenido al buscaminas modo array!!! Comencemos el juego.");
		
		System.out.println("Indica tu nombre de usuario:");
		String usuario = sc.nextLine();
		
		do {
			System.out.println(usuario + " indica las coordenadas del eje x entre el número 0 y el 2:");
			int ejeX = sc.nextInt();
			
			System.out.println(usuario + " indica las coordenadas del eje y entre el número 0 y el 4:");
			int ejeY = sc.nextInt();
			
			System.out.println(); // Añado un salto de linea
			
			// Guardo la posicion introducida por el usuario en una variable
			String usuarioBusca = mina[ejeX][ejeY]; 
			// Comparo si la posicion elegida contiene una mina " * "
			if (usuarioBusca == "*") {
				System.out.println("Undidoooo, vuelve a intentarlo " + usuario + " => " + usuarioBusca);
				System.out.println(); // Añado un salto de linea
				// Variable para contar los * adyacentes
				int contador = 0; 
				// Recorro la posiciones x
				for (int i = ejeX -1; i <= ejeX +1; i++) {
					// Recorro las posiciones y
					for (int e = ejeY -1; e <= ejeY +1; e++) {
						// Verifico que la posicion adyacente este dentro de los limites de array
						if (i >= 0 && e >= 0 && i < mina.length && e < mina[0].length) {
							// Verifico si la posicion adyacente contiene una mina " * "
							if (mina[i][e].equals("*")) {
								// Si la posicion adyacente tiene una mina, incrementa el contador
								contador++;
							}
						}
					}
				}
				// Aviso al usuario y le muestro el numero de minas que hay a su alrrededor
				System.out.println(usuario + " cuidado tienes " + contador + " minas a tu alrrededor!!!");
				System.out.println(); // Añado un salto de linea
				
			} else {
				System.out.println("Muy bien " + usuario + " => " + usuarioBusca);
				System.out.println(); // Añado un salto de linea
				
				int contador = 0;
				
				for (int i = ejeX -1; i <= ejeX +1; i++) {
					for (int e = ejeY -1; e <= ejeY +1; e++) {
						if (i >= 0 && e >= 0 && i < mina.length && e < mina[0].length) {
							if (mina[i][e].equals("*")) {
								contador++;
							}
						}
					}
				}
				
				System.out.println(usuario + " cuidado tienes " + contador + " minas a tu alrrededor!!!");
				System.out.println(); // Añado un salto de linea
				
			}
			
						
		// Mientras la variable control no sea true el bucle continua, en este caso sera un bucle infinito	
		} while(control != true);
				
		
		
	}
	
	
}
