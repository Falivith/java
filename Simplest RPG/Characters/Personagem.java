abstract public class Personagem {         
	
	/* Aqui implementei uma classe
	 * Abstrata Personagem, pois 
	 * n�o vai existir apenas um "Personagem",
	 * esse personagem tem que ser necessariamente
	 * uma criatura ou um humano.
	 */

	
	/* Aqui testei as propriedades do protected.
	 * penso que faz sentido os atributos ficarem
	 * vis�veis para as classes herdadas nesse pacote,
	 * mas n�o tenho certeza absoluta. O ponto � que
	 * funcionou, hehe.
	 */
	
	protected String nome; 
	protected int ataque; 
	protected int defesa;
	
	public String getNome() {
		return nome;
	}

	public int getAtaque() {
		return ataque;
	}

	public int getDefesa() {
		return defesa;
	}
}
