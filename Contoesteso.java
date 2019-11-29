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
public class Contoesteso extends ContoBancario {
    
    public Contoesteso(String nConto, int bilancioConto) {
        super(nConto, bilancioConto);
        fido = 1000;
    }
    private int fido;

    public Contoesteso(String nConto) {
        super(nConto);
        fido = 1000;
    }

    public Contoesteso(int fido, String nConto) {
        super(nConto);
        this.fido = fido;
    }

    public Contoesteso(int fido, String nConto, int bilancioConto) {
        super(nConto, bilancioConto);
        this.fido = fido;
    }

    public int getFido() {
        return fido;
    }

    public void setFido(int fido) {
        this.fido = fido;
    }
    
    @Override
    public void prelievoDenaro(){
        int n = getBilancioConto();
        int prelievo = 0;
        if(prelievo < getBilancioConto() + fido)
            n = n - prelievo;
    }
    
    
    
}
