
public class CrearCuenta {

	
	public static void main(String[] args) {
	// Variable          = Valor 
	Cuenta primeraCuenta = new Cuenta();	
	 primeraCuenta.saldo = 1000;
	 // primeraCuenta.pais = "Peru"; No compila
	 System.out.println(primeraCuenta.saldo);
	 
	 Cuenta segundaCuenta = new Cuenta();
	 segundaCuenta.saldo = 500;
	 System.out.println(segundaCuenta.saldo);
	 
		
	}
}
