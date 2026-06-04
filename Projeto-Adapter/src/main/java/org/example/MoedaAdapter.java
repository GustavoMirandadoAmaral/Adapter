package org.example;

public class MoedaAdapter extends MoedaReal {

    private IMoeda moedaReal;

    public MoedaAdapter(IMoeda moedaReal) {
        this.moedaReal = moedaReal;
    }

    public String recuperarValor() {
        float dolar = this.getValor();
        this.moedaReal.setValorConverido(dolar * 5.0f);
        return "R$" + String.format("%.2f", this.moedaReal.getValorConverido());
    }

    public void salvarValor() {
        float real = this.moedaReal.getValorConverido();
        this.setValor(real / 5.0f);
    }
}
