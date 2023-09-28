package controllers;

import java.util.Scanner;
import java.util.UUID;

import entities.Departamento;
import entities.Funcionario;
import repositories.FuncionarioRepository;

/*
 * Classe de controle para operações com funcionario
 */
public class FuncionarioController {

	/*
	 * Método para realizar cadastro de um funcionario
	 */

	public void cadastrarFuncionario() {

		try {

			System.out.println("\n*** CADASTRO DE FUNCIONARIO ***\n");

			// criando um objeto da classe Funcionario
			Funcionario funcionario = new Funcionario();

			// Instanciando o departamento contido em funcionario
			funcionario.setDepartamento(new Departamento());

			// criando um ID aleatório para o funcionario
			funcionario.setId(UUID.randomUUID());

			// criando um objeto para a classe Scanner
			Scanner scanner = new Scanner(System.in);

			System.out.print("NOME DO FUNCIONÁRIO.........: ");
			funcionario.setNome(scanner.nextLine());

			System.out.print("CPF DO FUNCIONÁRIO..........: ");
			funcionario.setCpf(scanner.nextLine());

			System.out.print("MATRICULA DO FUNCIONÁRIO....: ");
			funcionario.setMatricula(scanner.nextLine());

			System.out.print("SALARIO DO FUNCIONÁRIO......: ");
			funcionario.setSalario(Double.parseDouble(scanner.nextLine()));

			// criando um ID aleatorio para departamento
			funcionario.getDepartamento().setId(UUID.randomUUID());

			System.out.print("SIGLA DO DEPTO..............: ");
			funcionario.getDepartamento().setSigla(scanner.nextLine());

			System.out.print("DESCRICAO DO DEPTO..........: ");
			funcionario.getDepartamento().setDescricao(scanner.nextLine());
			
			//Criar um objeto para a classe FuncionarioRepository 
			FuncionarioRepository funcionarioRepository = new FuncionarioRepository();
			funcionarioRepository.exportarParaTxt(funcionario);

			// fechando o scanner
			scanner.close();

		} catch (Exception e) {

			// imprimindo mensagem de erro
			System.out.println("\nERRO AO CADASTRAR FUNCIONARIO!");
			System.out.println(e.getMessage());

		}

	}

}
