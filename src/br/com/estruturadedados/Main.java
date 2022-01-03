package br.com.estruturadedados;

import br.com.estruturadedados.listexemplo.ListExemplo;
/*
 * tempo de insercao de 1 milhao de elementos no list = +-228ms
 * Busca de um elemento = 27ms
 * Inserção de um elemento no meio da coleção = 3ms
 * Inserção no inicio e no final da coleção = 3ms e 0ms
 * Remoção de todos elementos da coleção = 4ms
 * Remoção de um elemento no meio da coleção = 2ms
 * */
public class Main {
    public static void main(String[] args){
        //long tempoInicio = System.currentTimeMillis();

        ListExemplo l = new ListExemplo();
        l.preencherList();
        long tempoInicio = System.currentTimeMillis();
        l.removerTudo();


        System.out.println("tempo:"+(System.currentTimeMillis()-tempoInicio));
    }//main
}//class
