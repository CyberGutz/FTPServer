package client;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.util.Date;

import javax.swing.JOptionPane;

import model.Endereco;

public class Client {
    public static Socket client;

    public Client(){
    }

    public void conectar(){
        try {

            new Endereco();
            client = new Socket(Endereco.getEndereco(), Endereco.getPorta());  
            System.out.println("Cliente Conectado com sucesso!");          

        } catch (Exception e) {
            System.out.println("Erro ao conectar cliente");
            e.printStackTrace();
        } 
    }

    public void transmitirMensagem() throws ClassNotFoundException{
        try {
            ObjectInputStream entrada;
            entrada = new ObjectInputStream(client.getInputStream());
            Date data_atual = (Date)entrada.readObject();
            JOptionPane.showMessageDialog(null, "Data recebida do servidor: " + data_atual.toString());
            entrada.close();
            System.out.println("Conexão encerrada");
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
}
