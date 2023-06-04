package model;

public enum Port {
    //O Enum PORT contém o número da porta que será usada para comunicação.
    PORT(12385);

    private static int num;

    Port(int num){
        num = num;
    }

    // A função getPort() retorna o número da porta.
    public static int getPort(){
        return num;
    }
}
