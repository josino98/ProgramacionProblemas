
public class Empleado {
	final static protected String nombreEmpresa = "El�ctrica, SA";
	protected static double sueldoBase = 1000;
	String nombre;
	int edad;
	static double sueldoFinal;

	Empleado() {
		nombre = "";
		edad = 0;
		sueldoFinal = sueldoBase;

	}

	Empleado(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	@Override
	public String toString() {
		return nombreEmpresa + "\nEmpleado:" + nombre + " " + edad + " a�os " + sueldoFinal + "�.";
	}

	public static void setSueldoBase(double sueldoBase) {
		Empleado.sueldoBase = sueldoBase;
		Empleado.sueldoFinal = sueldoBase;
		Jefe.updateSueldo(Jefe.getPlus());
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

}
