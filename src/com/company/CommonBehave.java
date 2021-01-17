package com.company;

public class CommonBehave {
    int apID, noOP;
    float price;
    CommonBehave(){
        System.out.println("BILL");

    }
    void setCommonBehave( int apID, int noOP, float price){
        this.apID=apID;
        this.noOP=noOP;
        this.price=price;
    }
    void displayCommonBehave(){
        System.out.println("ID ="+apID+"\nNumber of modules= "+noOP+"\nCost of a single module "+price);
    }
    void Calculation(){
        System.out.println("Total cost = "+noOP*price);
    }

}
