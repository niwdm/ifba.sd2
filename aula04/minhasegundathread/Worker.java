/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifba.sd2.aula04.minhasegundathread;

/**
 *
 * @author Airton
 */
public class Worker extends Thread {

    /**
     * @param args the command line arguments
     */
    private int vet[];
    private int inicio;

    public Worker(int v[], int i) {
        vet = v;
        inicio = i;
    }

    public void run() {
        for (int i = inicio; i < vet.length; i = i + 2) {
            vet[i] = 2 * vet[i];
            System.out.println(vet[i]);
        }
    }

}
