/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifba.sd2.aula04.servidorechothread;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Airton
 */
public class WorkerThread extends Thread {

    private Socket socket;
    private Scanner entrada;
    private PrintWriter saida;
    String mensagem;

    public WorkerThread(Socket socket) {
        this.socket = socket;
    }

    public void run() {
        try {
            System.out.println("Executando...");
            entrada = new Scanner(socket.getInputStream());
            mensagem = entrada.nextLine();
            saida = new PrintWriter(socket.getOutputStream(), true);
            saida.println(mensagem);
        } catch (IOException ex) {
            Logger.getLogger(WorkerThread.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
