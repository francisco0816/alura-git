
public class EjemploCondicionales {

	public static void main(String[] args) {
		System.out.println("Hello Word");

		int edad = 17;
		int cantidad = 2;

		if (edad >= 18) {
			System.out.println("Usted puede Entrar");
		} else {
			if (cantidad >= 2) {
				System.out.println("Usted es menor de" + "edad pero esta permitido si ingreso");

			} else {
				System.out.println("Usted no esta permitido a " + "entrar");
			}
		}
	}
}
