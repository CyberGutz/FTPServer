package view;

import Client.Client;

public class ClientFront {
    public void clientMain() throws ClassNotFoundException{
        Client client = new Client();
        System.out.println("Você entrou como cliente\n\n\n");
        Client.transmitirMensagem();

    }
}
