package br.com.estruturadedados;

import br.com.estruturadedados.listexemplo.ListExemplo;
import br.com.estruturadedados.mapexemplo.MapExemplo;
import br.com.estruturadedados.setexemplo.SetExemplo;

/* Set = representa grupos de elementos sem duplicatas, é utilizado quando não precisar ter nenhum dado duplicado na coleção.
 * tempo de insercao de 1 milhao de elementos no list = +-774ms
 * Busca de um elemento = 114ms O(n)
 * Inserção de um elemento no meio da coleção = ?ms O(1) //
 * Inserção no inicio e no final da coleção = ?ms O(?) e 1ms O(1) //peguei o valor do size() e inseri com o numero do chassi maior que o ultimo adicionado
 * Remoção de todos elementos da coleção = 5ms O(n)
 * Remoção de um elemento no meio da coleção = 43ms O(n)
 * */
public class Main {
    public static void main(String[] args){
        //long tempoInicio = System.currentTimeMillis();

        SetExemplo s = new SetExemplo();
        s.preencherSet();
        long tempoInicio = System.currentTimeMillis();
        s.removerMeio("0000005");
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