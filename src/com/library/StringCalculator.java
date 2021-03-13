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

         if(obj.Add("1,2,3,4,5")==15)
             System.out.println("Test case 4 passed");
         else
             System.out.println("Test case 4 failed");
         if(obj.Add("1,2\n4,5\n7")==19)
             System.out.println("Test case 5 passed");
         else System.out.println("Test case 5 failed");
        if(obj.Add("//;\n1,2\n4\n7")==14)
            System.out.println("Test case 6 passed");
        else System.out.println("Test case 6 failed");
    }
    public int Add(String numbers){
        if(numbers.isEmpty())
            return 0;
        String[] S=numbers.split(",|\\n");
        int sum=0;
        for(int i=0;i<S.length;i++){
            sum+=Integer.parseInt(S[i]);
        }
        return sum;
    }
}
