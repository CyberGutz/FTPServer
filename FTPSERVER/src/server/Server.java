package server;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;


import model.Endereco;

public class Server {
    public static ServerSocket server;
    public Server(){
    }

    public void conectar(){
        try{
            server = new ServerSocket(Endereco.getPorta());
            System.out.println("Server ouvindo a porta " + Endereco.getPorta());
        }
        catch(Exception e){
            System.out.println("Erro ao conectar o server");
            e.printStackTrace();
        }
    }

    public void enviarMensagem(){
        try{
            while(true){
                System.out.println("Entrou no server");
                Socket cliente = server.accept();
                System.out.println("Aceitou cliente");
                System.out.println("Cliente Conectado: " + cliente.getInetAddress().getHostAddress());
                ObjectOutputStream saida = new ObjectOutputStream(cliente.getOutputStream());
                saida.flush();
                saida.writeObject(new Date());
                saida.close();
                cliente.close();
            }
        }
        catch(IOException e){
            System.out.println("Erro ao enviar mensagem");
            e.printStackTrace();
        }
    }
}
