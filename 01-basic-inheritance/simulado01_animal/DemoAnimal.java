package simulado01_animal;
public class DemoAnimal {
    public static void main(String[] args){

        Cachorro c = new Cachorro("Pretinha", 5, "Pinscher");
        Gato g = new Gato("nandinha", 3,"longa");

        System.out.println(c);
        System.out.println(g);

        System.out.println("\nPretinha faz: ");
        c.emitirSom();

        System.out.println("\nNandinha faz: ");
        g.emitirSom();

        System.out.println("\n\n==== POLIMORFISMO ===\n\n");

        Animal [] animais = new Animal[2];
        animais[0] = c;
        animais[1] = g;

        for(int i = 0; i< animais.length; i++){
            System.out.println("Animal"+(i+1)+"faz: ");
            animais[i].emitirSom();
        }
    }
}
