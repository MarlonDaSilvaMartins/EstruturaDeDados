package br.com.estruturadedados.listexemplo;
import br.com.estruturadedados.carro.Carro;
import org.w3c.dom.ls.LSOutput;

import java.util.*;
import java.util.function.*;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

/* List = (colocar uma breve explicacao aqui)
 * tempo de insercao de 1 milhao de elementos = +-228ms
 * Busca de um elemento = 27ms O(N)
 * Inserção de um elemento no meio da coleção = 3ms O(1)
 * Inserção no inicio e no final da coleção = 3ms O(1) e 0ms O(1)
 * Remoção de todos elementos da coleção = 4ms O(N)
 * Remoção de um elemento no meio da coleção = 2ms O(N)
 * */

public class ListExemplo {
    private List<Carro> al = new ArrayList<>();

    private Random g = new Random();

    private String marca = "Fiat";
    private String[] modelo = {"Palio","Siena"};
    private String[] cor = {"Preto","Prata","Branco"};
    private String chassi;
    //private int r1, r2;

    public void preencherLista(){
        for(int i = 0; i < 10; i++){
            Supplier<Integer> r1 = () -> g.nextInt(2);
            Supplier<Integer> r2 = () -> g.nextInt(3);
            //r1 = g.nextInt(2);
            //r2 = g.nextInt(3);

            if(i < 10){
                chassi = "000000"+(i+1);
            }else if(i < 100){
                chassi = "00000"+(i+1);
            }else if(i < 1000){
                chassi = "0000"+(i+1);
            }else if(i < 10000){
                chassi = "000"+(i+1);
            }else if(i < 100000){
                chassi = "00"+(i+1);
            }else if(i < 1000000){
                chassi = "0"+(i+1);
            }else{
                chassi = ""+(i+1);
            }
            Carro c = new Carro(marca, modelo[r1.get()], cor[r2.get()],chassi);

            al.add(c);
        }
    }//preencherList

    public void mostrarLista(){
        al.forEach(c -> System.out.println(c));
    }//mostrarList

    public Carro buscar(String c){
        Carro resultado = new Carro();
        for(Carro valor : al){
            if(valor.getChassi().equals(c)){
                resultado = valor;
            }
        }
        return resultado;
    }//buscar

    public void inserirInicio(String marca, String modelo, String cor, String chassi){
        Carro c = new Carro(marca,modelo,cor,chassi);
        al.add(0, c);
        System.out.println("Valor inserido com sucesso!");
    }

    public void inserirMeio(int index, String marca, String modelo, String cor, String chassi){
        Carro c = new Carro(marca,modelo,cor,chassi);
        al.add(index, c);
        System.out.println("Valor inserido com sucesso!");
    }

    public void inserirFim(String marca, String modelo, String cor){
        chassi = ""+al.size()+1;
        Carro c = new Carro(marca,modelo,cor,chassi);
        al.add(c);
        System.out.println("Valor inserido com sucesso!");
    }

    public void removerTudo(){
        al.clear();
        System.out.println("Valores removidos com sucesso!");
    }

    public void removerMeio(int index){
        al.remove(index);
        System.out.println("Valor removido com sucesso!");
    }

    public void ordenarModelo(){
        Predicate<Carro> validaCor = c -> !c.getModelo().isEmpty();
        Function<Carro,String> mapModelo = c -> c.getModelo();
        Consumer<String> carroConsumer = c -> System.out.println(c);
        al.stream()
                .filter(validaCor)
                .sorted(comparing(Carro::getModelo))
                .map(mapModelo)
                .forEach(carroConsumer);
    }

    public void ordenarLista(){
        al.sort((c1, c2) -> c1.getChassi().compareTo(c2.getChassi()));
    }

    public double soma(List <? extends Number> lista){
        double soma = 0;
        for(Number n : lista){
            soma = soma + n.doubleValue();
        }
        return soma;
    }
}//classe
