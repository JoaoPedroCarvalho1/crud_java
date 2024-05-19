package com.mycompany.lojainformatica.models;
/*
 * @author jpcar
 */
public class Computador {
    private final int id;
    private String marca = "AMD";
    private String hd;
    private String processador;

    public Computador(int id, String hd, String processador) {
        this.id = id;
        this.hd = hd;
        this.processador = processador;
    }

    public Computador(String hd, String processador) {
        this.id = 0;
        this.hd = hd;
        this.processador = processador;
    }

    public String getMarca() {
        return marca;
    }

    public String getHd() {
        return hd;
    }

    public String getProcessador() {
        return processador;
    }

    public int getId() {
        return id;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setHd(String hd) {
        this.hd = hd;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

   
    
}