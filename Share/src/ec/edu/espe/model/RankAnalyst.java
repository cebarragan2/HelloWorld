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
public class RankAnalyst {

    public RankAnalyst(int quantity, int purchaseDateTime, double purchasePrice, double purchaseFee, int saleDateTime, double salePrice, double saleFee) {
        this.quantity = quantity;
        this.purchaseDateTime = purchaseDateTime;
        this.purchasePrice = purchasePrice;
        this.purchaseFee = purchaseFee;
        this.saleDateTime = saleDateTime;
        this.salePrice = salePrice;
        this.saleFee = saleFee;
    }
    
    int quantity;
    int purchaseDateTime;
    double purchasePrice;
    double purchaseFee;
    int saleDateTime;
    double salePrice;
    double saleFee;

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPurchaseDateTime(int purchaseDateTime) {
        this.purchaseDateTime = purchaseDateTime;
    }

    public void setPurchasePrice(double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public void setPurchaseFee(double purchaseFee) {
        this.purchaseFee = purchaseFee;
    }

    public void setSaleDateTime(int saleDateTime) {
        this.saleDateTime = saleDateTime;
    }

    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }

    public void setSaleFee(double saleFee) {
        this.saleFee = saleFee;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getPurchaseDateTime() {
        return purchaseDateTime;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public double getPurchaseFee() {
        return purchaseFee;
    }

    public int getSaleDateTime() {
        return saleDateTime;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public double getSaleFee() {
        return saleFee;
    }
    
    private void inv (int quantity    ,double purchasePrice, double purchaseFee,double saleFee )
    {
        
    }
    
    private void pl (int quantity ,double salePrice, int inv )
    {
        
    }
    
}
