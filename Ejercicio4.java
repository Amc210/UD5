import javax.swing.JOptionPane;

public class Ejercicio4 {

	public static void main(String[] args) {
		//Declaración variables
		String num = JOptionPane.showInputDialog("Introduce el numero");
		double radio = Double.parseDouble(num);
		
		//Calculamos el radio y lo mostramos
		System.out.println(Math.PI * Math.pow(radio, 2));

	}

}
