package com.company;

import java.util.Scanner;

public class Main extends CommonBehave {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Enter your choice\n 1-Android \n 2-IOS");
        int Choice=scan.nextInt();
        Main m = new Main();
        switch (Choice){
            case 1: m.Android();
            break;
            case 2: m.Ios();
            break;
            default:
                System.out.println("Enter the proper value");
        }

    }
    public void Android () {
        System.out.println("no of modules=");
        int NoA=scan.nextInt();
        System.out.println("Enter the verion from 1 to 11");
        int Ve = scan.nextInt();
        System.out.println("Enter the ram efficency from 70 to 99 ");
        int Re = scan.nextInt();
        System.out.println("Enter the compatability score 1 to 10");
        int Cs = scan.nextInt();
        CommonBehave Android = new CommonBehave();
        Android.setFeaturesAndroid(Ve,Re,Cs);
        Android.versionPriceAndroid();
        Android.ramPriceAndroid();
        Android.priceCompatabilityScore();
        Android.apID=1;
        Android.setCommonBehave(1,NoA,60000);
        Android.displayCommonBehave();
        Android.diplayPriceFeatures();
        Android.Calculation();
    }
    public void Ios(){
        System.out.println("no of modules=");
        int NoI= scan.nextInt();
        System.out.println("Enter the verion from 1 to 11");
        int Ve = scan.nextInt();
        System.out.println("Enter the ram efficency from 70 to 99 ");
        int Re = scan.nextInt();
        System.out.println("Enter the compatability score 1 to 10");
        int Cs = scan.nextInt();
        CommonBehave Ios = new CommonBehave();
        Ios.setFeaturesIos(Ve,Re,Cs);
        Ios.versionPriceIos();
        Ios.ramPriceIos();
        Ios.priceCompatabilityIos();
        Ios.setCommonBehave(2,NoI,90000);
        Ios.displayCommonBehave();
        Ios.diplayPriceFeatures();
        Ios.Calculation();
    }
}
