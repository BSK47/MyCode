package learning;

import java.util.Scanner;

//import java.util.Scanner;
public class CopyOfJavaProgram
{
    public static int hex2decimal(String s)
    {
             String digits = "0123456789ABCDEF";
             s = s.toUpperCase();
             int val = 0;
             for (int i = 0; i < s.length(); i++)
             {
                 char c = s.charAt(i);
                 int d = digits.indexOf(c);
                 val = 16*val + d;
             }
             return val;
    }
    
    public static void display(String[] str)
    {
    	int decnum, b;
    	int[][] disp = new int[8][str.length];
    	for (int a=0; a<str.length; a++) {
			b=7;
    		decnum = hex2decimal(str[a]);
            while(decnum != 0)
            {
            	disp[b][a] = decnum%2;
                decnum = decnum/2;
                b--;
            }
		}
		for (int a=0;a<8;a++) {
			for (b=0;b<str.length;b++) {
				if (disp[a][b]==0) 
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println();
		}
    }
    
    public static boolean combineArrayAndDisp(String inputStr)
    {
    	String input=null;
    	boolean inputPresent = true;
    	String[] arr = null;
    	String[] finalArr = null;
    	for(int i=0;i<inputStr.length();i++) {
        	input = String.valueOf(inputStr.charAt(i));
	        if (input.equals("A"))        	arr = new String[]{"7F","88","88","88","7F"};
	        else if (input.equals("B"))        	arr = new String[]{"FF","91","91","91","6E"};
	        else if (input.equals("C"))        	arr = new String[]{"7E","81","81","81","42"};
	    	else if (input.equals("D"))        	arr = new String[]{"FF","81","81","42","3C"};
	    	else if (input.equals("E"))        	arr = new String[]{"FF","91","91","91","81"};
	    	else if (input.equals("F"))        	arr = new String[]{"FF","90","90","90","80"};
	    	else if (input.equals("G"))        	arr = new String[]{"7E","81","89","89","4E"};
	    	else if (input.equals("H"))        	arr = new String[]{"FF","10","10","10","FF"};
	    	else if (input.equals("I"))        	arr = new String[]{"81","81","FF","81","81"};
	    	else if (input.equals("J"))        	arr = new String[]{"06","01","01","01","FE"};
	    	else if (input.equals("K"))        	arr = new String[]{"FF","18","24","42","81"};
	    	else if (input.equals("L"))        	arr = new String[]{"FF","01","01","01","01"};
	    	else if (input.equals("M"))        	arr = new String[]{"FF","40","30","40","FF"};
	    	else if (input.equals("N"))        	arr = new String[]{"FF","40","30","08","FF"};
	    	else if (input.equals("O"))        	arr = new String[]{"7E","81","81","81","7E"};
	    	else if (input.equals("P"))        	arr = new String[]{"FF","88","88","88","70"};
	    	else if (input.equals("Q"))        	arr = new String[]{"7E","81","85","82","7D"};
	    	else if (input.equals("R"))        	arr = new String[]{"FF","88","8C","8A","71"};
	    	else if (input.equals("S"))        	arr = new String[]{"61","91","91","91","8E"};
	    	else if (input.equals("T"))        	arr = new String[]{"80","80","FF","80","80"};
	    	else if (input.equals("U"))        	arr = new String[]{"FE","01","01","01","FE"};
	    	else if (input.equals("V"))        	arr = new String[]{"F0","0C","03","0C","F0"};
	    	else if (input.equals("W"))        	arr = new String[]{"FF","02","0C","02","FF"};
	    	else if (input.equals("X"))        	arr = new String[]{"C3","24","18","24","C3"};
	    	else if (input.equals("Y"))        	arr = new String[]{"E0","10","0F","10","E0"};
	    	else if (input.equals("Z"))        	arr = new String[]{"83","85","99","A1","C1"};
	    	else if (input.equals("a"))        	arr = new String[]{"06","29","29","29","1F"};
	    	else if (input.equals("b"))        	arr = new String[]{"FF","09","11","11","0E"};
	    	else if (input.equals("c"))        	arr = new String[]{"1E","21","21","21","12"};
	    	else if (input.equals("d"))        	arr = new String[]{"0E","11","11","09","FF"};
	    	else if (input.equals("e"))        	arr = new String[]{"0E","15","15","15","0C"};
	    	else if (input.equals("f"))        	arr = new String[]{"08","7F","88","80","40"};
	    	else if (input.equals("g"))        	arr = new String[]{"30","49","49","49","7E"};
	    	else if (input.equals("h"))        	arr = new String[]{"FF","08","10","10","0F"};
	    	else if (input.equals("i"))        	arr = new String[]{"00","00","5F","00","00"};
	    	else if (input.equals("j"))        	arr = new String[]{"02","01","21","BE","00"};
	    	else if (input.equals("k"))        	arr = new String[]{"FF","04","0A","11","00"};
	    	else if (input.equals("l"))        	arr = new String[]{"00","81","FF","01","00"};
	    	else if (input.equals("m"))        	arr = new String[]{"3F","20","18","20","1F"};
	    	else if (input.equals("n"))        	arr = new String[]{"3F","10","20","20","1F"};
	    	else if (input.equals("o"))        	arr = new String[]{"0E","11","11","11","0E"};
	    	else if (input.equals("p"))        	arr = new String[]{"3F","24","24","24","18"};
	    	else if (input.equals("q"))        	arr = new String[]{"10","28","28","18","3F"};
	    	else if (input.equals("r"))        	arr = new String[]{"1F","08","10","10","08"};
	    	else if (input.equals("s"))        	arr = new String[]{"09","15","15","15","02"};
	    	else if (input.equals("t"))        	arr = new String[]{"20","FE","21","01","02"};
	    	else if (input.equals("u"))        	arr = new String[]{"1E","01","01","02","1F"};
	    	else if (input.equals("v"))        	arr = new String[]{"1C","02","01","02","1C"};
	    	else if (input.equals("w"))        	arr = new String[]{"1E","01","0E","01","1E"};
	    	else if (input.equals("x"))        	arr = new String[]{"11","0A","04","0A","11"};
	    	else if (input.equals("y"))        	arr = new String[]{"00","39","05","05","3E"};
	    	else if (input.equals("z"))        	arr = new String[]{"11","13","15","19","11"};
	    	else if (input.equals("1"))        	arr = new String[]{"00","41","FF","01","00"};
	    	else if (input.equals("2"))        	arr = new String[]{"43","85","89","91","61"};
	    	else if (input.equals("3"))        	arr = new String[]{"42","81","91","91","6E"};
	    	else if (input.equals("4"))        	arr = new String[]{"18","28","48","FF","08"};
	    	else if (input.equals("5"))        	arr = new String[]{"F2","91","91","91","8E"};
	    	else if (input.equals("6"))        	arr = new String[]{"1E","29","49","89","86"};
	    	else if (input.equals("7"))        	arr = new String[]{"80","8F","90","A0","C0"};
	    	else if (input.equals("8"))        	arr = new String[]{"6E","91","91","91","6E"};
	    	else if (input.equals("9"))        	arr = new String[]{"70","89","89","8A","7C"};
	    	else if (input.equals("0"))        	arr = new String[]{"7E","89","91","A1","7E"};
	    	else inputPresent = false;
	        	
	        if(finalArr == null)
	        	finalArr = arr;
	        else
	        	finalArr = joinArr(finalArr,arr);
    	}
    	display(finalArr);
		return inputPresent;
    }
    
    public static String[] joinArr(String[] a,String[] b){
    	String[]c = new String[a.length+b.length+1];
        int count = 0;
        
        for(int i = 0; i < a.length; i++) { 
           c[i] = a[i];
           count++;
        } 
        c[count++]="00";
        for(int j = 0; j < b.length;j++) { 
           c[count++] = b[j];
        } 
		return c;
    	
    }
    public static void main(String args[])
    {
    	Scanner scan = new Scanner(System.in);
        String[] arr = null;
        boolean inputPresent = true;

        System.out.print("To exit enter QUIT and press Enter \nEnter what to display from [A-Z,a-z,0-9] : ");
        
        String inputStr = scan.nextLine();
        while(!inputStr.equalsIgnoreCase("QUIT")){
	        inputPresent = combineArrayAndDisp(inputStr);
	        if (inputPresent)
	        	System.out.print("To exit enter QUIT and press Enter \nEnter what to display from [A-Z,a-z,0-9] : ");
	        else 
	        	System.out.print("To exit enter QUIT and press Enter \nProvide a valid input from [A-Z,a-z,0-9] : ");
	    
	        inputPresent = true;
	        inputStr = scan.nextLine();
        }
    }
}
        
        
        
//        String input=null;
//        for(int i=0;i<inputStr.length();i++) {
//        	input = String.valueOf(inputStr.charAt(i));
//	        while(!input.equalsIgnoreCase("QUIT") || i==inputStr.length()-1) {
//		        if (input.equals("A"))        	arr = new String[]{"7F","88","88","88","7F"};
//		       
//		    	else inputPresent = false;
//	        	
//	        
//		        if (inputPresent) {
//		        	display(arr);
//		        	System.out.print("To exit enter QUIT and press Enter \nEnter what to display from [A-Z,a-z,0-9] : ");
//		        }
//		        else 
//		        	System.out.print("To exit enter QUIT and press Enter \nProvide a valid input from [A-Z,a-z,0-9] : ");
//	        }
//	        inputPresent = true;
//	        input = scan.nextLine();
//	        
//        }
//    }
//}
