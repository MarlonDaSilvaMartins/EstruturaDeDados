package br.com.estruturadedados.listexemplo;

import br.com.estruturadedados.carro.Carro;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import static java.util.Comparator.comparing;

/* LinkedList = (colocar uma breve explicacao aqui)
 * tempo de insercao de 1 milhao de elementos = +-196ms
 * Busca de um elemento = 40ms
 * Inserção de um elemento no meio da coleção = 11ms
 * Inserção no inicio e no final da coleção = 12ms e 12ms
 * Remoção de todos elementos da coleção = 3ms
 * Remoção de um elemento no meio da coleção = 1ms
 * */

public class LinkedListExemplo {
    private List<Carro> list = new ArrayList<>();

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

            list.add(carro);
        }
    }//preencherList

    public void mostrar(){
        list.forEach(c -> System.out.println(c));
    }//mostrarList

    public Carro buscar(int chassi){
        Carro resultado = new Carro();
        try{
            resultado = list.get(chassi);
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
            Carro carro  = new Carro(marca,modelo,cor,chassi,data);
            list.add(0, carro );
            System.out.println("Valor inserido com sucesso!");
        }catch (Exception e){
            System.out.println("Erro: "+e.getMessage());
        }
    }

    public void inserirMeio(int index, String marca, String modelo, String cor, String chassi,LocalDate data){
        try{
            Carro carro  = new Carro(marca,modelo,cor,chassi,data);
            list.add((index-1), carro );
            System.out.println("Valor inserido com sucesso!");
        }catch (Exception e){
            System.out.println("Erro: "+e.getMessage());
        }
    }

    public void inserirFim(String marca, String modelo, String cor, LocalDate data){
        try{
            chassi = ""+(list.size()+1);
            Carro carro = new Carro(marca,modelo,cor,chassi,data);
            list.add(carro );
            System.out.println("Valor inserido com sucesso!");
        }catch (NullPointerException n){
            System.out.println("Erro: "+n.getMessage());
        }catch (Exception e){
            System.out.println("Erro: "+e.getMessage());
        }
    }

    public void removerTudo(){
        try{
            list.clear();
            System.out.println("Valores removidos com sucesso!");
        }catch (NullPointerException n){
            System.out.println("Erro: "+n.getMessage());
        }catch (Exception e){
            System.out.println("Erro: "+e.getMessage());
        }
    }

    public void removerMeio(int index){
        try{
            list.remove(index);
            System.out.println("Valor removido com sucesso!");
        }catch (NullPointerException n){
            System.out.println("Erro: "+n.getMessage());
        }catch (Exception e){
            System.out.println("Erro: "+e.getMessage());
        }
    }
}
