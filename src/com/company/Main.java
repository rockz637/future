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
        CommonBehave Android = new CommonBehave();
        Android.apID=1;
        Android.setCommonBehave(1,NoA,60000);
        Android.displayCommonBehave();
        Android.Calculation();
    }
    public void Ios(){
        System.out.println("no of modules=");
        int NoI= scan.nextInt();
        CommonBehave Ios = new CommonBehave();
        Ios.setCommonBehave(2,NoI,90000);
        Ios.displayCommonBehave();
        Ios.Calculation();
    }
}
