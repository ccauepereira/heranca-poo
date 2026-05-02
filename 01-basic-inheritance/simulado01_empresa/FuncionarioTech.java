package simulado01_empresa;

public class FuncionarioTech extends Funcionario {
    private String linguagemP;

    public FuncionarioTech(String nome,String cargo,float sbase,String linguagemP) {
        super(nome, cargo, sbase);
        this.linguagemP = linguagemP;
    }

    public void setLinguagemP(String linguagemP){
        this.linguagemP = linguagemP;
    }

    public String getLinguagemP(){
        return this.linguagemP;
    }
    @Override
    public float calcularBonus(){
        return getSbase()*0.20f;
    }

    @Override
    public String toString(){
        return super.toString() + " | Linguagem: "+this.linguagemP;
    }
}
