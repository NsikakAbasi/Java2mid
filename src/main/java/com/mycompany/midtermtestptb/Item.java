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
public class Item {
    protected String _name;
    protected int _barCode;
    protected double _price;
    protected final double hst = 0.13;
    
    public Item (String name, int barCode, double price){
        _name = name;
        _barCode = barCode;
        _price = price;
        
    }

    public String getName() {
        return _name;
    }

    public void setName(String _name) {
        this._name = _name;
    }

    public int getBarCode() {
        return _barCode;
    }

    public void setBarCode(int _barCode) {
        this._barCode = _barCode;
    }

    public double getPrice() {
        return _price;
    }

    public void setPrice(double _price) {
        this._price = _price;
    }

    public double getHst() {
        return hst;
    }
    
    public double taxesAndFees(){
        double tax = getPrice() * hst;
        return tax;
    }
    
    @Override
    public String toString(){
        String str =  _name + ", " + _barCode + ", " + "price $" + _price;
        return str;
    }
}
