package program;

import java.util.HashMap;

public class roman_to_integer {
    public static void main(String[] args) {
      
        // String s = "MCMXCIV";
//         int ans = 0, num = 0, prev = 0;
//         for (int i = s.length()-1; i >= 0; i--) {
//             switch(s.charAt(i)) {
//                 case 'I': num = 1; break;
//                 case 'V': num = 5; break;
//                 case 'X': num = 10; break;
//                 case 'L': num = 50; break;
//                 case 'C': num = 100; break;
//                 case 'D': num = 500; break;
//                 case 'M': num = 1000; break;
//             }
//             if (num < prev) ans -= num;
//             else ans += num;
// 10-5=5-1=4;
//             prev = num;
//         }
//        System.out.println(ans);

        String s = "III";
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
}
