package server;

import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

import model.Port;

public class Server {
    public static ServerSocket server;
    
    public Server(){
        conectar(server);
    }

    public static void conectar(ServerSocket server){
        try{
            server = new ServerSocket(Port.getPort());
            System.out.println("Server ouvindo a porta " + Port.getPort());
        }
        catch(Exception e){
            System.out.println("Erro ao conectar o server");
            e.printStackTrace();
        }
    }

    public void enviarMensagem(){
        try{
            while(true){
                Socket cliente = server.accept();
                System.out.println("Cliente Conectado: " + cliente.getInetAddress().getHostAddress());
                ObjectOutputStream saida = new ObjectOutputStream(cliente.getOutputStream());
                saida.flush();
                saida.writeObject(new Date());
                saida.close();
                cliente.close();
            }
        }
        catch(Exception e){
            System.out.println("Erro ao enviar mensagem");
            e.printStackTrace();
        }
    }
}
