abstract public class Personagem {         
	
	/* Aqui implementei uma classe
	 * Abstrata Personagem, pois 
	 * não vai existir apenas um "Personagem",
	 * esse personagem tem que ser necessariamente
	 * uma criatura ou um humano.
	 */

	
	/* Aqui testei as propriedades do protected.
	 * penso que faz sentido os atributos ficarem
	 * visíveis para as classes herdadas nesse pacote,
	 * mas não tenho certeza absoluta. O ponto é que
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
