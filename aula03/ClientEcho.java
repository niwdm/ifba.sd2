/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifba.sd2.aula03;

import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author elusai
 */
public class ClientEcho {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        String msg;
        Socket socket;
        do {
            System.out.println("Digite um texto");
            msg = entrada.nextLine();

            InetAddress end = InetAddress.getLocalHost();
            socket = new Socket(end, 6789);

            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);
            output.println(msg);

            Scanner input = new Scanner(socket.getInputStream());
            String m = input.nextLine();
            System.out.println(m);
        } while (!msg.equals("bye"));
        socket.close();
    }

}
