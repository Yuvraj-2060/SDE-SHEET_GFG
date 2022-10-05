#Approach-1 ======================***====================

public class RotatedBy2Place {
	public static boolean isRotated(String str1, String str2)
    {
        if(str1.length()!=str2.length())
            return false;
        if(str1.length()<2)
            return true;
            
            String clock="",anti="";
            int len=str1.length();
            
            clock=clock+str2.substring(len-2,len)+str2.substring(0,len-2);
            
            anti=anti+str2.substring(2)+str2.substring(0,2);
            
            if(clock.equals(str1) || anti.equals(str1))
                return true;
            else
                return false;
    }

	public static void main(String[] args) {
		String str1="amazon",str2="azonam";
		System.out.println(" "+isRotated(str1,str2));
	}

}

#Approach-2 ========================*****=========================
  
  import java.io.*;
 
class RotatedBy2Place{
  //Method to check if string2 is obtained by string1
    static boolean isRotated(String str1, String str2)
    {
        int n = str1.length();
        int m = str2.length();
        if (n != m) 
            return false;
        boolean clockwise = true;
        boolean anticlockwise = true;
      //check clockwise rotation is possible or not
        for (int i = 0; i < n; i++) {
            if (str1.charAt(i)!= str2.charAt((i + 2) % n)) {
                clockwise = false;
                break;
            }
        }
      // check anticlockwise rotation is possible or not
        for (int i = 0; i < m; i++) {
            if (str1.charAt((i + 2) % n)!= str2.charAt(i)) {
                anticlockwise = false;
                break;
            }
        }
        return (clockwise || anticlockwise);
    }
    public static void main (String[] args) {
        String str1 = "geeks";
        String str2 = "eksge";
 
    System.out.println(isRotated(str1, str2) ? "Yes": "No");
}
}
