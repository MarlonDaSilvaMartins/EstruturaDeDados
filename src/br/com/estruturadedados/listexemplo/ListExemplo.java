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
    private List<Carro> al = new ArrayList<>();

    private Random g = new Random();

    private String marca = "Fiat";
    private String[] modelo = {"Palio","Siena"};
    private String[] cor = {"Preto","Prata","Branco"};
    private String chassi;
    private LocalDate data;
    //private int r1, r2;

    public void preencher(){
        for(int i = 0; i < 1000000; i++){
            Supplier<Integer> r1 = () -> g.nextInt(2);
            Supplier<Integer> r2 = () -> g.nextInt(3);
            //r1 = g.nextInt(2);
            //r2 = g.nextInt(3);
            chassi = ""+(i+1);
            data = LocalDate.of(2022, 1, 10);
            Carro c = new Carro(marca, modelo[r1.get()], cor[r2.get()],chassi, data);

            al.add(c);
        }
    }//preencherList

    public void mostrar(){
        al.forEach(c -> System.out.println(c));
    }//mostrarList

    public Carro buscar(int c){
        Carro resultado = new Carro();
        try{
            resultado = al.get(c);
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
    }//buscar

    public void inserirInicio(String marca, String modelo, String cor, String chassi,LocalDate data){
        try{
            Carro c = new Carro(marca,modelo,cor,chassi,data);
            al.add(0, c);
            System.out.println("Valor inserido com sucesso!");
        }catch (Exception e){
            System.out.println("Erro: "+e.getMessage());
        }
    }

    public void inserirMeio(int index, String marca, String modelo, String cor, String chassi,LocalDate data){
        try{
            Carro c = new Carro(marca,modelo,cor,chassi,data);
            al.add((index-1), c);
            System.out.println("Valor inserido com sucesso!");
        }catch (Exception e){
            System.out.println("Erro: "+e.getMessage());
        }
    }

    public void inserirFim(String marca, String modelo, String cor, LocalDate data){
        try{
            chassi = ""+(al.size()+1);
            Carro c = new Carro(marca,modelo,cor,chassi,data);
            al.add(c);
            System.out.println("Valor inserido com sucesso!");
        }catch (NullPointerException n){
            System.out.println("Erro: "+n.getMessage());
        }catch (Exception e){
            System.out.println("Erro: "+e.getMessage());
        }
    }

    public void removerTudo(){
        try{
            al.clear();
            System.out.println("Valores removidos com sucesso!");
        }catch (NullPointerException n){
            System.out.println("Erro: "+n.getMessage());
        }catch (Exception e){
            System.out.println("Erro: "+e.getMessage());
        }
    }

    public void removerMeio(int index){
        try{
            al.remove(index);
            System.out.println("Valor removido com sucesso!");
        }catch (NullPointerException n){
            System.out.println("Erro: "+n.getMessage());
        }catch (Exception e){
            System.out.println("Erro: "+e.getMessage());
        }
    }

    public void ordenarModelo(){
        try{
            Predicate<Carro> validaModelo= c -> !c.getModelo().isEmpty();
            Function<Carro,String> mapModelo = c -> c.getModelo();
            Consumer<String> carroConsumer = c -> System.out.println(c);
            al.stream()
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
            al.sort((c1, c2) -> c1.getCor().compareTo(c2.getCor()));
        }catch (NullPointerException n){
            System.out.println("Erro: "+n.getMessage());
        }catch (Exception e){
            System.out.println("Erro: "+e.getMessage());
        }
    }
    //wildcards
    public double soma(List <? extends Number> lista){
        double soma = 0;
        for(Number n : lista){
            soma = soma + n.doubleValue();
        }
        return soma;
    }
}//classe
