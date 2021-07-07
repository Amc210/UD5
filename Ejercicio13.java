import javax.swing.JOptionPane;

public class Ejercicio13 {

	public static void main(String[] args) {
		//Declaración de variables
		String n1 = JOptionPane.showInputDialog("Numero 1: ");
		int num1 = Integer.parseInt(n1);
		String n2 = JOptionPane.showInputDialog("Numero 2: ");
		int num2 = Integer.parseInt(n2);
		String signo = JOptionPane.showInputDialog("Introduce el signo de la operacion: ");
		double total = 0;
		
		switch (signo) {
		case "+": 
			total = num1 + num2;
			break;
		case "-": 
			total = num1 - num2;
			break;
		case "*": 
			total = num1 * num2;
			break;
		case "/": 
			total = num1 / num2;
			break;
		case "^": 
			total = Math.pow(num1, num2);
			break;
		case "%": 
			total = num1 % num2;
			break;
		default:
			System.out.println("ERROR!!");
		}
		JOptionPane.showMessageDialog(null, total);
	}

}
