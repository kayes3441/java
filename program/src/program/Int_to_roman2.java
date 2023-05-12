package program;

public class Int_to_roman2 {
    public static void main(String[] args) {
        int [] num = {1,4,5,9,10,40,50,90,100,400,500,900,1000};
        String[] roman ={"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
        StringBuilder sb = new StringBuilder();
        int value = 1200;
        for (int i = num.length-1 ; i>=0 ; i--){
            while(value>=num[i]){
                value -=num[i];
                sb.append(roman[i]);
            }
        }
        System.out.println(sb.toString());
    }
}
