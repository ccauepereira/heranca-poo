package simulado01_anime_game;

public class Arma {
    private String nome;
    private String tipo;
    private int dano;

    public Arma(String nome, String tipo, int dano){
        this.nome = nome;
        this.tipo = tipo;
        this.dano = dano;
    }

    public Arma(Arma a){
        this(a.nome, a.tipo, a.dano);
    }

    public void setNome(String nome){ this.nome = nome; }
    public void setTipo(String tipo){ this.tipo = tipo; }
    public void setDano(int dano){ this.dano = dano; }

    public String getNome(){ return this.nome; }
    public String getTipo() { return this.tipo; }
    public int getDano() { return this.dano; }

    @Override
    public String toString(){
        return "Arma: " + this.nome + " | Tipo: " + this.tipo + " | Dano: " + this.dano;
    }
}
