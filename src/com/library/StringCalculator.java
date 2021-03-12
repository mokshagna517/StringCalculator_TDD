package com.library;


public class StringCalculator {

    public static void main(String[] args) {
	// write your code here
        StringCalculator obj=new StringCalculator();

        if(obj.Add("")==0)
            System.out.println("Test case 1 passed");
         else
            System.out.println("Test case 1 failed");

         if(obj.Add("1")==1)
             System.out.println("Test case 2 passed");
         else
             System.out.println("Test case 2 failed");

         if(obj.Add("1,2")==3)
             System.out.println("Test case 3 passed");
         else
             System.out.println("Test case 3 failed");
    }
    public int Add(String numbers){
        if(numbers.isEmpty())
            return 0;
        if(numbers.length()==1)
            return Integer.parseInt(numbers);
        String[] S=numbers.split(",");
        return Integer.parseInt(S[0])+Integer.parseInt(S[1]);
    }
}
