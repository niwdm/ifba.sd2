package br.ifba.sd2.aula03;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerEcho {
    public static void main(String[] args) throws Exception{
        ServerSocket server = new ServerSocket(6789);
        String msg;
        Socket socket;
        do {
            socket = server.accept();
            System.out.println("Servidor Ativo!");

            Scanner input = new Scanner(socket.getInputStream());
            msg = input.nextLine();

            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);
            output.println(msg);

        } while(!msg.equals("bye"));
        socket.close(); 
    }
}