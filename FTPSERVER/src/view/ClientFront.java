package view;

import client.Client;

public class ClientFront {
    public void clientMain() throws ClassNotFoundException{
        Client client = new Client();
        System.out.println("Você entrou como cliente\n\n\n");
        client.transmitirMensagem();
    }
}
