/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifba.sd2.aula02;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 *
 * @author Airton
 */
public class ClienteData {

    public static void main(String[] args) {
        // TODO code application logic here
        Socket s;
        Scanner entrada;
        try {
            InetAddress endereco = InetAddress.getLocalHost();
            s = new Socket(endereco, 9000);
            entrada = new Scanner(s.getInputStream());
            String msg = entrada.nextLine();
            System.out.println(s);
            System.out.println(msg);
            System.out.println("Conexão realizada!");
            s.close();
        } catch (UnknownHostException e) {
            System.out.println("máquina desconhecida!");
        } catch (IOException e2) {
            System.out.println("Não foi possivel estabelecer a conexão!");
        } catch (Exception e3) {
            System.out.println("Erro!");
        }

    }
}
