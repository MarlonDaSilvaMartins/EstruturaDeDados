package br.com.estruturadedados;

import br.com.estruturadedados.listexemplo.ListExemplo;
import br.com.estruturadedados.mapexemplo.MapExemplo;
import br.com.estruturadedados.queueexemplo.QueueExemplo;
import br.com.estruturadedados.setexemplo.LinkedHashSetExemplo;
import br.com.estruturadedados.setexemplo.SetExemplo;
import br.com.estruturadedados.setexemplo.TreeSetExemplo;

public class Main {
    public static void main(String[] args){
        long tempoInicio = System.currentTimeMillis();


        //long tempoInicio = System.currentTimeMillis();

        System.out.println("tempo:"+(System.currentTimeMillis()-tempoInicio));
    }//main
}//class
/* ?? = (colocar uma breve explicacao aqui)
 * tempo de insercao de 1 milhao de elementos = +-?ms
 * Busca de um elemento = ?ms
 * Inserção de um elemento = ?ms
 * Remoção de todos elementos da coleção = ?ms
 * Remoção de um elemento no meio da coleção = ?ms
 * */