import javax.swing.JOptionPane;

public class Ejercicio6 {

	public static void main(String[] args) {
		//Declaraci�n variables
		String num = JOptionPane.showInputDialog("Introduce el precio");
		double precio = Double.parseDouble(num);
		double iva =  0.21;
		
		//Calculamos el iva
		System.out.println(precio + (precio * iva));
	}

}
