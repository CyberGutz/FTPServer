package view;

import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JInternalFrame;

public class App {
    public static void main(String[] args) throws Exception {
        // int option;
        // Scanner entrada = new Scanner(System.in);

        System.out.println("********** SERVIDOR FTP ***********");
        System.out.println("*                                 *");
        System.out.println("*         MENU DE OPCOES          *");
        System.out.println("*                                 *");
        System.out.println("*      1- ENTRAR COMO CLIENTE     *");
        System.out.println("*      2- ENTRAR COMO SERVIDOR    *");
        System.out.println("*      0- SAIR                    *");
        System.out.println("*                                 *");
        System.out.println("* -----> DIGITE SUA OPÇÃO: <----- *");
       
        // option = entrada.nextInt();

        // switch(option){
        //     case 1:

        //     break;

        //     case 2:

        //     break; 

        //     case 0:
        //         System.out.println("Terminando o Programa ....");
        //         System.exit(0);
        //     break;
        // }

        JFrame frame = new JFrame("Servidor FTP");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
