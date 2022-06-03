package Main;
public abstract class Animal {
	
	 private String nome;
	 
	 public void setNome(String name){
		 nome = name; 
	 }
	 
	 public String getNome(){
		 return nome; 
	 }
	 
	 
	 //método abstrato a ser implementado
	 
	 public abstract void gritar();
}

