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
public class Main {

    public static void main(String[] args) {
        int vet[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Worker w1 = new Worker(vet, 0);
        Worker w2 = new Worker(vet, 1);

        w1.start();
        w2.start();

        try {
            w1.join();
            w2.join();
        } catch (Exception e) {

        }

        for (int i = 0; i < vet.length; i++) {
            System.out.println(vet[i]);
        }

    }

}
