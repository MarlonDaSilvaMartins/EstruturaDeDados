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
    Queue<Carro> q = new LinkedList<>();

    private Random g = new Random();

    private String marca = "Fiat";
    private String[] modelo = {"Palio","Siena"};
    private String[] cor = {"Preto","Prata","Branco"};
    private String chassi;
    private LocalDate data;
    private int r1, r2;

    public void preencher(){
        try{
            for(int i = 0; i < 100; i++) {
                r1 = g.nextInt(2);
                r2 = g.nextInt(3);
                chassi = ""+(i+1);
                data = LocalDate.of(2022, 1, 10);
                Carro c = new Carro(marca, modelo[r1], cor[r2], chassi,data);

                q.add(c);
            }
        }catch (Exception e){
            System.out.println("Erro: "+e.getMessage());
        }
    }//preencherList

    public void mostrar(){
        System.out.println(q);
    }//mostrarList

    public Carro buscar(String c){
        String primeiro = q.peek().getChassi();
        Carro resultado = new Carro();
        try{
            do{
                if(q.peek().getChassi().equals(c)){
                    resultado = q.peek();
                }
                q.add(q.poll());
            }while(!q.peek().getChassi().equals(primeiro));
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
            chassi = ""+(q.size()+1);
            Carro c = new Carro(marca,modelo,cor,chassi,data);
            q.add(c);
            System.out.println("Valor inserido com sucesso!");
        }catch (NullPointerException n){
            System.out.println("Erro: "+n.getMessage());
        }catch (Exception e){
            System.out.println("Erro: "+e.getMessage());
        }
    }

    public void removerTudo(){
        try{
            q.clear();
            System.out.println("Valores removidos com sucesso!");
        }catch (NullPointerException n){
            System.out.println("Erro: "+n.getMessage());
        }catch (Exception e){
            System.out.println("Erro: "+e.getMessage());
        }
    }

    public void removerMeio(String c){
        try{
            String primeiro = q.peek().getChassi();
            do{
                if(q.peek().getChassi().equals(c)){
                    q.poll();
                    System.out.println("Valor removido com sucesso!");
                }
                q.add(q.poll());
            }while (!q.peek().getChassi().equals(primeiro));
        }catch (NullPointerException n){
            System.out.println("Erro: "+n.getMessage());
        }catch (Exception e){
            System.out.println("Erro: "+e.getMessage());
        }
    }
}
