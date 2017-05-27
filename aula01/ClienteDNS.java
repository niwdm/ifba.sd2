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
public class ClienteDNS {

    public static void main(String[] args) {
        System.out.println("Digite o nome: ");
        Scanner teclado = new Scanner(System.in);
        String nome = teclado.nextLine();
        try {
            InetAddress ip = InetAddress.getByName(nome);
            System.out.println(ip);
        } catch (Exception e) {
            System.out.println("Maquina Desconhecida!!");
        }

    }
}
