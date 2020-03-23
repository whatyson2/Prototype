/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype;

/**
 *
 * @author whaty
 */
public abstract class UlefonePrototype {
    protected boolean IP68_IP69k;
    protected double preco;
    protected int capacidadeBateria;

    public abstract UlefonePrototype clone();
    
    public abstract String viewInfo();
    
    public boolean isIP68_IP69k() {
        return IP68_IP69k;
    }

    public void setIP68_IP69k(boolean IP68_IP69k) {
        this.IP68_IP69k = IP68_IP69k;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getCapacidadeBateria() {
        return capacidadeBateria;
    }

    public void setCapacidadeBateria(int capacidadeBateria) {
        this.capacidadeBateria = capacidadeBateria;
    }
    
    
}
