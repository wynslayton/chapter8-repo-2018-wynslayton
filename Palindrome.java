

/**
 * Write a description of class Palindrome here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Palindrome
{
  public Palindrome(String a){
      System.out.println(isPal(a));
    }
    
  public boolean isPal(String a){
      String b = revString2(a);
      //System.out.println(b);
      if (a.compareTo(b) == 0)
            return true;
      return false;   
    }
    public static String revString2(String b)
  {
      if (b.length() < 1)
      {return "";}
      else
      {
          return (b.charAt(b.length()-1)) + revString2(b.substring(0,b.length()-1));
      }
  }

}
