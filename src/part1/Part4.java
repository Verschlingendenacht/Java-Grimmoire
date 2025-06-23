package part1;

import javax.swing.JOptionPane;

public class Part4 {
	public static void master() {
		
		String name = JOptionPane.showInputDialog("Ingresa tu nombre");
		
		JOptionPane.showMessageDialog(null, "Tu nombre es: "+name);
		
		int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu edad"));
		
		JOptionPane.showMessageDialog(null, "Tu edad es: "+edad);
		
		double estatura = Double.parseDouble( JOptionPane.showInputDialog("Ingresa tu estatura"));
		
		JOptionPane.showMessageDialog(null, "Tu estatura es: "+ estatura);
		
	};
}
