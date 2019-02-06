public class Main {

	public static void main(String[] args) {
		
		int numero1,numero2,numero3;
		
		numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero"));
		numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero"));
		numero3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tercer numero"));
		
		if ((numero1 > numero2) && (numero2 > numero3)) {
			JOptionPane.showMessageDialog(null, "El orden de los numeros es"
					+ numero1 +" "+ numero2 + " " + numero3);
		}
		else if ((numero1>numero3) && (numero3>numero2)) {
			JOptionPane.showConfirmDialog(null, "El orden de los numeros es"
					+ numero1+ " " + numero3+ "" +numero2 );
		}
		
		else if ((numero2 > numero1) && (numero1 > numero3 ) ){
			JOptionPane.showConfirmDialog(null, "El orden de los numeros es"
					+ numero2+ " " + numero1+ "" +numero3 );
		}
		else if ((numero2>numero3) && (numero3>numero1)) {
			JOptionPane.showConfirmDialog(null, "El orden de los numeros es"
					+ " " +numero2+ " " +numero3+ " "+numero1);
		}
		
		else if ((numero3>numero1) && (numero1>numero2)) {
			JOptionPane.showConfirmDialog(null, "El orden de los numeros es"
					+ " " +numero3+ " " +numero1+ " "+numero2);
		}
		else {
			JOptionPane.showConfirmDialog(null, "El orden de los numeros es"
					+ " " +numero3+ " " +numero2+ " "+numero1);
		}
		
		
	}
}
