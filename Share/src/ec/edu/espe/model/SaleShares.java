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
public class SaleShares {

    public SaleShares(int salePrice, int saleShares, int brokerCommission, int initialSharePrice) {
        this.salePrice = salePrice;
        this.saleShares = saleShares;
        this.brokerCommission = brokerCommission;
        this.initialSharePrice = initialSharePrice;
    }
    
    int salePrice;
    int saleShares;
    int brokerCommission;
    int initialSharePrice;

    public void setSalePrice(int salePrice) {
        this.salePrice = salePrice;
    }

    public void setSaleShares(int saleShares) {
        this.saleShares = saleShares;
    }

    public void setBrokerCommission(int brokerCommission) {
        this.brokerCommission = brokerCommission;
    }

    public void setInitialSharePrice(int initialSharePrice) {
        this.initialSharePrice = initialSharePrice;
    }

    public int getSalePrice() {
        return salePrice;
    }

    public int getSaleShares() {
        return saleShares;
    }

    public int getBrokerCommission() {
        return brokerCommission;
    }

    public int getInitialSharePrice() {
        return initialSharePrice;
    }
    
    private void gain ( int salePrice,int saleShares, int brokerCommission, int initialSharePrice)
    {
        
    }
    
}
