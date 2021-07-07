
public class Ejercicio9 {

	public static void main(String[] args) {
		//Declaración variable i asignacion valor
				int num = 0;
				
				//Bucle del 1 al 100 mostrando los que son divisibles entre 2 y 3
				System.out.println("Numeros del 1 al 100 divisibles entre 2 y 3");
				while (num < 100) {
					num++;
					if(num % 2 == 0 && num % 3 == 0) {
						System.out.println(num);
					}
				}

	}

}
