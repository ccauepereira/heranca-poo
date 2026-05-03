package simulado01_anime_game;

public class Personagem {
    private String nome;
    private String anime;
    private int nivel;
    private Arma arma;
    private int id;
    public static int idAux = 1;

    public Personagem(String nome, String anime, int nivel, Arma arma){
        this.nome = nome;
        this.anime = anime;
        this.nivel = nivel;
        this.id = idAux++;
        this.arma = new Arma(arma);
    }


    public void setNome(String nome){ this.nome = nome; }
    public void setAnime(String anime){ this.anime = anime; }
    public void setNivel(int nivel){ this.nivel = nivel; }
    public void setArma(Arma arma){ this.arma = new Arma(arma); }

    public String getNome(){ return this.nome; }
    public String getAnime(){ return this.anime; }
    public int getNivel() { return this.nivel; }
    public Arma getArma(){ return new Arma(this.arma); }
    public int getId(){ return id; }
    public static int getProximoId(){ return idAux; }

    @Override
    public String toString() {
        return "ID: " + id + " | " + nome + " (" + anime + ") - Nível: " + nivel + " | " + arma;
    }
}