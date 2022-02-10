package br.com.estruturadedados.listexemplo;
import br.com.estruturadedados.carro.Carro;
import org.w3c.dom.ls.LSOutput;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.function.*;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

/* ArrayList = (colocar uma breve explicacao aqui)
 * tempo de insercao de 1 milhao de elementos = +-228ms
 * Busca de um elemento = 27ms
 * Inserção de um elemento no meio da coleção = 3ms
 * Inserção no inicio e no final da coleção = 3ms e 0ms
 * Remoção de todos elementos da coleção = 4ms
 * Remoção de um elemento no meio da coleção = 2ms
 * */

public class ListExemplo {
    private List<Carro> arraylist = new ArrayList<>();

    private Random random = new Random();

    private String marca = "Fiat";
    private String[] modelo = {"Palio","Siena"};
    private String[] cor = {"Preto","Prata","Branco"};
    private String chassi;
    private LocalDate data;

    public void preencher(){
        for(int i = 0; i < 1000000; i++){
            Supplier<Integer> random1 = () -> random.nextInt(2);
            Supplier<Integer> random2 = () -> random.nextInt(3);
            chassi = ""+(i+1);
            data = LocalDate.of(2022, 1, 10);
            Carro carro = new Carro(marca, modelo[random1.get()], cor[random2.get()],chassi, data);

            arraylist.add(carro);
        }
    }//preencherList

    public void mostrar(){
        arraylist.forEach(carro -> System.out.println(carro));
    }//mostrarList

    public Carro buscar(int chassi){
        Carro resultado = new Carro();
        try{
            resultado = arraylist.get(chassi);
        }catch (NullPointerException n){
            System.out.println("Erro: "+n.getMessage());
        }catch (Exception e){
            System.out.println("Erro: "+e.getMessage());
        }finally {
            if(resultado != null){
                return resultado;
            }else{
                return null;
            }
        }
    }//buscar try with resource

    public void inserirInicio(String marca, String modelo, String cor, String chassi,LocalDate data){
        try{
            Carro carro = new Carro(marca,modelo,cor,chassi,data);
            arraylist.add(0, carro);
            System.out.println("Valor inserido com sucesso!");
        }catch (Exception e){
            System.out.println("Erro: "+e.getMessage());
        }
    }

    public void inserirMeio(int index, String marca, String modelo, String cor, String chassi,LocalDate data){
        try{
            Carro carro = new Carro(marca,modelo,cor,chassi,data);
            arraylist.add((index-1), carro);
            System.out.println("Valor inserido com sucesso!");
        }catch (Exception e){
            System.out.println("Erro: "+e.getMessage());
        }
    }

    public void inserirFim(String marca, String modelo, String cor, LocalDate data){
        try{
            chassi = ""+(arraylist.size()+1);
            Carro carro = new Carro(marca,modelo,cor,chassi,data);
            arraylist.add(carro);
            System.out.println("Valor inserido com sucesso!");
        }catch (NullPointerException n){
            System.out.println("Erro: "+n.getMessage());
        }catch (Exception e){
            System.out.println("Erro: "+e.getMessage());
        }
    }

    public void removerTudo(){
        try{
            arraylist.clear();
            System.out.println("Valores removidos com sucesso!");
        }catch (NullPointerException n){
            System.out.println("Erro: "+n.getMessage());
        }catch (Exception e){
            System.out.println("Erro: "+e.getMessage());
        }
    }

    public void removerMeio(int index){
        try{
            arraylist.remove(index);
            System.out.println("Valor removido com sucesso!");
        }catch (NullPointerException n){
            System.out.println("Erro: "+n.getMessage());
        }catch (Exception e){
            System.out.println("Erro: "+e.getMessage());
        }
    }

    public void ordenarModelo(){
        try{
            Predicate<Carro> validaModelo = (Carro carro) -> !carro.getModelo().isEmpty();
            Function<Carro,String> mapModelo = carro -> carro.getModelo();
            Consumer<String> carroConsumer = carro -> System.out.println(carro);
            arraylist.stream()
                    .filter(validaModelo)
                    .sorted(comparing(Carro::getModelo))
                    .map(mapModelo)
                    .forEach(carroConsumer);
        }catch (NullPointerException n){
            System.out.println("Erro: "+n.getMessage());
        }catch (Exception e){
            System.out.println("Erro: "+e.getMessage());
        }
    }

    public void ordenarLista(){
        try{
            arraylist.sort((chassi1, chassi2) -> chassi1.getCor().compareTo(chassi2.getCor()));
        }catch (NullPointerException n){
            System.out.println("Erro: "+n.getMessage());
        }catch (Exception e){
            System.out.println("Erro: "+e.getMessage());
        }
    }
    //wildcards
    public double soma(List <? extends Number> lista){
        double soma = 0;
        for(Number numero : lista){
            soma = soma + numero.doubleValue();
        }
        return soma;
    }
}//classe
