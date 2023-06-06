package model;

import java.net.Inet4Address;
import java.net.UnknownHostException;

public class Endereco {
    private String aux;
    private static String endereco = "";

    public Endereco() throws UnknownHostException{
        aux = Inet4Address.getLocalHost().toString();
        endereco = defineEndereco();
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

    public static String getEndereco(){
        return endereco;
    }
}
