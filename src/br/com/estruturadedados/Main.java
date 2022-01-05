package br.com.estruturadedados;

import br.com.estruturadedados.listexemplo.ListExemplo;
import br.com.estruturadedados.mapexemplo.MapExemplo;
import br.com.estruturadedados.queueexemplo.QueueExemplo;
import br.com.estruturadedados.setexemplo.SetExemplo;

/* Queue= (colocar uma breve explicacao aqui)
 * tempo de insercao de 1 milhao de elementos no list = +-269ms
 * Busca de um elemento = 194ms O(n)
 * Inserção de um elemento no meio da coleção = ?ms O(?)
 * Inserção no inicio e no final da coleção = ?ms O(?) e 1ms O(1)
 * Remoção de todos elementos da coleção = 5ms O(N)
 * Remoção de um elemento no meio da coleção = 1ms O(N)
 * */
public class Main {
    public static void main(String[] args){
        //long tempoInicio = System.currentTimeMillis();

        QueueExemplo q = new QueueExemplo();
        q.preencherQueue();
        long tempoInicio = System.currentTimeMillis();
        System.out.println(q.buscar("0675567"));

        System.out.println("tempo:"+(System.currentTimeMillis()-tempoInicio));
    }//main
}//class
/* ?? = (colocar uma breve explicacao aqui)
 * tempo de insercao de 1 milhao de elementos no list = +-?ms
 * Busca de um elemento = ?ms O(?)
 * Inserção de um elemento no meio da coleção = ?ms O(?)
 * Inserção no inicio e no final da coleção = ?ms O(?) e ?ms O(?)
 * Remoção de todos elementos da coleção = ?ms O(?)
 * Remoção de um elemento no meio da coleção = ?ms O(?)
 * */