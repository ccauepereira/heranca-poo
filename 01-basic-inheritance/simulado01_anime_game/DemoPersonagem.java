package simulado01_anime_game;
import java.util.Scanner;
public class DemoPersonagem {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("\nQuantidade de personagens: ");
        int n = sc.nextInt();
        sc.nextLine();

        Personagem [] herois = new Personagem[n];

        for(int i = 0; i<n; i++) {
            System.out.println("\nNome");
            String nome = sc.nextLine();
            System.out.println("\nAnime: ");
            String anime = sc.nextLine();
            System.out.println("\nNivél: ");
            int nivel = sc.nextInt();
            sc.nextLine();
            System.out.println("\nNome da arma");
            String nomeArma = sc.nextLine();
            System.out.println("\nTipo da arma: ");
            String tipoArma = sc.nextLine();
            System.out.println("\nDano da arma: ");
            int dano = sc.nextInt();
            sc.nextLine();

            Arma armaTemp = new Arma(nomeArma, tipoArma, dano);
            herois[i] = new Personagem(nome, anime, nivel, armaTemp);
        }

        System.out.println("\nLISTA DE PERSONAGENS: ");
            for(int i = 0; i< herois.length; i++){
                System.out.println(herois[i]);
        }
            Personagem maior = herois[0];
            for(int i = 1; i<n; i++){
                if(herois[i].getArma().getDano() > maior.getArma().getDano()){
                    maior = herois[i];
                }
            }
            System.out.println("\n===MAIOR DANO===\n");
            System.out.println(maior.getNome() + "\ncom" + maior.getArma().getNome()+"(Dano: "+maior.getArma().getDano() + ")");

        int contNaruto = 0;
        for (int i = 0; i < n; i++) {
            if (herois[i].getNome().equals("Naruto")) {
                contNaruto++;
            }
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (herois[i].getNome().compareTo(herois[j].getNome()) > 0) {
                    Personagem aux = herois[i];
                    herois[i] = herois[j];
                    herois[j] = aux;
                }
            }
        }

        System.out.println("\n===ORDEM ALFABETICA===\n");
        for(int i = 0; i<n; i++){
            System.out.println(herois[i]);
        }
        System.out.println("\nProximo codigo id: " + Personagem.getProximoId());
        sc.close();
    }
}
