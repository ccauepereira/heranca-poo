package simulado01_empresa;

public class FuncionarioMarketing extends Funcionario{
    private int vendasMes;

    public FuncionarioMarketing(String nome, String cargo, float sbase, int vendasMes) {
        super(nome, cargo, sbase);
        this.vendasMes = vendasMes;
    }

    public void setVendasMes(int vendasMes){
        this.vendasMes = vendasMes;
        }

        public int getVendasMes(){
        return this.vendasMes;
        }

    @Override
    public float calcularBonus(){
        return getVendasMes()*50.0f;
    }

    @Override
    public String toString(){
        return super.toString() + " | Vendas do mes: "+this.vendasMes;
    }
}

