/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifba.sd2.aula03;

import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author Airton
 */
public class ClienteWeb {

    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o nome do site:");
        String maquina = teclado.nextLine();
        Socket s = new Socket(maquina, 80);
        Scanner entrada = new Scanner(s.getInputStream());
        PrintWriter saida = new PrintWriter(s.getOutputStream(), true);
        String comando = "GET / HTTP/1.0\n";
        saida.println(comando);
        while (entrada.hasNext()) {
            System.out.println(entrada.nextLine());
        }
        s.close();
    }
}
