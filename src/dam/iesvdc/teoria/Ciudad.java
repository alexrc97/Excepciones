package dam.iesvdc.teoria;

import dam.iesvdc.excepcionesPropias.CoordenadasNoValidasException;

public class Ciudad {

	private String nombreCiudad;
	private float longitud;
	private float latitud;
	


public Ciudad (String nombreCiudad, float latitud,float longitud) throws CoordenadasNoValidasException {
	if (latitud >90 || latitud <-90 ||longitud >180 || longitud <-180 )
		throw new CoordenadasNoValidasException();
	this.latitud = latitud;
	this.longitud = longitud;
	this.nombreCiudad = nombreCiudad;
}
public String getNombreCiudad () {
	return nombreCiudad;
}
public void setNombreCiudad (String nombreCiudad) {
	this.nombreCiudad = nombreCiudad;
}
public float getLatitud () {
	return latitud;
}
public void setLatitud (float latitud) throws CoordenadasNoValidasException {
	if (latitud >90 || latitud <-90) {
		throw new CoordenadasNoValidasException();
	} else {
		this.latitud = latitud;
	}
		
}
public float getLongitud () {
	return longitud;
}
public void setLongitud (float longitud) throws CoordenadasNoValidasException{
	if (longitud >180 || longitud <-180) {
		throw new CoordenadasNoValidasException();
	} else {
		this.longitud = longitud;
	}
}
}



//public static void main (String [] args) {
//	Ciudad = null;
//	try {
//		Ciudad ciudad = new Ciudad ("Jaén",-3.4f,37.45f);
//		ciudad.setLatitud (1000);
//		
//	} catch (CoordenadasNoValidasException e) {
//		System.out.println("Coordenadas no válidas");
//	}
//	if (ciudad != null) {
//		System.out.println(ciudad);
//	}
//}