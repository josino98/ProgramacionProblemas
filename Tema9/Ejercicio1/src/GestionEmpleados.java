
public class GestionEmpleados {
	public static void main(String[] args) {
		int numEmpl = Leer.pedirEntero("Cuantos empleados quieres crear");
		Empleados[] empleados = new Empleados[numEmpl];
		int numJef = Leer.pedirEntero("Cuantos jefes quieres crear");
		Jefes[] jefes = new Jefes[numJef];
		for (int i = 0; i < numEmpl; i++) {
			empleados[i] = new Empleados();
			empleados[i].setTodo(Leer.pedirEntero("Introduce sueldo"), Leer.pedirCadena("Introduce nombre"));
		}
		for (int i = 0; i < numJef; i++) {
			jefes[i] = new Jefes();
			jefes[i].setTodo(Leer.pedirEntero("Introduce sueldo"), Leer.pedirCadena("Introduce nombre"),
					Leer.pedirCadena("Introduce titulo"), Leer.pedirCadena("Introduce departamento"));
		}
		for (int i = 0; i < empleados.length; i++) {
			Leer.mostrarEnPantalla("Empleado " +(i+1)+":");
			empleados[i].imprimeTodo();
			Leer.mostrarEnPantalla("\n");
		}
		for (int i = 0; i < jefes.length; i++) {
			Leer.mostrarEnPantalla("Jefe "+(i+1)+":");
			jefes[i].imprimeTodo();
			Leer.mostrarEnPantalla("\n");
		}
	}
}
