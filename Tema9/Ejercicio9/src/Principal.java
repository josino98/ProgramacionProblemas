
public class Principal {

	public static void main(String[] args) {
		Integer empls, admins, maqs;
		Empleado [] empleados;
		String nombres[]={"Luis","Jesus","Jaime","Carlos","Rafa","Jose","Pilar","Maria","Paola","Lolo"};
		String estudios[]={"Informatica","Administracion","Peluqueria","Marketing","Derecho","Torcido"};
		
		empls= Leer.pedirEntero("Cuantos empleados hay en la empresa?");
		admins= Leer.pedirEntero("Cuantos administrativos hay en la empresa?");
		maqs = Leer.pedirEntero("Cuantos maquinistas hay en la empresa?");
		empleados = new Empleado[empls+admins+maqs];
		
		crearEmpleados(empleados,nombres,empls);
		crearAdministrativos(empleados,nombres,estudios,admins,empls);
		crearMaquinistas(empleados,nombres,maqs);
		
		mostrarDatos(empleados);
		
	}//main
	
	public static void crearEmpleados(Empleado [] empleados, String[] nombres,Integer empls){
		for (int i = 0; i < empls; i++) {
			empleados[i]=new Empleado(nombres[(int) (Math.random()*nombres.length)],(int)(Math.random()*20+20));
		}
	}
	
	public static void crearAdministrativos(Empleado [] empleados, String[] nombres, String[] estudios, Integer admins, Integer empls ){
		for (int i = empls; i < admins+empls; i++) {
			empleados[i]=new Administrativo(nombres[(int) (Math.random()*nombres.length)],(int)(Math.random()*20+20),
					estudios[(int) (Math.random()*estudios.length)],(int)(Math.random()*20+1));
		}
	}
	
	public static void crearMaquinistas(Empleado [] empleados, String[] nombres,Integer maqs){
		for (int i = (empleados.length-maqs); i < empleados.length; i++) {
			empleados[i]=new Maquinista(nombres[(int) (Math.random()*nombres.length)],(int)(Math.random()*20+20),(int)(Math.random()*20+1),(int)(Math.random()*5));
		}
	}
	
	public static void mostrarDatos(Empleado [] v){
		for (int i = 0; i < v.length; i++) {
			v[i].visualizarTodosDatos();
		}
	}

}//Principal
