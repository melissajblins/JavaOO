public class TestaBanco {
	public static void main(String[] args) {
		Cliente Melissa = new Cliente();
		Melissa.nome = "Melissa Junqueira de Barros Lins";
		Melissa.cpf = "222.222.222-22";
		Melissa.profissao = "Estudante";
		
		Conta contaDaMelissa = new Conta();
		contaDaMelissa.deposita(100);
		
		contaDaMelissa.titular = Melissa;
	}
}
