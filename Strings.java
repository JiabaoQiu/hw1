public class Strings
{
   public static String uniqueLetters(String str)
   {
      for (int i = 0; i < str.length(); i++)
      {
    	  String temp = str.substring(i,i+1);
    	  for (int j = 0; j < str.length(); j++)
    	  {
    		  if (j != i)
    		  {
    			  if (str.substring(j,j+1).equals(temp))
        		  {
        			  str = str.replaceAll(temp, "");
        			  i = 0;
        		  }
    		  }
    	  }
      }
      return str;
   }
}
