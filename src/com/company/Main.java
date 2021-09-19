package com.company;

public class Main {

    public static void main(String[] args) {
        for (String var : args)
        {
            System.out.println(var);
        }
        line();
        fact(5);
    }

    static void line()
    {
        System.out.print(1);
        for(int i=2; i<11; i++)
        {
            System.out.print(";1/"+i);
        }
        System.out.println();
    }

    static void fact(int j)
    {
        int x=1;
        for(int i=1;i<j;i++)
        {
            x=i*x;
        }
        System.out.println("j!="+x);
    }
}
