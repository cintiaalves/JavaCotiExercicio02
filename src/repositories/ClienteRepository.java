package repositories;

import java.io.FileWriter;

import entities.Cliente;

public class ClienteRepository {
	
	public void exportarDados(Cliente cliente) throws Exception {
		
		FileWriter fileWriter = new FileWriter("c:\\temp\\Cliente.txt", true);
		fileWriter.write("EXERCÍCIO 02 - AULA 02 DO PROJETO 01");
		fileWriter.write("\n");
		fileWriter.write("\nInforme o Id do cliente: " + cliente.getId());
		fileWriter.write("\nInforme o nome do cliente: " + cliente.getNome());
		fileWriter.write("\nInforme o CPF do cliente: " + cliente.getCpf());
		fileWriter.write("\nInforme o E-mail do cliente: " + cliente.getEmail());
		fileWriter.write("\nInforme o bairro do cliente: " + cliente.getEndereco().getBairro());
		fileWriter.write("\nInforme o CEP do cliente: " + cliente.getEndereco().getCep());
		fileWriter.write("\nInforme a cidade do cliente: " + cliente.getEndereco().getCidade());
		fileWriter.write("\nInforme o estado do cliente: " + cliente.getEndereco().getEstado());
		fileWriter.write("\nInforme o logradouro do cliente: " + cliente.getEndereco().getLogradouro());
		fileWriter.write("\nInforme o Id do cliente: " + cliente.getEndereco().getId());
		fileWriter.write("\nInforme o número do endereço: " + cliente.getEndereco().getNumero());
		
		fileWriter.flush();
		fileWriter.close();
	}
	
}
