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
public class Armor6E extends UlefonePrototype {

    
    protected Armor6E(Armor6E UlefoneArmor6E) {
		this.preco = UlefoneArmor6E.getPreco();
		this.IP68_IP69k = UlefoneArmor6E.isIP68_IP69k();
                this.capacidadeBateria = UlefoneArmor6E.getCapacidadeBateria();
	}

    public Armor6E() {
    }
    
    
    
    @Override
    public UlefonePrototype clone() {
        return new Armor6E(this);
        
    }

    @Override
    public String viewInfo() {
            return "Modelo do Smartphone: Armor 6E, Marca: Ulefone, Bateria: "+getCapacidadeBateria() 
                    + ", Preço: "+getPreco()+", IP68/IP69k: "+isIP68_IP69k();
    }
    
}
