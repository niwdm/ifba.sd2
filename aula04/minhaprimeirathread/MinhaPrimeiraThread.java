/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifba.sd2.aula04.minhaprimeirathread;

/**
 *
 * @author Airton
 */
public class MinhaPrimeiraThread extends Thread {
//as threads extendem da classe Thread

    /**
     * @param args the command line arguments
     */
    private String nome;

    public MinhaPrimeiraThread(String nomeThread) {
        this.nome = nomeThread;
    }

    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println(nome + " = " + i);
            try {
                Thread.sleep(1000); //a cada impressão, a thread dorme um segudndo
            } catch (Exception e) {

            }
        }
    }
}
