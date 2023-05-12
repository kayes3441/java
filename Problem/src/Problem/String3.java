package Problem;

import java.util.Scanner;

public class String3 {
    public static void main(String[] args) {
          //check string in palindrome or not ...
        Scanner word_input = new Scanner(System.in);
        System.out.println("Enter your Word to check:");
        StringBuffer word = new StringBuffer(word_input.next());

        String rev_word= word.reverse().toString();
        System.out.println(rev_word);

        if(word.equals(rev_word)){
            System.out.println("this is palindrome "+rev_word);
        }
        else
        {
            System.out.println("Not Palindrome :");
        }
            
    }
}
