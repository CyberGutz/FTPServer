package model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.Inet4Address;
import java.net.UnknownHostException;
public class Endereco {
    private String aux;
    private static String endereco = "";
    private static int porta = 12385;

    public Endereco() throws UnknownHostException{
        aux = Inet4Address.getLocalHost().toString();
        endereco = defineEndereco();
        salvaEndereco();
    }

    private String defineEndereco(){
        for(int i = 0 ; i < aux.length(); i++){
            if(aux.charAt(i) == '/'){
                for( int j = i+1; j < aux.length(); j++){
                    endereco = endereco + aux.charAt(j);
                }
            }
        }
        return endereco;
    }

    private void salvaEndereco(){
        File aux = new File("./serverAddress/address.txt");
        if(aux.exists())
            return;

        else{
            try (BufferedWriter escritor = new BufferedWriter(new FileWriter(aux))) {
                escritor.write(endereco);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static String getEndereco(){
        String end = "";

        try {
            BufferedReader read = new BufferedReader(new FileReader("./serverAddress/address.txt"));
            end = read.readLine();
            read.close();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


        System.out.println("Endereço do server" + end);
        return end;

    }

    public static int getPorta(){
        return porta;
    }
}
