package br.com.estruturadedados.carro;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Carro implements Comparable<Carro>{
    private String marca;
    private String modelo;
    private String cor;
    private String chassi;
    private LocalDate data;

    public Carro() {
    }

    public Carro(String marca, String modelo, String cor, String chassi, LocalDate data) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.chassi = chassi;
        this.data = data;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return "Carro{" +
                "marca='" + marca +
                "', modelo='" + modelo +
                "', cor='" + cor +
                "', chassi='" + chassi +
                "', data='" + data.format(formatter)+
                "}\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Carro carro = (Carro) o;
        return Objects.equals(marca, carro.marca) && Objects.equals(modelo, carro.modelo) && Objects.equals(cor, carro.cor) && Objects.equals(chassi, carro.chassi);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marca, modelo, cor, chassi);
    }

    @Override
    public int compareTo(Carro c) {
        return this.chassi.compareTo(c.chassi);
    }
}
