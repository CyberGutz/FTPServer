package Client;

import java.net.Socket;

import model.Endereco;
import model.Port;

public class Client {
    private static Socket client;
    public static void main(String[] args) {
        try {
            client = new Socket(new Endereco().getEndereco(), Port.PORT.getPort());
            
            
        } catch (Exception e) {
            e.printStackTrace();
        } 
    }
}
