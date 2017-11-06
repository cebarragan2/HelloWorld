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
public class AnalystComparison {

    public AnalystComparison(int playMoney, int days, double totalProfitLoss, int daysinvestedstck, int minPurchaseTime, int maxSaleDateTime) {
        this.playMoney = playMoney;
        this.days = days;
        this.totalProfitLoss = totalProfitLoss;
        this.daysInvestedStock = daysinvestedstck;
        this.minPurchaseTime = minPurchaseTime;
        this.maxSaleDateTime = maxSaleDateTime;
    }

    
    
    int playMoney;
    int days;
    double totalProfitLoss;
    int daysInvestedStock;
    int minPurchaseTime;
    int maxSaleDateTime;

    public void setMinPurchaseTime(int minPurchaseTime) {
        this.minPurchaseTime = minPurchaseTime;
    }

    public void setMaxSaleDateTime(int maxSaleDateTime) {
        this.maxSaleDateTime = maxSaleDateTime;
    }

    public int getMinPurchaseTime() {
        return minPurchaseTime;
    }

    public int getMaxSaleDateTime() {
        return maxSaleDateTime;
    }

    
    public void setPlayMoney(int playMoney) {
        this.playMoney = playMoney;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public void setTotalProfitLoss(double totalProfitLoss) {
        this.totalProfitLoss = totalProfitLoss;
    }

    public void setDaysinvestedstck(int daysInvestedStock) {
        this.daysInvestedStock = daysInvestedStock;
    }

    public int getPlayMoney() {
        return playMoney;
    }

    public int getDays() {
        return days;
    }

    public double getTotalProfitLoss() {
        return totalProfitLoss;
    }

    public int getDaysInvestedStock() {
        return daysInvestedStock;
    }
    
    private void profitLossPerDay(double totalProfitLoss,int days)
    {
        
    }
    
    private void stockInvestmentDays (int minPurchaseTime, int maxSaleDateTime)
    {
    
    }
    
    private void stockProfitLossPerDay (double totalProfitLoss, int daysInvestedStock)
    {
        
    }
    
    
}
