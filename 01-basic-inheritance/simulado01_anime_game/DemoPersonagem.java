package simulado01_anime_game;
import java.util.Scanner;

public class DemoPersonagem {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("\nQuantidade de personagens: ");
        int n = sc.nextInt();
        sc.nextLine();

        Personagem[] herois = new Personagem[n];

        for(int i = 0; i < n; i++) {
            System.out.println("\n*** Personagem " + (i+1) + " ***");

            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Anime: ");
            String anime = sc.nextLine();

            System.out.print("Nível: ");
            int nivel = sc.nextInt();
            sc.nextLine();

            System.out.print("Nome da arma: ");
            String nomeArma = sc.nextLine();

            System.out.print("Tipo (1=Espada, 2=Katana, 3=Pistola, 4=Cajado): ");
            int opcaoTipo = sc.nextInt();
            sc.nextLine();

            String tipoArma;
            if (opcaoTipo == 1) {
                tipoArma = "Espada";
            } else if (opcaoTipo == 2) {
                tipoArma = "Katana";
            } else if (opcaoTipo == 3) {
                tipoArma = "Pistola";
            } else {
                tipoArma = "Cajado";
            }

            System.out.print("Dano da arma: ");
            int dano = sc.nextInt();
            sc.nextLine();

            Arma armaTemp = new Arma(nomeArma, tipoArma, dano);
            herois[i] = new Personagem(nome, anime, nivel, armaTemp);
        }

        System.out.println("\n===== LISTA DE PERSONAGENS =====");
        for(int i = 0; i < herois.length; i++){
            System.out.println(herois[i]);
        }
        Personagem maior = herois[0];
        for(int i = 1; i < n; i++){
            if(herois[i].getArma().getDano() > maior.getArma().getDano()){
                maior = herois[i];
            }
        }
        System.out.println("\n===== MAIOR DANO =====");
        System.out.println(maior.getNome() + " com " + maior.getArma().getNome()
                + " (Dano: " + maior.getArma().getDano() + ")");

        int contNaruto = 0;
        for (int i = 0; i < n; i++) {
            if (herois[i].getNome().equals("Naruto")) {
                contNaruto++;
            }
        }
        System.out.println("\n===== CONTAGEM NARUTO =====");
        System.out.println("Personagens chamados 'Naruto': " + contNaruto);

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (herois[i].getNome().compareTo(herois[j].getNome()) > 0) {
                    Personagem aux = herois[i];
                    herois[i] = herois[j];
                    herois[j] = aux;
                }
            }
        }
        System.out.println("\n===== ORDEM ALFABÉTICA =====");
        for(int i = 0; i < n; i++){
            System.out.println(herois[i]);
        }
        System.out.println("\nPróximo código ID: " + Personagem.getProximoId());

        sc.close();
    }
}