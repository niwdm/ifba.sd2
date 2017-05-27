/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifba.sd2.aula02;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

/**
 *
 * @author Airton
 */
public class ServidorData {

    public static void main(String[] args) throws Exception {
        ServerSocket servidor = new ServerSocket(9000);
        Socket s = servidor.accept();
        System.out.println("Servidor aguardando conexões!");
        PrintWriter saida
                = new PrintWriter(s.getOutputStream(), true);
        Date data = new Date();
        saida.println(data.toString());
        s.close();
    }

}
