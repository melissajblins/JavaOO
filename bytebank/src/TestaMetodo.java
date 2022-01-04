public class TestaMetodo {
	public static void main(String[] args) {
		Conta contaDeTeste = new Conta();
		contaDeTeste.saldo = 100;
		contaDeTeste.deposita(50);
		System.out.println(contaDeTeste.saldo);
		
		boolean conseguiuRetirar = contaDeTeste.saca(20);
		System.out.println(conseguiuRetirar);
		System.out.println(contaDeTeste.saldo);
		
		Conta contaDaMelissa = new Conta();
		contaDaMelissa.deposita(1000);
		if(contaDaMelissa.transfere(3000, contaDeTeste)) {
			System.out.println("Transferência realizada com sucesso!");
		} else {
			System.out.println("Transferência cancelada.");
		}
		System.out.println(contaDaMelissa.saldo);
		System.out.println(contaDeTeste.saldo);
	}
}
