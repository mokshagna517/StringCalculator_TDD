package com.library;


public class StringCalculator {

    public static void main(String[] args) throws Exception {
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

        try{
        if(obj.Add("//;\n1,-2\n4\n7")==14)
            System.out.println("Test case 7 failed");
        }catch(Exception e)
        {
            System.out.println("Test case 7 passed");
           System.out.println(e.getMessage());
        }
        if(obj.Add("//;\n1,2000\n4000\n1000")==1001)
            System.out.println("Test case 8 passed");
        else System.out.println("Test case 8 failed");

        if(obj.Add("//[***]\n1***2***3")==6)
            System.out.println("Test case 9 passed");
        else System.out.println("Test case 9 failed");

        if(obj.Add("//[*][%]\\n1*2%3")==6)
            System.out.println("Test case 10 passed");
        else System.out.println("Test case 10 failed");

    }
    public int Add(String numbers) throws Exception {
        if(numbers.isEmpty())
            return 0;

        int sum=0;
        for(int i=0;i<numbers.length();i++){
            if(i<numbers.length()-1 && numbers.charAt(i)=='-'){
                String number=getNumber(numbers,i+1);
                throw new Exception("negatives not allowed -"+number, new Throwable());
            }

            String number=getNumber(numbers,i);

            if((!number.isEmpty() && Integer.parseInt(number)<=1000))
                sum+=Integer.parseInt(number);
        }
        return sum;
    }

    public static String getNumber(String numbers, int index){
        String number="";
        while(index<numbers.length() && Character.isDigit(numbers.charAt(index))) {
            number += numbers.charAt(index);
            index++;
        }
        return number;
    }
}
