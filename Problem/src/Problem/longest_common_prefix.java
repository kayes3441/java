package Problem;

public class longest_common_prefix {
    
    public String longestCommonPrefix(String[] arr)
    {
       int n = arr.length;
       // take temp_prefix string and assign first element of arr : a.
       String result = arr[0];
       
       // Iterate for rest of element in string.
       for(int i = 1; i < n; i++){
            // .indexOf() return index of that substring from string.
            while(arr[i].indexOf(result) != 0){
               
                // update matched substring prefx
                result = result.substring(0, result.length()-1);
               
                // check for empty case. direct return if true..
                if(result.isEmpty()){
                    return "-1";
                }
            }
        }
        return result;
    }
 
    /* Driver Function to test other function */
    public static void main(String[] args)
    {
        longest_common_prefix gfg = new longest_common_prefix();
        String[] input = {"geeksforgeeks", "geeks", "geek", "geezer"};
        System.out.println( "The longest Common Prefix is : " +
                                   gfg.longestCommonPrefix(input));
    }
}
