import java.util.*;

public class Encoding
{
   public static Set<String> morseCodes(int m, int n)
   {
      Set<String> result = new TreeSet<>();
      if ((m==0)&&(n==0))
      {
    	  result.add("");
      }
      else if (m==0)
      {
    	  for (String s : morseCodes(m,n-1))
          {
        	  result.add(s+"-");
          }
      }
      else if (n==0)
      {
    	  for (String s : morseCodes(m-1,n))
          {
        	  result.add(s+".");
          }
      }
      else
      {
    	  for (String s : morseCodes(m-1,n))
          {
        	  result.add(s+".");
          }
          for (String s : morseCodes(m,n-1))
          {
        	  result.add(s+"-");
          }
      }
      return result;
   }
}
