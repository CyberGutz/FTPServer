package Client;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.util.Date;

import javax.swing.JOptionPane;

import model.Endereco;
import model.Port;

public class Client {
    public static Socket client;

    public Client(){
        conectar(client);
    }

    public static void conectar(Socket cliente){
        try {

            client = new Socket(new Endereco().getEndereco(), Port.PORT.getPort());            

        } catch (Exception e) {
            e.printStackTrace();
        } 
    }

    public static void transmitirMensagem() throws ClassNotFoundException{
        try {
            ObjectInputStream entrada;
            entrada = new ObjectInputStream(client.getInputStream());
            Date data_atual = (Date)entrada.readObject();
            JOptionPane.showMessageDialog(null, "Data recebida do servidor: " + data_atual.toString());
            entrada.close();
            System.out.println("Conexão encerrada");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }
}
