package com.library;


public class StringCalculator {

    public static void main(String[] args) {
	// write your code here
        StringCalculator obj=new StringCalculator();

        if(obj.Add("")==0 && obj.Add("1")==1 && obj.Add("1,2")==3)
            System.out.println("Test passed");
        else
            System.out.println("Test failed");
    }
    public int Add(String numbers){
        if(numbers.isEmpty())
            return 0;
        return Integer.MAX_VALUE;
    }
}
