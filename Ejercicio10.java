import javax.swing.JOptionPane;

public class Ejercicio10 {

	public static void main(String[] args) {
		//Declaraci�n variables
		String num = JOptionPane.showInputDialog("Introduce una cantidad");
		int nventas = Integer.parseInt(num);
		int cont = 0;
		int total = 0;
		
		//Bucle para comprobar
		while (cont < nventas) {
			cont++;
			
		//Introduce los numeros
		String venta = JOptionPane.showInputDialog("Introduce un n�mero");
		int nventa = Integer.parseInt(venta);
		total += nventa; 
		
		}
		System.out.println(total);
		
	}

}
