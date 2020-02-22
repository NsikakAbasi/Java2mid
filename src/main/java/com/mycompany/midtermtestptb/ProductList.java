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
public class ProductList {
    protected Item _prd1;
    protected Item _prd2;
    protected Item _prd3;
    
    public ProductList(Item prd1, Item prd2, Item prd3){
        _prd1 = prd1;
        _prd2 = prd2;
        _prd3 = prd3;
    }

    public Item getPrd1() {
        return _prd1;
    }

    public void setPrd1(Item _prd1) {
        this._prd1 = _prd1;
    }

    public Item getPrd2() {
        return _prd2;
    }

    public void setPrd2(Item _prd2) {
        this._prd2 = _prd2;
    }

    public Item getPrd3() {
        return _prd3;
    }

    public void setPrd3(Item _prd3) {
        this._prd3 = _prd3;
    }
    
    public double totalPrice(){
        double total = getPrd1().getPrice()+ getPrd2().getPrice()+ getPrd3().getPrice();
        return total;
    }
    
    @Override
    public String toString(){
        String str = getPrd1().toString()+ "\n" + getPrd2().toString()+ "\n" + getPrd3().toString()+ "\n";
        return str;
    }
}
