/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.refobjeto2;

/**
 *
 * @author Aluno01
 */
public class funcionario {

    String nome;
    double salario;
    String RG;
    String Funcao;
    String entrada;

    void aumento(double quantidade) {
        double recebeAumento = this.salario + quantidade;
        this.salario = recebeAumento;
    }

}
