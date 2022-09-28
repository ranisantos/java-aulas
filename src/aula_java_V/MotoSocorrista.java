package aula_java_V;

public class MotoSocorrista implements Socorrista<Moto>{
    public void socorrer(Moto moto){
        System.out.println("Socorro moto:  " + moto.getPlaca());
    }

}
