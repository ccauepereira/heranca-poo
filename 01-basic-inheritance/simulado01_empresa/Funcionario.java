package simulado01_empresa;

public class Funcionario {
        private String nome;
        private String cargo;
        private float sbase;
        private int id;
        public static int idAux = 1001;

        public Funcionario(String nome,String cargo,float sbase) {
            this.nome = nome;
            this.cargo = cargo;
            this.sbase = sbase;
            this.id = idAux++;
        }

        public Funcionario(String nome,String cargo){
            this(nome,cargo,0.0f);
        }

        public Funcionario(){
            this("","",0.0f);
        }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    public void setCargo(String cargo){
        this.cargo = cargo;
    }
    public String getCargo(){
        return this.cargo;
    }
    public void setSbase(float sbase){
            this.sbase=sbase;
    }
    public float getSbase(){
            return this.sbase;
    }
    public int getId() {
        return this.id;
    }
    public float calcularBonus(){
            return 0.0f;
    }
    public int getProximoId(){
            return idAux;
    }
    @Override
    public String toString() {
        String r = "\nID: " + id + " | Nome: " + nome + " Cargo: (" + cargo + ") - Salario Base: " + sbase;
        return r;
    }
}