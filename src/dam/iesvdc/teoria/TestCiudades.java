package dam.iesvdc.teoria;

import java.util.Scanner;

import javax.swing.JOptionPane;

import dam.iesvdc.excepcionesPropias.CoordenadasNoValidasException;

public class TestCiudades {

	public static void main(String[] args) {
		String nombreCiudad = JOptionPane.showInputDialog(null,"Introduce nombre de ciudad","CIUDAD NOMBRE",JOptionPane.QUESTION_MESSAGE);
		String latitudCiudad = JOptionPane.showInputDialog(null,"Introduce la latitud de la ciudad","CIUDAD LATITUD",JOptionPane.QUESTION_MESSAGE);
		if (!latitudCiudad.matches("^-?[\\d]+[\\.,]\\d+)?")) {
			JOptionPane.showMessageDialog(null,"Latitud no válidas", "ERROR COORDENADAS", JOptionPane.ERROR_MESSAGE);
			return;
		}
		String longitudCiudad = JOptionPane.showInputDialog(null,"Introduce la longitud de la ciudad","CIUDAD LONGITUD",JOptionPane.QUESTION_MESSAGE);
		if (!longitudCiudad.matches("^-?[\\d]+[\\.,]\\d+)?")) {
			JOptionPane.showMessageDialog(null,"Longitud no válidas", "ERROR COORDENADAS", JOptionPane.ERROR_MESSAGE);
			return;
		}
		// Parseamos los datos introducidos para que sean float puesto que el metodo showinputdialog solo devuelve string
		float latitud  = Float.parseFloat(latitudCiudad.replace(",", "."));
		float longitud = Float.parseFloat(longitudCiudad.replace(",", "."));
		try {
			Ciudad ciudad = new Ciudad(nombreCiudad,longitud,latitud);
			//mostrarCiudad();
		} catch (CoordenadasNoValidasException e) {
			JOptionPane.showMessageDialog(null,"Coordenadas no válidas", "ERROR COORDENADAS", JOptionPane.ERROR_MESSAGE);
		}
//		public static void mostrarCiudad (Ciudad ciudad) {
//			System.out.println(ciudad);
//		}
	}

}
