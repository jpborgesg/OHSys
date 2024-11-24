import model.Laudo;
import model.ExameClinico;
import model.BaseDados;
import model.Funcionario;
import model.ExameEspecial;
import model.Exame;
import java.util.Scanner;
import javax.swing.*;


/* Main Class */
public class SisSO {
    private BaseDados baseDados;

    public SisSO() {
        this.baseDados = new BaseDados();
    }

    private void cadastroExameClinico(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o CID:");
        String CID = scanner.nextLine();
        System.out.println("Digite o nome do Exame Clínico:");
        String nome = scanner.nextLine();
        System.out.println("Digite o valor mínimo:");
        Double valorMin = scanner.nextDouble();
        System.out.println("Digite o valor máximo:");
        Double valorMax = scanner.nextDouble();
        ExameClinico exame = new ExameClinico(CID, nome, valorMin, valorMax);
        baseDados.getVetorExameClinico().add(exame);
        System.out.println("Exame Clínico cadastrado com sucesso!");
    }

    private void cadastroExameEspecial(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o CID:");
        String CID = scanner.nextLine();
        System.out.println("Digite o nome do Exame Clínico:");
        String nome = scanner.nextLine();
        System.out.println("Digite o custo:");
        Double custo = scanner.nextDouble();
        ExameEspecial exame = new ExameEspecial(CID, nome, custo);
        baseDados.getVetorExameEspecial().add(exame);
        System.out.println("Exame Especial cadastrado com sucesso!");
    }

    private void cadastroFuncionario(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a matrícula:");
        String matricula = scanner.nextLine();
        System.out.println("Digite o nome:");
        String nome = scanner.nextLine();
        System.out.println("Digite o cargo:");
        String cargo = scanner.nextLine();
        System.out.println("Digite o salário:");
        Double salario = scanner.nextDouble();
        Funcionario funcionario = new Funcionario(matricula, nome, cargo, salario);
        baseDados.getVetorFuncionario().add(funcionario);
        System.out.println("Exame Clínico cadastrado com sucesso!");
    }

    private void cadastroLaudo(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o código:");
        Long codigo = scanner.nextLong();
        System.out.println("Digite o valor:");
        Double valor = scanner.nextDouble();
        System.out.println("Digite a matrícula do funcionário associado:");
        String funcionario = scanner.nextLine();
        System.out.println("Digite o CID do exame associado:");
        String CIDExame = scanner.nextLine();
        Laudo laudo = new Laudo(codigo, valor, funcionario, CIDExame);
        baseDados.getVetorLaudo().add(laudo);
        System.out.println("Exame Clínico cadastrado com sucesso!");
    }



    private void laudosAlterados() {
        for (Laudo laudo : baseDados.getVetorLaudo()) {
            for (ExameEspecial exameEspecial : baseDados.getVetorExameEspecial()) {
                if (laudo.getCIDExameFK().equals(exameEspecial.getCID())) {
                    if (exameEspecial.isAlterado(laudo.getValor())) {
                        System.out.println("Código Laudo: " + laudo.getCodigo() + " - " +
                                "CID Exame:" + exameEspecial.getCID() + " - " +
                                "Resultado: Alterado");
                    } else {
                        System.out.println("Código Laudo: " + laudo.getCodigo() + " - " +
                                "CID Exame Especial:" + exameEspecial.getCID() + " - " +
                                "Resultado: Normal");
                    }
                }
            }
            for (ExameClinico exameClinico : baseDados.getVetorExameClinico()) {
                if (laudo.getCIDExameFK().equals(exameClinico.getCID())) {
                    if (exameClinico.isAlterado(laudo.getValor())) {
                        System.out.println("Código Laudo: " + laudo.getCodigo() + " - " +
                                "CID Exame Clínico:" + exameClinico.getCID() + " - " +
                                "Resultado: Alterado");
                    } else {
                        System.out.println("Código Laudo: " + laudo.getCodigo() + " - " +
                                "CID Exame:" + exameClinico.getCID() + " - " +
                                "Resultado: Normal");
                    }
                }
            }
        }
    }

    private void imprimeMenu(){
        System.out.println(
                "-----------------------------------------------\n"  +
                "Sistema Saude Ocupacional - Powered by JPBorges\n" +
                "-----------------------------------------------\n" +
                "Escolha uma opção abaixo:\n" +
                "0 - Sair do Sistema\n" +
                "1 - Cadastrar Exame Clínico\n" +
                "2 - Cadastrar Exame Especial\n" +
                "3 - Cadastrar Funcionário\n" +
                "4 - Cadastrar Laudo\n" +
                "5 - Imprimir Laudos Alterados");
        interacaoMenu();
    }

    private void interacaoMenu(){
        Scanner scanner = new Scanner(System.in);
        int numDig = scanner.nextInt();
        switch (numDig){
            case 0:
                System.exit(0);
            case 1:
                cadastroExameClinico();
                break;
            case 2:
                cadastroExameEspecial();
                break;
            case 3:
                cadastroFuncionario();
                break;
            case 4:
                cadastroLaudo();
                break;
            case 5:
                laudosAlterados();
                break;
        }
    }

   public static void main(String[] args) {
        SisSO sisSO = new SisSO();
        while (true) {
            sisSO.imprimeMenu();
        }
    }
}
