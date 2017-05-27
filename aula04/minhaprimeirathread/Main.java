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
public class Main {

    public static void main(String[] args) {
        MinhaPrimeiraThread myThread = new MinhaPrimeiraThread("Maria Joaquina");
        MinhaPrimeiraThread myThread2 = new MinhaPrimeiraThread("Raimunda");
        //a forma de iniciar uma thread é chamar o método start
        //as threads serão gerenciadas pelo s.o., a ordem de execução depende dele
        myThread.start();
        myThread2.start();
    }
}
