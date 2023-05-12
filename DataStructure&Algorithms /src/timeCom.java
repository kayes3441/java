import java.util.Scanner;

public class timeCom {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int num    = sc.nextInt();

        int count = 0;
         for (int i = 0 ; i< num ; i++){
            for(int j = 0 ; j < num ;j++){
                count += 1; 
            }
         }
         System.out.print( "n"+"\t\t"+"count" +"\n"+ num+"\t\t"+count);
    }
}
