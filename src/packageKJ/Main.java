package packageKJ;
class Solution {
    public int reverse(int x) {
         boolean minus = false;
        if (x < 0) {
            minus = true;
            x=-x;
        }
            int i = 0;
            int[] arr = new int[100000];
            int mod = 10;
            int multiply=1;
            int y=0;
            while (x > 0) {
                arr[i] = x % mod;
                x = x / mod;
                i++;
            }
        for (int j = i-1; j >= 0; j--) {

            if (y >= Integer.MAX_VALUE - multiply * arr[j])
                return 0;

            if( multiply/10 * arr[j]>Integer.MAX_VALUE/10){
                return 0;}
            if(minus){
                if (y < Integer.MIN_VALUE/10 || (y == Integer.MIN_VALUE / 10 && arr[j] > 8)) {
                    return 0;
                }
            }
            y += multiply * arr[j];
            multiply *= 10;
        }
        if(minus){
            return -y;
        }
        return y;

    }
}
public class Main {

    public static void main(String[] args) {
      int x = 123;
        Solution s = new Solution();
        System.out.println(s.reverse(x));
        x = -123;
        System.out.println(s.reverse(x));
        x = 120;
        System.out.println(s.reverse(x));
        x = 0;
        System.out.println(s.reverse(x));
        x = -1534236469;
        System.out.println(s.reverse(x));
        x =-1563847412;
        System.out.println(s.reverse(x));

    }
}
