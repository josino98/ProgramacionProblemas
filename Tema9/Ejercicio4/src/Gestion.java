import java.util.Arrays;

public class Gestion {
	static Empleado[] empleados;

	public static void main(String[] args) {
		empleados = new Empleado[Leer.pedirEntero("Cuantos empleados quieres crear")];
		for (int i = 0; i < empleados.length; i++) {
			Leer.mostrarEnPantalla("Empleado " + (i + 1) + ": ");
			empleados[i] = new Empleado(Leer.pedirCadena("Introduce el nombre"), Leer.pedirEntero("Introduce la edad"));
		}
		int numJef = Leer.pedirEntero("Cuantos jefes quieres crear");
		empleados = Arrays.copyOf(empleados, empleados.length + numJef);
		for (int i = (empleados.length - numJef); i < empleados.length; i++) {
			empleados[i] = new Jefe(Leer.pedirCadena("Introduce el nombre"), Leer.pedirEntero("Introduce la edad"),
					Leer.pedirCadena("Introduce nombre de departamento"));
		}
		boolean salir = false;
		while (salir == false) {
			switch (Leer.pedirEntero(menu())) {
			case 1:
				double sueldo = Leer.pedirDouble("Introduzca el sueldo base.");
				Empleado.setSueldoBase(sueldo);
				Jefe.setSueldoBase(sueldo);
				break;
			case 2:
				Jefe.updateSueldo(Leer.pedirDouble("Introduzca el nuevo plus, el actual es: " + Jefe.getPlus()));
				break;
			case 3:
				for (int i = 0; i < empleados.length; i++) {
					Leer.mostrarEnPantalla(empleados[i].toString());
				}
				break;
			case 0:
				Leer.mostrarEnPantalla("Saliendo...");
				salir = true;
				break;
			default:
				Leer.mostrarEnPantalla("No has elegido una opci�n correcta");
				break;
			}
		} // Fin blucle while
	}

	public static String menu() {
		return ("1. Modificar el sueldo base de todos los empleados." + "\n2. Modificar el plus de todos los jefes."
				+ "\n3. Visualizar los datos de todos los empleados." + "\n0. Salir.");
	}
}
