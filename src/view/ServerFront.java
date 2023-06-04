package view;

import Server.Server;

public class ServerFront {
    Server server = new Server();

    public void serverMain(){
        System.out.println("Você entrou como Server... \n\n\n\n");
        server.enviarMensagem();
    }
}
