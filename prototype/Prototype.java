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
public class Prototype {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    Armor6E prototipo1 = new Armor6E();
    Armor3W prototipo2 = new Armor3W();
    
    UlefonePrototype novoUlefoneArmor6E = prototipo1.clone();
    novoUlefoneArmor6E.setPreco(980.00);
    novoUlefoneArmor6E.setCapacidadeBateria(5000);
    novoUlefoneArmor6E.setIP68_IP69k(true);
        System.out.println(novoUlefoneArmor6E.viewInfo());
        
    UlefonePrototype ulefoneArmor6EUsado = prototipo1.clone();
    ulefoneArmor6EUsado.setPreco(780.00);
    ulefoneArmor6EUsado.setCapacidadeBateria(5000);
    ulefoneArmor6EUsado.setIP68_IP69k(true);
        System.out.println(ulefoneArmor6EUsado.viewInfo());
    
    UlefonePrototype novoUlefoneArmor3W = prototipo2.clone();
    novoUlefoneArmor3W.setPreco(1280.00);
    novoUlefoneArmor3W.setCapacidadeBateria(10300);
    novoUlefoneArmor3W.setIP68_IP69k(true);
        System.out.println(novoUlefoneArmor3W.viewInfo());
        
    UlefonePrototype ulefoneArmor3WUsado = prototipo2.clone();
    ulefoneArmor3WUsado.setPreco(780.00);
    ulefoneArmor3WUsado.setCapacidadeBateria(10300);
    ulefoneArmor3WUsado.setIP68_IP69k(true);
        System.out.println(ulefoneArmor3WUsado.viewInfo());
    
    
    }
    
}
