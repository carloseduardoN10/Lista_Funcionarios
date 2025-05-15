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
    
    public funcionario(String nome, String cargo, double salario){
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
        this.ativo = true;        
    }

    public String getnome(){
        return nome;
    }
    
    public void setnome(String nome){
        this.nome = nome;
    }
    
    public String getcargo(){
        return cargo;
    }
    
    public void setcargo(String cargo){
        this.cargo = cargo;
    }

    public Double getsalario(){
        return salario;
    }
    
    public void setsalario(double salario){
        this.salario = salario;
    }
    
    public boolean isativo(){
        return ativo;
    }
    
    public void setativo(boolean ativo){
        this.ativo = ativo;
    }
    
    public void exibirdados(){
        System.out.println("------------------------------");
        System.out.println("Nome: "+nome);
        System.out.println("Cargo: "+cargo);
        System.out.println("Salário: R$"+salario);
        System.out.println("Status: "+ativo);
    }
    
    public void aumentarsalario(double percentual){
        salario+=salario * (percentual/100);
    }
}




public class Trabalho_getset {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        String[] listaFuncionarios = new String[3];
        
        System.out.println("Hello World!");
    }
}
