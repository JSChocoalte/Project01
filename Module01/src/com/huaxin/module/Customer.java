package com.huaxin.module;

import java.util.ArrayList;

public class Customer {
    public static void main(String[] args){
        System.out.println("helloworld!!");

        ArrayList li = new ArrayList();
        System.out.println();


    }
    public void method(){
        String[] arr = new String[]{"lilei","hanmeimei","joe"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        for (String s : arr) {
            System.out.println(s);
        }
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }
        if (arr == null) {

        }
        if (arr != null) {

        }
        if (arr == null) {

        }
        if (arr != null) {

        }

    }
    

}
