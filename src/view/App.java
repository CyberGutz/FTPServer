package view;

import java.util.Scanner;

import Server.*;
import Client.*;

public class App {
    public static void main(String[] args) throws Exception {
        int option;
        try (Scanner entrada = new Scanner(System.in)) {
            ClientFront cf = new ClientFront();
            ServerFront sf = new ServerFront();

            System.out.println("********** SERVIDOR FTP ***********");
            System.out.println("*                                 *");
            System.out.println("*         MENU DE OPCOES          *");
            System.out.println("*                                 *");
            System.out.println("*      1- ENTRAR COMO CLIENTE     *");
            System.out.println("*      2- ENTRAR COMO SERVIDOR    *");
            System.out.println("*      0- SAIR                    *");
            System.out.println("*                                 *");
            System.out.println("* -----> DIGITE SUA OPÇÃO: <----- *");
      
            option = entrada.nextInt();

            switch(option){
                case 1:
                    System.out.println("ENTRANDO COMO CLIENTE ...");
                    cf.clientMain();
                break;

                case 2:
                    System.out.println("ENTRANDO COMO SERVER ...");
                    sf.serverMain();
                break; 

                case 0:
                    System.out.println("Terminando o Programa ....");
                    System.exit(0);
                break;
            }
        }

    }
}
