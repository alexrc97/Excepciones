package dam.iesvdc.ejercicios;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class relanzarExcepciones {

	public static void main(String[] args) {
		String path = "datoss.txt";
		try {
			System.out.println(leerPalabras(path));
		} catch (FileNotFoundException e) {
			System.out.printf("El fichero %s no existe",path);
		}

	}
	public static List<String> leerPalabras (String path) throws FileNotFoundException{
		List <String> lista = new ArrayList<>(); // no puede inicializarse a null porque entonces daria error de ejecucion ya que a una lista nula no  se le puede aplicar ningun metodo
		Scanner sc = new Scanner (new File (path));
		sc.close();
		while (sc.hasNext()) 
			lista.add(sc.next());
		return lista;
	}

}
