/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.refobjeto2;

/**
 *
 * @author Aluno01
 */
public class TesteFuncionario {
    public static void Main(String[] args) {

        funcionario func1 = new funcionario();

        func1.aumento(1000);
        func1.nome = "VINI";
        func1.Funcao = "T.I";
        func1.entrada = "20 de Janeiro 2013";
        func1.RG = "474472-1";
        func1.salario = 100;

        System.out.println("------------Funcionario-----------");
        System.out.println("Nome: " + func1.nome);
        System.out.println("Função: " + func1.Funcao);
        System.out.println("Entrada: " + func1.entrada);
        System.out.println("RG; " + func1.RG);
        System.out.println("Salario: " + func1.salario);

    }
}
