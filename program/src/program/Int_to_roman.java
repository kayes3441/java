package program;

import java.util.HashMap;
public class Int_to_roman {
   public static void main(String[] args) {
    int num = 1994;
    StringBuffer ans = new StringBuffer();
    HashMap<Integer,String> roman = new HashMap<>();
    roman.put(1,"I");
    roman.put(4,"IV");
    roman.put(5,"VI");
    roman.put(9,"IX");
    roman.put(10,"X");
    roman.put(50,"L");
    roman.put(40,"XL");
    roman.put(90,"XC");
    roman.put(100,"C");
    roman.put(400,"CD");
    roman.put(500,"D");
    roman.put(900,"CM");
    roman.put(1000,"M");
   

    for(int digit : roman.keySet()){
        // System.out.println(digit);
        while(num >= digit){
            ans.append(roman.get(digit));
            num -= digit;
        }
    }

   }
}
