package repositories;

import java.io.PrintWriter;

import entities.Funcionario;

/*
 * Classe de repositorio de dados para funcionário 
 */

public class FuncionarioRepository {

	/*
	 * Método para receber um objeto funcionario Gravar os seus dados em um arquivo
	 * TXT
	 */

	public void exportarParaTxt(Funcionario funcionario) {

		try {
			
			PrintWriter printwriter = new PrintWriter("c:\\temp\\funcionario_" + funcionario.getId() + ".txt");
			
			//escrevendo os dados do funcionario dentro do arquivo 
			
			printwriter.write("\nID DO FUNCIONARIO..: " + funcionario.getId());
			printwriter.write("\nNOME...............: " + funcionario.getNome());
			printwriter.write("\nCPF................: " + funcionario.getCpf());
			printwriter.write("\nMATRICULA..........: " + funcionario.getMatricula());
			printwriter.write("\nSALARIO............: " + funcionario.getSalario());
			printwriter.write("\nSIGLA DO DPTO......: " + funcionario.getDepartamento().getSigla());
			printwriter.write("\nDESCRIÇÃO DO DPTO..: " + funcionario.getDepartamento().getDescricao());
			
			printwriter.flush(); // Salvar o arquivo 
			printwriter.close(); // Fechar o arquivo
			
			System.out.println("\nARQUIVO TXT GRAVADO COM SUCESSO!");

		} catch (Exception e) {

			System.out.println("\n FALHA AO GRAVAR ARQUIVO TXT: ");
			System.out.println("\nERRO: " + e.getMessage());
		}

	}

}
