package bridgeittest;
import java.util.*;

public class Test5 {
	public static boolean isAnagram(String str1,String str2)
    {
      if(str1.length() != str2.length())

     { return false;
         }
// sort charcters
str1 = sortCharcters(str1);
str2 = sortCharcters(str2);
return str1.equals(str2);
}

//using static sort method to sortchracters

public static String sortCharcters(String str)
{
 char[] ch = str.toUpperCase().toCharArray();
  Arrays.sort(ch);
  return String.valueOf(ch);
}
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the name:");
String str1 = sc.next();
System.out.println("Enter the 2nd name:");
String str2 = sc.next();

if (isAnagram(str1,str2))
{
System.out.println("Choice is Anagram :)");
}
else{
System.out.println("Choice is not Anagram :(");
}
}

}
