/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifba.sd2.aula01;

import java.net.InetAddress;

/**
 *
 * @author armgfilho
 */
public class DNSClienteClass {

    public InetAddress[] getNome(String nome) {
        try {
            InetAddress[] ips = InetAddress.getAllByName(nome);
            return ips;
        } catch (Exception e) {
            return null;
        }
    }
}
