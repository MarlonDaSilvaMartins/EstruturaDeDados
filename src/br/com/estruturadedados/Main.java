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
import org.w3c.dom.ls.LSOutput;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
//todo  cookies, local storage, ver pq uma estrutura é mais rapida que outra
public class Main {
    public static void main(String[] args){
        //long tempoInicio = System.currentTimeMillis();

        //ListExemplo list = new ListExemplo();
        LinkedListExemplo list = new LinkedListExemplo();
        //QueueExemplo queue= new QueueExemplo();
        //LinkedHashSetExemplo set = new LinkedHashSetExemplo();
        //SetExemplo set = new SetExemplo();
        //TreeSetExemplo set = new TreeSetExemplo();
        //LinkedHashMapExemplo map = new LinkedHashMapExemplo();
        //MapExemplo map = new MapExemplo();
        //TreeMapExemplo map = new TreeMapExemplo();
        list.preencher();
        //LocalDate data = LocalDate.now();
        //list.inserirFim("Fiat","Palio","Vermelho",data);
        //System.out.println(list.buscar(56));
        list.mostrar();


        //System.out.println("tempo:"+(System.currentTimeMillis()-tempoInicio));

        //list.ordenarModelo();
        //list.inserirFim("Fiat","Siena","Vermelho");
        //list.mostrarLista();

        /*
        Optional<Carro> retorno = Optional.ofNullable(list.buscar(9));
        if(retorno.isPresent()){
            System.out.println("Carro encontrado \n"+retorno);
        } else {
            System.out.println("Carro nao encontrado");
        }*/

        var retorno = Optional.ofNullable(list.buscar(9)).map(Carro::getChassi).orElse(null);

        /*Wildcard
        List<Integer> listaInt = Arrays.asList(10,20,30,40);
        List<Double> listaDouble = Arrays.asList(9.6,20.4,30.5,39.5);
        System.out.println(list.soma(listaInt));
        System.out.println(list.soma(listaDouble));
         */
    }//main
}//class