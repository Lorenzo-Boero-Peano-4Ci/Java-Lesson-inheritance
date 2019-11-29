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
public class ContoBancario {
    
    private String nConto;
    private int bilancioConto;

    public ContoBancario(String nConto) {
        this.nConto = nConto;
        bilancioConto = 0;
    }

    public ContoBancario(String nConto, int bilancioConto) {
        this.nConto = nConto;
        this.bilancioConto = bilancioConto;
    }

    public String getnConto() {
        return nConto;
    }

    public int getBilancioConto() {
        return bilancioConto;
    }
    
    public void depositoDenaro() {
        int deposito = 0;
        bilancioConto = deposito + bilancioConto;
    }
    
    public void prelievoDenaro(){
        int prelievo = 0;
        if(prelievo < bilancioConto)
            bilancioConto = bilancioConto - prelievo;
    }
    
}
