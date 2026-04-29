package simulado01_animal;

public class Animal {

    protected String nome;
    protected int idade;

    public Animal(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public Animal() {
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }
    public int getIdade(){
        return this.idade;
    }

    public void emitirSom(){
        System.out.println("\nSom Generico do animal: ");
    }

    public String toString(){
        String r;
        r = "\nNome: "+this.nome+"\nIdade: "+this.idade;
        return r;
    }
}
