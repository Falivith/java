package Main;
import java.util.Random;
import java.util.Scanner;

// subclasses.*; importa todas classes do package subclasses. Aprendi na net!

import subclasses.*;

public class Fazenda {
	
	//brinquei: fiz um gerador de animais aleatorios pra uma fazenda de 10 animais, cada vez que roda o programa gera uma fazenda diferente.

	public static void main(String[] args) {
		
		Scanner stdin = new Scanner (System.in); 
		Animal[] animais = new Animal[10];
		Random gerador = new Random();
		int rand_number;
		
		for(int i=0; i<10; i++) {
			rand_number = gerador.nextInt(5)+1; // Gera números de 0 a 4 e adiciona a constante 1 (1-5)
			switch(rand_number) {
				case 1: 
					animais[i] = new Cachorro();
					System.out.println("Insira o nome do Cachorro que está na posição " + (i+1) + " do vetor.");
					animais[i].setNome(stdin.next());
					break;
				case 2: 
					animais[i] = new Galinha();
					System.out.println("Insira o nome da Galinha que está na posição " + (i+1) + " do vetor.");
					animais[i].setNome(stdin.next());
				break;
				case 3: 
					animais[i] = new Gato();
					System.out.println("Insira o nome do Gato que está na posição " + (i+1) + " do vetor.");
					animais[i].setNome(stdin.next());
				break;
				case 4: 
					animais[i] = new Porco();
					System.out.println("Insira o nome do Porco que está na posição " + (i+1) + " do vetor.");
					animais[i].setNome(stdin.next());
				break;
				case 5: 
					animais[i] = new Vaca();
					System.out.println("Insira o nome da Vaca que está na posição " + (i+1) + " do vetor.");
					animais[i].setNome(stdin.next());
				break;
			}
		}
		
		for(int i=0; i<10; i++) {
			
			System.out.println("O Nome do animal da posição " + (i+1) + " é " + animais[i].getNome());
			
			if(animais[i] instanceof Cachorro){
			System.out.println("É um cachorro !");
			}
			if(animais[i] instanceof Galinha){
			System.out.println("É um galinha !");
			}
			if(animais[i] instanceof Gato){
			System.out.println("É um gato !");
			}
			if(animais[i] instanceof Porco){
			System.out.println("É um porco !");
			}
			if(animais[i] instanceof Vaca){
			System.out.println("É uma vaca !");
			}
			
			animais[i].gritar();
			System.out.println("\n");
		}
		
		stdin.close();
	}
}
