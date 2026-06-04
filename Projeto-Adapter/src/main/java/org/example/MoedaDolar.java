package org.example;

public class MoedaDolar implements IMoeda{
    
    private float valorConverido;

    @Override
    public float getValorConverido() {
        return valorConverido;
    }

    @Override
    public void setValorConverido(float valorConverido) {
        this.valorConverido = valorConverido;
    }
}
