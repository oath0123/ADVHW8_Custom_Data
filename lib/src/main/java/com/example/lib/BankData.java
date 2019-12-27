package com.example.lib;

import java.util.Scanner;

public class BankData {
    Scanner scanner = new Scanner(System.in);
    int[] CustomNArray, m,t;
    float deposit[];
    String[] InOrOut;


    public void BankDataDeal() {
        int CustomN = 0, tranT = 0;
        System.out.println("請輸入顧客數量(100以下的整數):");
        try {
            CustomN = Integer.parseInt(scanner.next());
        } catch (Exception e) {
            System.out.println("這個不是整數(請重新輸入)!");
            BankDataDeal();
        }

        while (CustomN > 100) {
            try {
                System.out.println("你輸入的數字太大(請重新輸入)!");
                CustomN = Integer.parseInt(scanner.next());
            } catch (Exception e) {
                System.out.println("這個不是整數(請重新輸入)!");

            }
        }
        CustomNArray = new int[CustomN];

        System.out.println("今天有" + CustomN + "個客人\n共有" + CustomN + "筆交易清單");//假設1位客人只有1筆交易名單
        InOrOut=new String[CustomN];
        deposit=new float[CustomN];
        m=new int[CustomN];
        t=new int[CustomN];
        for (int i = 0; i < CustomN; i++) {
            System.out.println("請輸入編號" + i + "顧客是要存款或提款(存款打1  提款打2)?");
            t[i] = Integer.parseInt(scanner.next());
            if(t[i]==1){
                InOrOut[i]="存入";
            }
            else {
                InOrOut[i]="提出";
            }
            System.out.println("請輸入編號" + i + "顧客是要存款或提款多少錢?");

            m[i] = Integer.parseInt(scanner.next());
            if (t[i] == 1) {
                deposit[i]=0+m[i];
                System.out.println(t[i]+"  編號 " + i + "   "+InOrOut[i] + m[i] + "元    " + "存款有:" +deposit[i]+"元\n");
            }
            else {
                deposit[i]=0-m[i];
                System.out.println(t[i]+"  編號 " + i + "   "+InOrOut[i]  + m[i] + "元    " + "存款有:" +deposit[i]+"元\n");
            }
        }
        for (int i= 0;i<CustomN;i++){
            System.out.println(t[i]+"  編號 " + i + "   "+InOrOut[i]  + m[i] + "元    " + "存款有:" +deposit[i]+"元");
        }
    }
}
