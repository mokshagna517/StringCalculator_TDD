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
        if(numbers.length()==1)
            return Integer.parseInt(numbers);
        String[] S=numbers.split(",");
        Integer x=Integer.parseInt(S[0]);
        Integer y=Integer.parseInt(S[1]);
        int res=x+y;
        return  res;
    }
}
