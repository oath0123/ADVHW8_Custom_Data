package com.example.lib;

import java.util.Scanner;

public class BankData {
    Scanner scanner = new Scanner(System.in);
    int[] CustomNArray, m,t;
    float deposit[];
    String[] InOrOut;


    public void BankDataDeal() {
        int CustomN = 0, tranT = 0;
        System.out.println("�п�J�U�ȼƶq(100�H�U�����):");
        try {
            CustomN = Integer.parseInt(scanner.next());
        } catch (Exception e) {
            System.out.println("�o�Ӥ��O���(�Э��s��J)!");
            BankDataDeal();
        }

        while (CustomN > 100) {
            try {
                System.out.println("�A��J���Ʀr�Ӥj(�Э��s��J)!");
                CustomN = Integer.parseInt(scanner.next());
            } catch (Exception e) {
                System.out.println("�o�Ӥ��O���(�Э��s��J)!");

            }
        }
        CustomNArray = new int[CustomN];

        System.out.println("���Ѧ�" + CustomN + "�ӫȤH\n�@��" + CustomN + "������M��");//���]1��ȤH�u��1������W��
        InOrOut=new String[CustomN];
        deposit=new float[CustomN];
        m=new int[CustomN];
        t=new int[CustomN];
        for (int i = 0; i < CustomN; i++) {
            System.out.println("�п�J�s��" + i + "�U�ȬO�n�s�کδ���(�s�ڥ�1  ���ڥ�2)?");
            t[i] = Integer.parseInt(scanner.next());
            if(t[i]==1){
                InOrOut[i]="�s�J";
            }
            else {
                InOrOut[i]="���X";
            }
            System.out.println("�п�J�s��" + i + "�U�ȬO�n�s�کδ��ڦh�ֿ�?");

            m[i] = Integer.parseInt(scanner.next());
            if (t[i] == 1) {
                deposit[i]=0+m[i];
                System.out.println(t[i]+"  �s�� " + i + "   "+InOrOut[i] + m[i] + "��    " + "�s�ڦ�:" +deposit[i]+"��\n");
            }
            else {
                deposit[i]=0-m[i];
                System.out.println(t[i]+"  �s�� " + i + "   "+InOrOut[i]  + m[i] + "��    " + "�s�ڦ�:" +deposit[i]+"��\n");
            }
        }
        for (int i= 0;i<CustomN;i++){
            System.out.println(t[i]+"  �s�� " + i + "   "+InOrOut[i]  + m[i] + "��    " + "�s�ڦ�:" +deposit[i]+"��");
        }
    }
}
