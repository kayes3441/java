package program;

import java.util.HashMap;

public class Tocheck {
    
    HashMap <Character , Integer> num = new HashMap<>();
    num.put('I', 1);
    num.put('V', 5);
    num.put('X', 10);
    num.put('L', 50);
    num.put('C', 100);
    num.put('D', 500);
    num.put('M', 1000);
    System.out.println(num);
    int result = 0;
    int prev =0;
    for(int i = s.length()-1 ; i>=0 ;i--){
        if(num.get(s.charAt(i))  < prev ){
            result -=num.get(s.charAt(i));
        }
        else result +=num.get(s.charAt(i));
         prev = num.get(s.charAt(i));
    }
    System.out.println(result);
}
