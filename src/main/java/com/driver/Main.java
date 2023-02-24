package com.driver;

public class Main {
    public static class Product{
        public int product(int x,int y,int z){
            return x*y*z;
        }
        public int product(int x,int y){
            return x*y;
        }
        public double product(double x,double y){
            return x*y;
        }

    }
    public static void main(String[] args){
        Product p=new Product();
        p.product(2,4);
        p.product(2,4,8);
        p.product(6.00,7.00);

    }
}