import javax.swing.JOptionPane;

public class Ejercicio5 {

	public static void main(String[] args) {
		//Declaración variables
		String num = JOptionPane.showInputDialog("Introduce el numero");
		int n = Integer.parseInt(num);
		
		if (n % 2 == 0) {
			JOptionPane.showMessageDialog(null, "El numero es divisible entre 2");
		}else {
			JOptionPane.showMessageDialog(null, "El numero NO es divisible entre 2");
		}

	}

}
