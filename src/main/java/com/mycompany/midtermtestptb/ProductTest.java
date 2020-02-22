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
public class ProductTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Item one = new Item("USB cable",836092124,4.00);
        Item two = new Item("Raspberry Pi B", 498211634,36.50);
        Item three = new Item("Power Supply", 762407342,17.99);
        
        ProductList offline = new ProductList(one,two,three);
        
        System.out.println("List of items:");
        System.out.println(offline.toString());
        System.out.println();
        System.out.println("The total price of all these items is: $" + offline.totalPrice());
        System.out.println("The total tax for item one is: $"+ offline.getPrd1().taxesAndFees());
        System.out.println();
        System.out.println();
        
        OnlineItem four = new OnlineItem("Multimeter", 591493008, 25.89, "http://electrons-r-us.com/3454");
        OnlineItem five = new OnlineItem("HDTV Antenna", 252045833, 25.89,"http://electrons-r-us.com/1631");
        OnlineItem six = new OnlineItem("Solder", 385429475, 14.01, "http://electrons-r-us.com/5776");
        
        OnlineList online = new OnlineList(four,five,six);
        
        System.out.println("List of items:");
        System.out.println(online.toString());
        System.out.println();
        System.out.println("The total price of all these items is: $" + online.totalPrice());
        System.out.println("The total tax for item one is: $"+ online.getPrd1().taxesAndFees());
    }
    
}
