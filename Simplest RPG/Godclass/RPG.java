import java.util.Scanner;
import java.util.ArrayList;

public class RPG {
	
	static Scanner stdin = new Scanner (System.in); 
	
	/* Abaixo existe um método batalha privado apenas disponível 
	 * a classe prnicipal RPG */
	
	private static boolean batalha(Personagem player, Criatura enemy) {
		
		System.out.println("\nVocê acaba de encontrar uma Criatura! e o nome dela é " + enemy.nome + "!");
		((Criatura) enemy).grunhir(); 
		System.out.println("Os atributos de " + enemy.nome + " são: " + enemy.ataque + " de ataque e " + enemy.defesa + " de defesa.");
    
		while(true) {
			System.out.println("Você quer atacar ou defender? (1) Atacar (2) Defender");
			int choice = stdin.nextInt();
			if(choice == 1) {
				if(player.ataque > enemy.defesa) {
					System.out.println("Você derrotou " + enemy.nome + "!");
					return true;
				}else {
					System.out.println("Você foi derrotado pelo " + enemy.nome + ".");
					return false;
				}
			}
			
			if(choice == 2 ) {
				if(player.defesa > enemy.ataque) {
					System.out.println("Você derrotou " + enemy.nome + "!");
					return true;
				}else {
					System.out.println("Você foi derrotado pelo " + enemy.nome + ".");
					return false;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		
		String newline = System.lineSeparator();
		boolean playerexists = false; 
		boolean sair = true; 
		boolean result = false;
		int atvalue;
    	int defvalue;
    	
		Scanner stdin = new Scanner (System.in);
		
		/* Aqui tive um primeiro contato com as arraylists do Java,
		 * eu queria inicialmente criar um método que instanciasse 
		 * uma criatura e ficasse sucessivamente criando novas
		 * criaturas aleatórias, mas devido a falta de tempo 
		 * acabei fazendo três criaturas fixas com valores
		 * aleatórios. Os valores aleatórios delas
		 * são gerados num método da classe criatura. */
		
		ArrayList<Criatura> enemies = new ArrayList<Criatura>(); 
		
		Humano player = new Humano();
		Criatura creature1 = new Criatura("Anub Arak");
		Criatura creature2 = new Criatura("Sraj Argon");
		Criatura creature3 = new Criatura("Sun Gohan");
		
		enemies.add (creature1); 
		enemies.add (creature2);
		enemies.add (creature3); 
		
		
		while (sair) {            

            System.out.print("    Dungeons and Dargons\n\n");
            System.out.print("|-----------------------------|\n");
            System.out.print("| Opção 1 - Criar Personagem  |\n");
            System.out.print("| Opção 2 - Lutar!            |\n");
            System.out.print("| Opção 3 - Sair              |\n");
            System.out.print("|-----------------------------|\n");
            System.out.print("Digite uma opção: ");

            int opcao = stdin.nextInt();

            switch (opcao) {
            
            case 1:
            	
            	/* Penso que eu deveria ter feito um método separado
            	 * para criação do personagem ao invés de ter feito
            	 * tudo aqui no case, ou até fazer uma classe especial
            	 * para cuidar dessa parte da criação, agora analisando */
            	
            	System.out.print("Digite o nome do seu Personagem: ");
            	String tempnome = stdin.next();
            	
            	while(true) {
            		System.out.println("Quantidade de pontos dedicadas ao ataque (Você tem um total de 20 pontos para distribuir)");
            		atvalue = stdin.nextInt();
            			if(atvalue>0 && atvalue<=20)
            			break;
            	}
            	
            	while(true) {
            		System.out.print("Digite o valor de defesa do seu Personagem (Lembre: Você tem um total de 20 pontos para distribuir");
            		defvalue = stdin.nextInt();
            			if((defvalue + atvalue) <= 20)
            			break; 
            	}
            	
            	/* Aqui eu uso os métodos Getters and Setters da classe abstrata
            	 * personagem, acessando-os por meio de um objeto humano.
            	 * Aplicando os conceitos de herança aprendidos*/
            	
            	player.nome = tempnome; 
            	player.ataque = atvalue;
            	player.defesa = defvalue; 
            	
            	playerexists = true;
            	break; 

            	
            	
            case 2:
            	
            	if(!playerexists) {
            	System.out.println("Você não criou seu personagem!" + newline);
            	break; 
            	}
            	
            	for(int i=0; i < enemies.size(); i++) {
            		
            		result = RPG.batalha(player, enemies.get(i));
            		if (result)
            		System.out.println("Você conseguiu derrotar " + enemies.get(i).nome + "... então você continua sua jornada...\n");
            			else {
            			System.out.println("Infelizmente você foi derrotado...\n");
            			break; 
            			}
            		}
            	
            	if (result)
            		System.out.println("Parabéns. Você completou sua jornada Bravamente.\n");
            	break;
            	
            case 3:
            	
            	System.out.print("\nAté mais!");
            	stdin.close();
            	sair = false; 
            	break;
                
            default:
                System.out.print("\nOpção Inválida!");
                break;
            }
		}
	}
}
