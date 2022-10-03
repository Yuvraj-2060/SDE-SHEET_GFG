#Approach-1
  
  //Author : Mr Singh
package Hexaview;
public class ReverseSentence {
	public static void main(String[] args)
	{	String str="Mr Singh is here";
		str=str+" ";
		String rev="",word="";
		
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch!=' ')
				word=word+ch;
			else
			{
				rev=word+" "+rev;
				word="";			//again assign empty value to word for next iteration
			}
				
		}
		String ans=rev.substring(0,rev.length()-1);			//It removes the empty space which is concatenated at last
		System.out.println("Reverse Sentence is : "+ans);
		
	}

}

#Approach-2 ====================================(Uisng split() method)===========================
  
package SDE_sheet;

//Java program to reverse a string
//s = input()
public class ReverseWords
{

	public static void main(String[] args)
	{
		String s[] = "i like this program very much".
										split(" ");
		String ans = "";
		for (int i = s.length - 1; i >= 0; i--)
		{
			ans += s[i] + " ";
		}
		System.out.println("Reversed String:");
		System.out.println(ans.substring(0,
								ans.length() - 1));
	}
}


#Approach-3 =============================(Using Stack)===================================
  
package SDE_sheet;

import java.util.*;
class GFG{
static void reverse(String s)
{
//Create an empty String stack
Stack<String> stc = new Stack<>();

//Create an empty temporary String
String temp = "";

//Traversing the entire String
for(int i = 0; i < s.length(); i++)
{
	if(s.charAt(i) == ' ')
	{
	
	
	stc.add(temp);
	
	
	temp = "";		
	}
	else
	{
	temp = temp + s.charAt(i);
	}

}


stc.add(temp);

while(!stc.isEmpty())
{
	temp = stc.peek();
	System.out.print(temp + " ");
	stc.pop();
}

System.out.println();
}

//Driver code
public static void main(String[] args)
{
String s = "I Love To Code";
reverse(s);
}
}


