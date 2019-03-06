package dam.iesvdc.ejercicios;

//package excepciones;

import java.util.Scanner;

public class TestTriangle {
	public static void main ( String [] args) {
		Scanner sc = new Scanner (System.in);
		do {
		System.out.println("Introduce el primer lado");
		String side1 = sc.next();
		System.out.println("Introduce el segundo lado");
		String side2 = sc.next();
		System.out.println("Introduce el tercer lado");
		String side3 = sc.next();
		
		if (!side1.matches("[0-9]+") || !side2.matches("[0-9]+") || !side3.matches("[0-9]+")){
			System.out.println("Asegurate de introducir numeros, alguno de los datos no es válido");
			
		} 
			int iside1 = Integer.parseInt (side1);
			int iside2 = Integer.parseInt (side2);
			int iside3 = Integer.parseInt (side3);
			try {
				Triangle triangle = new Triangle (iside1,iside2,iside3);
				printTriangle(triangle);
			} catch (IlegalTrianguloException e){
				System.out.println("Lados no válidos");
			}
		} while (Triangle.numberOfTriangles <5);
		sc.close();
	}
	public static void printTriangle (Triangle triangle) {
		System.out.println(triangle);
	}
}
