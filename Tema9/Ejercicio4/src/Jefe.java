
public class Jefe extends Empleado {
	private static double plus = 250;
	private String nombreDepart;
	private static double sueldofinal = 1250;

	Jefe(String nombre, int edad, String nombreDepart) {
		this.nombre = nombre;
		this.edad = edad;
		this.nombreDepart = nombreDepart;
	}

	public void setNombreDepart(String nombreDepart) {
		this.nombreDepart = nombreDepart;
	}

//	Jefe() {
//		nombreDepart = "";
//	}
	public static double getPlus() {
		return plus;
	}

	public String toString() {
		return nombreEmpresa + "\nJefe:" + nombre + " Departamento: " + nombreDepart + " " + edad + " a�os "
				+ Jefe.sueldofinal + "�.";
	}

	public static void updateSueldo(double plus) {
		Jefe.plus = plus;
		Jefe.sueldofinal = sueldoBase + plus;
	}
}
