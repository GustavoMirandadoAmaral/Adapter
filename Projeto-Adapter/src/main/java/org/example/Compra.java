package org.example;

public class Compra {

    IMoeda moeda;
    MoedaAdapter adaptador;

    public Compra() {
        moeda = new MoedaDolar();
        adaptador = new MoedaAdapter(moeda);
    }

    public void setValorEmDolar(float valor) {
        moeda.setValorConverido(valor);
        adaptador.salvarValor();
    }

    public String getValorEmDolar() {
        return adaptador.recuperarValor();
    }

    public float getValorEmReal() {
        return adaptador.getValor();
    }
}
