package com.company;

public class Main {

    public static void main(String[] args) {
	  int a=2, b=-3, c=-8;
        double delta=b*b-4*a*c;
        double x1=-b-Math.sqrt(delta)/2*a;
        double x2=-b+Math.sqrt(delta)/2*a;
        if (delta==0)
        {
            System.out.println(" nie ma rozwiazan");
        }
        else {
            System.out.println(" " + x1 + " " + x2);
        }
    }
}
