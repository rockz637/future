package com.company;

import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

public class CommonBehave {
    int apID, noOP,vp,rp ,cp;
    float price;
    float version,ramEfficieny,compatabilityScore;
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
        System.out.println("Total cost = "+(noOP*(price+ vp + rp+cp)));
    }
    void setFeaturesAndroid(float version,float ramEfficieny,float compatabilityScore){
        this.version=version;
        this.ramEfficieny=ramEfficieny;
        this.compatabilityScore=compatabilityScore;
    }
    void versionPriceAndroid(){
        if(version >= 1 && version<=5){
            vp=10000;
        }
        else if (version>=6 && version<=10){
            vp=20000;

        }
        else if (version == 11) {
            vp=30000;
        }


    }
    void ramPriceAndroid(){
        if(ramEfficieny<=80){
            rp =20000;
        }
        else if(ramEfficieny>=81){
            rp =30000;
        }

    }
    void priceCompatabilityScore(){
        if(compatabilityScore>=1&&compatabilityScore<=5){
            cp=30000;
        }
        else if (compatabilityScore>=6&&compatabilityScore<=10){
            cp= 40000;
        }

    }
    void diplayPriceFeatures(){
        System.out.println("Version Price: "+vp+" x "+noOP+"\nRam Efficieny Price: "+rp+" x "+noOP+"\nCompatability price: "+cp+" x "+noOP);

    }
    void setFeaturesIos(float version,float ramEfficieny,float compatabilityScore){
        this.version=version;
        this.ramEfficieny=ramEfficieny;
        this.compatabilityScore=compatabilityScore;
    }
    void versionPriceIos(){
        if(version >= 1 && version<=5){
            vp=20000;
        }
        else if (version>=6 && version<=10){
            vp=30000;

        }
        else if (version == 11) {
            vp=40000;
        }


    }
    void ramPriceIos(){
        if(ramEfficieny<=80){
            rp =20000;
        }
        else if(ramEfficieny>=81){
            rp =25000;
        }

    }
    void priceCompatabilityIos(){
        if(compatabilityScore>=1&&compatabilityScore<=5){
            cp=40000;
        }
        else if (compatabilityScore>=6&&compatabilityScore<=10){
            cp= 50000;
        }

    }


}
