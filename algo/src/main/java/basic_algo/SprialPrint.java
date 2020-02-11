package basic_algo;

public class SprialPrint {

    public void sprialPrint(int a[][], int row, int col){
        int top = 0;
        int left = 0;
        int dir = 0;
        int bot = row - 1;
        int rit = col - 1;

        while (top <= bot && left <= rit){
            if(dir == 0){
                for(int i=left; i<=rit; i++)
                    System.out.println(a[top][i]);
                top++;
            }else if(dir == 1){
                for(int i = top; i<= bot; i++)
                    System.out.println(a[i][rit]);
                rit--;
            }else if(dir == 2){
                for(int i=rit; i>=left; i--)
                    System.out.println(a[bot][i]);
                bot--;
            }else {
                for(int i = bot; i>= top; i--)
                    System.out.println(a[i][left]);
                left++;
            }
            dir = (dir + 1) % 4;
        }
    }
}
