package br.com.estruturadedados;

import br.com.estruturadedados.fila.Fila;

public class Main {
    public static void main(String[] args){
        //fila
        Fila f = new Fila(10);
        for(int i = 0; i < 10;i++){
            f.insere(i);
        }
        System.out.println("*Fila");
        while(!f.isEmpty()){
            System.out.println(f.remove());
        }
    }
}
