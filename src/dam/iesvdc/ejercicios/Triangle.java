package dam.iesvdc.ejercicios;

//package excepciones;
	
	public class Triangle {
		public static int numberOfTriangles = 0; //variable de clase
		
		private int side1; //variables de objeto
		private int side2;
		private int side3;
		
		public Triangle(int side1, int side2, int side3) throws IlegalTrianguloException {
			if(isTriangleValid(side1,side2,side3)) {
			this.side1 = side1;
			this.side2 = side2;
			this.side3 = side3;
			numberOfTriangles++;	
			} else {
			throw new IlegalTrianguloException("Problema de desigualdad triangular");
			}	
		}
		public int getSide1() {
			return side1;
		}
		public void setSide1(int side1) {
			this.side1 = side1;
		}
		public int getSide2() {
			return side2;
		}
		public void setSide2(int side2) {
			this.side2 = side2;
		}
		public int getSide3() {
			return side3;
		}
		public void setSide3(int side3) {
			this.side3 = side3;
		}
		
		@Override
		public String toString() {
			return "Triangle [side1=" + side1 + ", side2=" + side2 + ", side3=" + side3 + "]";
		}
		public boolean isTriangleValid (int a,int b, int c) {
			if (side1 + side2 < side3 || side2 + side3 < side1 || side1 + side3 < side2) {
			return false;
			} else return true;
			
		}
		/*public static void main (String [] args) {
		try {
			Triangle triangle = new Triangle(4,3,10);
			
		} catch (IlegalTrianguloException e) {
			System.out.println("Lados no válidos");
		}*/
		
	}
		
	
