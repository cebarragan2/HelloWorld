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
public class Inversor {

    public Inversor(int sharePurchased, Share valueShare) {
        this.sharePurchased = sharePurchased;
        this.valueShare = valueShare;
    }
    
    
    int sharePurchased;
    Share valueShare;

    public int getSharePurchased() {
        return sharePurchased;
    }

    public Share getValueShare() {
        return valueShare;
    }

    public void setSharePurchased(int sharePurchased) {
        this.sharePurchased = sharePurchased;
    }

    public void setValueShare(Share valueShare) {
        this.valueShare = valueShare;
    }
    
    private void purchaseValue ( int sharePurchased, Share valueShare)
    {
        
    }
    
    
    
}
