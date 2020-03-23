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
public class Armor3W extends UlefonePrototype {

    
    protected Armor3W(Armor3W UlefoneArmor3W) {
		this.preco = UlefoneArmor3W.getPreco();
		this.IP68_IP69k = UlefoneArmor3W.isIP68_IP69k();
                this.capacidadeBateria = UlefoneArmor3W.getCapacidadeBateria();
	}

    public Armor3W() {
    }
    
   
    @Override
    public UlefonePrototype clone() {
        return new Armor3W(this);
        
    }

    @Override
    public String viewInfo() {
            return "Modelo do Smartphone: Armor 3W, Marca: Ulefone, Bateria: "+getCapacidadeBateria() 
                    + ", Preço: "+getPreco()+", IP68/IP69k: "+isIP68_IP69k();
    }
    
}
