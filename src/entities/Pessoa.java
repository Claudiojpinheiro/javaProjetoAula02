package entities;

/*
 * Classe de entidade  
 */
import java.util.UUID;

public class Pessoa {

	/*
	 * Atributos da classe (dados)
	 */

	private UUID id;
	private String nome;

	// Set and get é como se fosse um filtro 
	
	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
