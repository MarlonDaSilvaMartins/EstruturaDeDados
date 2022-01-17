package br.com.estruturadedados;

import br.com.estruturadedados.carro.Carro;
import br.com.estruturadedados.listexemplo.LinkedListExemplo;
import br.com.estruturadedados.listexemplo.ListExemplo;
import br.com.estruturadedados.mapexemplo.LinkedHashMapExemplo;
import br.com.estruturadedados.mapexemplo.MapExemplo;
import br.com.estruturadedados.mapexemplo.TreeMapExemplo;
import br.com.estruturadedados.queueexemplo.QueueExemplo;
import br.com.estruturadedados.setexemplo.LinkedHashSetExemplo;
import br.com.estruturadedados.setexemplo.SetExemplo;
import br.com.estruturadedados.setexemplo.TreeSetExemplo;
import com.sun.source.tree.Tree;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args){
        //long tempoInicio = System.currentTimeMillis();

        //ListExemplo l = new ListExemplo();
        //LinkedListExemplo l = new LinkedListExemplo();
        //QueueExemplo l = new QueueExemplo();
        //LinkedHashSetExemplo l = new LinkedHashSetExemplo();
        //SetExemplo l = new SetExemplo();
        //TreeSetExemplo l = new TreeSetExemplo();
        //LinkedHashMapExemplo l = new LinkedHashMapExemplo();
        //MapExemplo l = new MapExemplo();
        //TreeMapExemplo l = new TreeMapExemplo();

        //l.preencher();
        //LocalDate data = LocalDate.now();
        //l.inserirFim("Fiat","Palio","Vermelho",data);
        //System.out.println(l.buscar(56));
        //l.mostrar();

        String nome = "marlo";
        System.out.println(nome.hashCode());

        //System.out.println("tempo:"+(System.currentTimeMillis()-tempoInicio));

        //l.ordenarModelo();
        //l.inserirFim("Fiat","Siena","Vermelho");
        //l.mostrarLista();

        /*Optional
        Optional<Carro> retorno = Optional.ofNullable(l.buscar("0000009"));
        if(retorno.isPresent()){
            System.out.println("Carro encontrado \n"+retorno);
        } else {
            System.out.println("Carro nao encontrado");
        }*/

        /*Wildcard
        List<Integer> listaInt = Arrays.asList(10,20,30,40);
        List<Double> listaDouble = Arrays.asList(9.6,20.4,30.5,39.5);
        System.out.println(l.soma(listaInt));
        System.out.println(l.soma(listaDouble));
         */
    }//main
}//class