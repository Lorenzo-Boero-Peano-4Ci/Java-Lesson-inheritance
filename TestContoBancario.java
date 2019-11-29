/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testcontobancario;

/**
 *
 * @author boero.lorenzo
 */
public class TestContoBancario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ContoBancario c1 = new ContoBancario("A1", 100);
        System.out.println(c1.getnConto() + " " + c1.getBilancioConto());
    }
    
}
