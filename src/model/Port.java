package model;

public enum Port {
    //O Enum PORT contém o número da porta que será usada para comunicação.
    PORT(12385);

    private final int num;

    Port(int num){
        this.num = num;
    }

    // A função getPort() retorna o número da porta.
    public int getPort(){
        return this.num;
    }
}
