package br.com.estruturadedados.queueexemplo;
import br.com.estruturadedados.carro.Carro;

import java.time.LocalDate;
import java.util.*;

/* Queue= (colocar uma breve explicacao aqui)
 * tempo de insercao de 1 milhao de elementos = +-269ms
 * Busca de um elemento = 194ms O(n)
 * Inserção de um elemento no meio da coleção = ?ms O(?)
 * Inserção no inicio e no final da coleção = ?ms O(?) e 1ms O(1)
 * Remoção de todos elementos da coleção = 5ms O(N)
 * Remoção de um elemento no meio da coleção = 1ms O(N)
 * */

public class QueueExemplo{
    Queue<Carro> queue = new LinkedList<>();

    private Random random = new Random();

    private String marca = "Fiat";
    private String[] modelo = {"Palio","Siena"};
    private String[] cor = {"Preto","Prata","Branco"};
    private String chassi;
    private LocalDate data;
    private int random1, random2;

    public void preencher(){
        try{
            for(int i = 0; i < 100; i++) {
                random1 = random.nextInt(2);
                random2 = random.nextInt(3);
                chassi = ""+(i+1);
                data = LocalDate.of(2022, 1, 10);
                Carro carro = new Carro(marca, modelo[random1], cor[random2], chassi,data);

                queue.add(carro);
            }
        }catch (Exception e){
            System.out.println("Erro: "+e.getMessage());
        }
    }//preencherList

    public void mostrar(){
        System.out.println(queue);
    }//mostrarList

    public Carro buscar(String chassi){
        String primeiro = queue.peek().getChassi();
        Carro resultado = new Carro();
        try{
            do{
                if(queue.peek().getChassi().equals(chassi)){
                    resultado = queue.peek();
                }
                queue.add(queue.poll());
            }while(!queue.peek().getChassi().equals(primeiro));
            return resultado;
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

    public void inserir(String marca, String modelo, String cor,LocalDate data){
        try{
            chassi = ""+(queue.size()+1);
            Carro carro = new Carro(marca,modelo,cor,chassi,data);
            queue.add(carro);
            System.out.println("Valor inserido com sucesso!");
        }catch (NullPointerException n){
            System.out.println("Erro: "+n.getMessage());
        }catch (Exception e){
            System.out.println("Erro: "+e.getMessage());
        }
    }

    public void removerTudo(){
        try{
            queue.clear();
            System.out.println("Valores removidos com sucesso!");
        }catch (NullPointerException n){
            System.out.println("Erro: "+n.getMessage());
        }catch (Exception e){
            System.out.println("Erro: "+e.getMessage());
        }
    }

    public void removerMeio(String c){
        try{
            String primeiro = queue.peek().getChassi();
            do{
                if(queue.peek().getChassi().equals(c)){
                    queue.poll();
                    System.out.println("Valor removido com sucesso!");
                }
                queue.add(queue.poll());
            }while (!queue.peek().getChassi().equals(primeiro));
        }catch (NullPointerException n){
            System.out.println("Erro: "+n.getMessage());
        }catch (Exception e){
            System.out.println("Erro: "+e.getMessage());
        }
    }
}
