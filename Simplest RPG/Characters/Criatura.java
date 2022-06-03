import java.util.Random;

public class Criatura extends Personagem {

	void grunhir () {
		System.out.println(this.nome + ": Rhaaaoawrrrr..!.");
	}
		
	public Criatura(String crtname) {
		this.nome = crtname; 
		this.ataque = enemyValue();
		this.defesa = enemyValue();
	}
	
	static int enemyValue() {  //gera numeros aleatorios de 5 a 20 
		Random gerador = new Random(); 
		return gerador.nextInt(15)+5;
	}
}