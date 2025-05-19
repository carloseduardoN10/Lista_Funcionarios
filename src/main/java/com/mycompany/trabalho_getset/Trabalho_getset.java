/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.trabalho_getset;

/**
 *
 * @author WIN 10
 */
import java.util.Scanner;

class funcionario {
    
    private String nome;
    private String cargo;
    private double salario;
    private boolean ativo;

    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getCargo(){
        return cargo;
    }
    
    public void setCargo(String cargo){
        this.cargo = cargo;
    }

    public Double getSalario(){
        return salario;
    }
    
    public void setSalario(double salario){
        this.salario = salario;
    }
    
    public boolean getAtivo(){
        return ativo;
    }
    
    public void setAtivo(boolean ativo){
        this.ativo = ativo;
    }
    
    public void exibirDados(){
        System.out.println("------------------------------");
        System.out.println("Nome: "+nome);
        System.out.println("Cargo: "+cargo);
        System.out.println("Salário: R$"+salario);
        System.out.println("Status: "+ativo);
    }
    
    public void aumentarSalario(double percentual){
        salario+=salario * (percentual/100);
    }
}

public class Trabalho_getset {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
             
        funcionario[] fcn = new funcionario[3];
      
        int opcao;

        do {
            System.out.println("\nMENU");
            System.out.println("1 - Cadastrar funcionário");
            System.out.println("2 - Listar funcionários");
            System.out.println("3 - Alterar cargo");
            System.out.println("4 - Aumentar salário");
            System.out.println("5 - Desativar funcionário");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = ler.nextInt();
            ler.nextLine(); 

             switch (opcao) {
                case 1:
                    System.out.print("Informe a posição (1 a 3) para cadastrar: ");
                    int posicao = ler.nextInt() - 1;
                    ler.nextLine();
                    
                    if (posicao >= 0 && posicao < fcn.length) {
                        fcn[posicao] = new funcionario();
                        System.out.print("Nome:");
                        fcn[posicao].setNome(ler.nextLine());
                        System.out.print("Cargo: ");
                        fcn[posicao].setCargo(ler.nextLine());
                        System.out.print("Salário: ");
                        fcn[posicao].setSalario(ler.nextDouble());
                        ler.nextLine();
                        fcn[posicao].setAtivo(true);
                        System.out.println("Funcionário cadastrado.");
                    } else {
                        System.out.println("Posição inválida.");
                    }
                    break;

                case 2:
                    for (int i = 0; i < fcn.length; i++) {
                        System.out.println("Funcionário "+(i + 1));
                        if (fcn[i] != null) {
                            fcn[i].exibirDados();
                        } else {
                            System.out.println("Vazio.");
                        }
                    }
                    break;

                case 3:
                    System.out.print("Informe o número do funcionário (1 a 3): ");
                    int numAltera = ler.nextInt() - 1;
                    ler.nextLine();
                    if (numAltera>=0 && numAltera<fcn.length && fcn[numAltera] != null) {
                        System.out.print("Novo cargo: ");
                        String novoCargo = ler.nextLine();
                        fcn[numAltera].setCargo(novoCargo);
                        System.out.println("Cargo alterado.");
                    } else {
                        System.out.println("Funcionário inválido.");
                    }
                    break;

                case 4:
                    System.out.print("Informe o número do funcionário (1 a 3): ");
                    int numSaldo = ler.nextInt() - 1;
                    if (numSaldo >= 0 && numSaldo <fcn.length && fcn[numSaldo] != null) {
                        System.out.print("Percentual de aumento: ");
                        double percentual = ler.nextDouble();
                        fcn[numSaldo].aumentarSalario(percentual);
                        System.out.println("Salário atualizado.");
                    } else {
                        System.out.println("Funcionário inválido.");
                    }
                    break;

                case 5:                 
                    System.out.print("Informe o número do funcionário (1 a 3): ");
                    int numDesativar = ler.nextInt() - 1;
                    if (numDesativar >= 0 && numDesativar < fcn.length && fcn[numDesativar] != null) {
                        fcn[numDesativar].setAtivo(false);
                        System.out.println("Funcionário desativado.");
                    } else {
                        System.out.println("Funcionário inválido.");
                    }
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);

       
    }
}
