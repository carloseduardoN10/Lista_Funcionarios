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
    
    public boolean isAtivo(){
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
