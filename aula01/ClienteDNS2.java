/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifba.sd2.aula01;

import java.net.InetAddress;
import java.util.Scanner;

/**
 *
 * @author armgfilho
 */
public class ClienteDNS2 {

    public static void main(String[] args) {
        System.out.println("Digite o nome: ");
        Scanner teclado = new Scanner(System.in);
        String nome = teclado.nextLine();
        try {
            InetAddress ips[] = InetAddress.getAllByName(nome);
            for (int i = 0; i < ips.length; i++) {
                System.out.println(ips[i].getHostAddress());
            }
        } catch (Exception e) {
            System.out.println("Maquina Desconhecida!!");
        }

    }
}
