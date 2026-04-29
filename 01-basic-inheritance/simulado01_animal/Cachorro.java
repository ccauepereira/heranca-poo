package simulado01_animal;

public class Cachorro extends Animal {

    private String raca;

    public Cachorro(String nome, int idade, String raca){
        super(nome, idade);
        this.raca = raca;
    }

    public void setRaca(String raca){
        this.raca = raca;
    }
    public String getRaca(){
        return this.raca;
    }

    @Override
    public void emitirSom(){
        System.out.println("Au AU!! EU sou a pretinha");
    }

    @Override
    public String toString() {
        String r;
        r = "\n=== CACHORRO ===" + super.toString() + "\nRaça: " + this.raca;
        return r;
    }
}
