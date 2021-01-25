package principal;

import entities.Cliente;
import entities.Endereco;
import repositories.ClienteRepository;
import util.ScannerUtil;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cliente cliente = new Cliente();
		Endereco endereco = new Endereco();
		
		
		try {
			
			cliente.setCpf(ScannerUtil.lerTexto("Informe o CPF do cliente: "));
			cliente.setEmail(ScannerUtil.lerTexto("Informe o E-mail do cliente: "));
			cliente.setId(ScannerUtil.lerInteiro("Informe o Id do cliente: "));
			cliente.setNome(ScannerUtil.lerTexto("Informe o nome do cliente: "));
			
			
			endereco.setBairro(ScannerUtil.lerTexto("Informe o bairro do cliente: "));
			endereco.setCep(ScannerUtil.lerTexto("Informe o CEP do cliente:"));
			endereco.setCidade(ScannerUtil.lerTexto("Informe a cidade do cliente: "));
			endereco.setEstado(ScannerUtil.lerTexto("Informe o estado do cliente: "));
			endereco.setId(ScannerUtil.lerInteiro("Informe o Id do cliente: "));
			endereco.setLogradouro(ScannerUtil.lerTexto("Informe o logradouro do cliente: "));
			endereco.setNumero(ScannerUtil.lerInteiro("Informe o número do endereço: "));
			
			cliente.setEndereco(endereco);
			
			
			
			ClienteRepository clienteRepository = new ClienteRepository();
			clienteRepository.exportarDados(cliente);
			
			
			System.out.println("ARQUIVO GRAVADO COM SUCESSO!");
			
		}
		
		catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}
				
				
		
		
		
		
		
		
	}

}
