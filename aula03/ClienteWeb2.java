/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifba.sd2.aula03;

import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

/**
 *
 * @author Airton
 */
public class ClienteWeb2 {

    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o nome do site:");
        String maquina = teclado.nextLine();
        URL u = new URL(maquina);
        Scanner entrada = new Scanner(u.openStream());
        while (entrada.hasNext()) {
            System.out.println(entrada.nextLine());
        }
        URL t = new URL(maquina);
        URLConnection c = t.openConnection();
        String m = c.getHeaderField(0);
        System.out.println(m);
        m = c.getHeaderField(1);
        System.out.println(m);

    }
}
