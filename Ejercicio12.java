import javax.swing.JOptionPane;

public class Ejercicio12 {

	public static void main(String[] args) {
		//Declaraci�n variables
		String contr = "contrase�a";
		String contra = JOptionPane.showInputDialog("Introduce la contrase�a");
		int cont = 0;
		
		for (cont = 0; cont < 3; cont++) {
			if (contra.equals(contr)) {
				JOptionPane.showMessageDialog(null, "Enhorabuena");
				cont = 3;
			}else {
				contra = JOptionPane.showInputDialog("Introduce la contrase�a");
			}
		}
	}

}
