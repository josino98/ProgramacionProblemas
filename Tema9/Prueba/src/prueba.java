
public class prueba {
	public static void main(String[] args) {
		Padre padre[] = new Padre[] { new Padre(), new Padre(3, 4), new Hijo(), new Hijo(5, 6), new Hijo(7, 8, 9) };
		for (int i = 0; i < padre.length; i++) {
			if( padre[i] instanceof Hijo){
				System.out.println("Hijo");
			}
			else{
				System.out.println("Padre");
			}
			padre[i].visualizar();
			System.out.println();
		}
	}
}
