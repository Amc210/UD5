import javax.swing.JOptionPane;

public class Ejercicio3 {

	public static void main(String[] args) {
		//Declaramos String 
		String nombre = JOptionPane.showInputDialog("Introduce el nombre");
		JOptionPane.showMessageDialog(null, "Bienvenida/o " + nombre);

	}

}
