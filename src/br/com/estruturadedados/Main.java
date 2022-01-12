package br.com.estruturadedados;

import br.com.estruturadedados.listexemplo.ListExemplo;
import br.com.estruturadedados.mapexemplo.LinkedHashMapExemplo;
import br.com.estruturadedados.mapexemplo.MapExemplo;
import br.com.estruturadedados.mapexemplo.TreeMapExemplo;
import br.com.estruturadedados.queueexemplo.QueueExemplo;
import br.com.estruturadedados.setexemplo.LinkedHashSetExemplo;
import br.com.estruturadedados.setexemplo.SetExemplo;
import br.com.estruturadedados.setexemplo.TreeSetExemplo;
import com.sun.source.tree.Tree;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args){
        //long tempoInicio = System.currentTimeMillis();

        ListExemplo l = new ListExemplo();
        //l.preencherLista();
        //l.ordenarModelo();

        List<Integer> listaInt = Arrays.asList(10,20,30,40);

        List<Double> listaDouble = Arrays.asList(9.6,20.4,30.5,39.5);

        System.out.println(l.soma(listaInt));

        System.out.println(l.soma(listaDouble));


        //System.out.println("tempo:"+(System.currentTimeMillis()-tempoInicio));
    }//main
}//class
/* TreeMap = (colocar uma breve explicacao aqui)
 * tempo de insercao de 1 milhao de elementos = +-748ms
 * Busca de um elemento = 47ms
 * Inserção de um elemento = 0ms
 * Remoção de todos elementos da coleção = 0ms
 * Remoção de um elemento no meio da coleção = 0ms
 * */