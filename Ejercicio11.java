import javax.swing.JOptionPane;

public class Ejercicio11 {

	public static void main(String[] args) {
		//Declaraci�n variables
		String dia = JOptionPane.showInputDialog("Que dia �s?");	
		
		switch (dia) {
			case "Lunes": 
				System.out.println("Es un dia laboral");
				break;
			case "Martes": 
				System.out.println("Es un dia laboral");
				break;
			case "Miercoles": 
				System.out.println("Es un dia laboral");
				break;
			case "Jueves": 
				System.out.println("Es un dia laboral");
				break;
			case "Viernes": 
				System.out.println("Es un dia laboral");
				break;
			case "Sabado": 
				System.out.println("Es un dia NO laboral");
				break;
			case "Domingo": 
				System.out.println("Es un dia NO laboral");
				break;
			default:
				System.out.println("ERROR!!");
		}

	}

}
