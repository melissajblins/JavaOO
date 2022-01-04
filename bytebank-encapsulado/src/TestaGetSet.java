public class TestaGetSet {
	public static void main(String[] args) {
		Conta conta = new Conta(1337, 2425);
		conta.deposita(100);
		conta.saca(50);
		
		Cliente Melissa = new Cliente();
		Melissa.setNome("Melissa Junqueira");
		
		conta.setTitular(Melissa);
		
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("Estudante");
	}
}
