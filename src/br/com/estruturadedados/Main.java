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

public class Main {
    public static void main(String[] args){
        //long tempoInicio = System.currentTimeMillis();

        //LinkedHashMapExemplo m = new LinkedHashMapExemplo();
        TreeMapExemplo m = new TreeMapExemplo();
        m.preencherMap();
        long tempoInicio = System.currentTimeMillis();
        //System.out.println(l.buscar("0934567"));

        m.inserirMeio("Fiat","Siena","Vermelho","0000001");
        System.out.println(m.buscar("0000001"));


        System.out.println("tempo:"+(System.currentTimeMillis()-tempoInicio));
    }//main
}//class
/* TreeMap = (colocar uma breve explicacao aqui)
 * tempo de insercao de 1 milhao de elementos = +-748ms
 * Busca de um elemento = 47ms
 * Inserção de um elemento = 0ms
 * Remoção de todos elementos da coleção = 0ms
 * Remoção de um elemento no meio da coleção = 0ms
 * */