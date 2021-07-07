import javax.swing.JOptionPane;

public class Ejercicio12 {

	public static void main(String[] args) {
		//Declaración variables
		String contr = "contraseña";
		String contra = JOptionPane.showInputDialog("Introduce la contraseña");
		int cont = 0;
		
		for (cont = 0; cont < 3; cont++) {
			if (contra.equals(contr)) {
				JOptionPane.showMessageDialog(null, "Enhorabuena");
				cont = 3;
			}else {
				contra = JOptionPane.showInputDialog("Introduce la contraseña");
			}
		}
	}

}
