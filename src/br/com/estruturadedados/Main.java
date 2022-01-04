package br.com.estruturadedados;

import br.com.estruturadedados.listexemplo.ListExemplo;
import br.com.estruturadedados.mapexemplo.MapExemplo;

/* Map
 * tempo de insercao de 1 milhao de elementos no list = +-403ms
 * Busca de um elemento = 20ms O(1)
 * Inserção de um elemento no meio da coleção = 1ms O(1) //sobreescreveu o valor
 * Inserção no inicio e no final da coleção = ?ms O(1) e ?ms O(1) // nao tem comeco e fim
 * Remoção de todos elementos da coleção = 5ms O(n)
 * Remoção de um elemento no meio da coleção = 0ms O(1)
 * */
public class Main {
    public static void main(String[] args){
        //long tempoInicio = System.currentTimeMillis();

        MapExemplo m = new MapExemplo();
        m.preencherMap();

        long tempoInicio = System.currentTimeMillis();

        m.inserirMeio("Fiat","Palio","Vermelho","0123123");

        System.out.println("tempo:"+(System.currentTimeMillis()-tempoInicio));
    }//main
}//class
