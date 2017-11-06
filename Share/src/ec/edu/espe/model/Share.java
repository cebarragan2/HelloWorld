/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.model;

/**
 *
 * @author usuario
 */
public class Share {

    public Share(int valueCompany, int numberShares) {
        this.valueCompany = valueCompany;
        this.numberShares = numberShares;
    }
    
    int valueCompany;
    int numberShares;

    public int getValueCompany() {
        return valueCompany;
    }

    public int getNumberShares() {
        return numberShares;
    }
    
    public void setValueCompany(int valueCompany) {
        this.valueCompany = valueCompany;
    }

    public void setNumberShares(int numberShares) {
        this.numberShares = numberShares;
    }
    
    private void shareValue (int valueCompany, int numberShares)
    {
        
    }
    
    
    
    
}
