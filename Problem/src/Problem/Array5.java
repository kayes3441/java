package Problem;

public class Array5 {
    public static void main(String[] args) {
        int[][] num = new int[4][];
        int k=0;
        num[0] = new int[1];
        num[1] = new int[2];
        num[2] = new int[3];
        num[3] = new int[4];

        for (int row=0;row<4;row++){
            for(int column=0;column<row+1;column++){
                num[row][column]=k;
                k++;
            }
        }
        for (int row=0;row<4;row++){
            for(int column=0;column<row+1;column++){
                System.out.print(" "+num[row][column]);
            }
            System.out.println();
        }
    }
}
