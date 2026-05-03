package simulado01_empresa;
import java.util.Scanner;
public class DemoEmpresa {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEntre com a quant de funcionarios: ");
        int n = sc.nextInt();
        sc.nextLine();

        Funcionario [] funcionarios = new Funcionario[n];

        for(int i = 0; i<n; i++) {
            System.out.println("\n*** FUNCIONARIO " + (i + 1) + "***\n");
            System.out.println("\nNome: ");
            String nome = sc.nextLine();

            System.out.println("\nCargo: ");
            String cargo = sc.nextLine();
            System.out.println("\nSalário Base: ");
            float sbase = sc.nextFloat();
            System.out.println("Tipo (1=tech, 2=Marketing, 3=qualquer coisa)");
            int tipo = sc.nextInt();
            sc.nextLine();

            if (tipo == 1) {
                System.out.println("\nLinguagem Principal: ");
                String linguagemP = sc.nextLine();
                funcionarios[i] = new FuncionarioTech(nome, cargo, sbase, linguagemP);
            } else if (tipo == 2) {
                System.out.println("\nVendas do mes: ");
                float vendasMes = sc.nextFloat();
                funcionarios[i] = new FuncionarioMarketing(nome, cargo, sbase, (int) vendasMes);
            } else {
                funcionarios[i] = new Funcionario(nome, cargo, sbase);
            }
        }

        System.out.println("\n\n=== TODOS OS FUNCIONARIOS ===\n\n");
        for(int i = 0; i<n; i++) {
            System.out.println(funcionarios[i]);
        }

        float folhaTotal = 0;
        for(int i = 0; i<n; i++){
            folhaTotal += funcionarios[i].getSbase() + funcionarios[i].calcularBonus();
        }
        System.out.println("\n==== FOLHA TOTAL DE PAGAMENTO ====\n");
        System.out.println("\nTotal da folha: R$ "+String.format("%3f", folhaTotal));

        int contTech = 0;
        int contMarketing = 0;
        int contGe = 0;

        for(int i = 0; i<n; i++) {
            if (funcionarios[i] instanceof FuncionarioTech) {
                contTech++;
            }
            else if (funcionarios[i] instanceof FuncionarioMarketing){
                contMarketing++;
            }
            else{
                contGe++;
            }
            System.out.print("\n===== CONTAGEM POR TIPO =====\n");
            System.out.println("Tech: " + contTech);
            System.out.println("Marketing: " + contMarketing);
            System.out.println("Genérico: " + contGe);
            }
        System.out.println("\n=== MAIOR SALARIO COM BONUS ===");
        Funcionario maiorSalario = funcionarios [0];
        float maiorValor = funcionarios[0].getSbase()+funcionarios[0].calcularBonus();
        for(int i = 1; i<n; i++){
            float valorAtual = funcionarios[i].getSbase() + funcionarios[i].calcularBonus();
            if(valorAtual > maiorValor){
                maiorSalario = funcionarios[i];
                maiorValor = valorAtual;
            }
        }
        System.out.println("\nTotal com bonus: R$ "+String.format("%3f",maiorValor));
        sc.close();
    }
}
