/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.midtermtestptb;

/**
 *
 * @author Nsikak Spoon
 */
public class OnlineItem extends Item {
    protected String _url;
    
    public OnlineItem(String name, int barCode, double price, String url){
        super(name,barCode,price);
        _url = url;
    }

    public String getUrl() {
        return _url;
    }

    public void setUrl(String _url) {
        this._url = _url;
    }
    
    @Override
    public double taxesAndFees(){
        double tax = (getPrice() * getHst()) + 10;
        return tax;
    }
    @Override
    public String toString(){
        String str =  _name + ", " + _barCode + ", " + "price $" + _price + ", " +_url;
        return str;
    }
}
