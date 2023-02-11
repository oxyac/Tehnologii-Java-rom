package com.oxyac.intro.lucrare;
//3) Salon de automobile (nr, marcă, model, culoare, țară, preț).
public class CarDealer {
    private String nr;
    private String marca;
    private String model;
    private String coloare;
    private String tara;
    private String pret;

    public CarDealer() {
    }

    public CarDealer(String nr, String marca, String model, String coloare) {
        this.nr = nr;
        this.marca = marca;
        this.model = model;
        this.coloare = coloare;
    }

    public CarDealer(String nr, String marca, String model, String coloare, String tara, String pret) {
        this.nr = nr;
        this.marca = marca;
        this.model = model;
        this.coloare = coloare;
        this.tara = tara;
        this.pret = pret;
    }

    @Override
    public String toString() {
        return "CarDealer{" +
                "nr='" + nr + '\'' +
                ", marca='" + marca + '\'' +
                ", model='" + model + '\'' +
                ", coloare='" + coloare + '\'' +
                ", tara='" + tara + '\'' +
                ", pret='" + pret + '\'' +
                '}';
    }
}
