import java.util.*;
public class Arrays2{
   public static String[] reverseArray(String[] initialArr){
      String[] newArr = new String[initialArr.length];
      int j = 0;
      for (int i = initialArr.length - 1; i >= 0; i--){
         newArr[j] = initialArr[i];
         j++;
         
      }
      return newArr;
   }

}