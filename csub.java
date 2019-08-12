import java.util.*;

class csub {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        char[] str = s1.toCharArray();
        int count=0, ans;
        for(int i = 0; i<str.length;i++) {
            if(str[i] == '1') {
                count++;
            }
        }
        ans = ((count+1)*count)/2;
        System.out.println(ans);
        sc.close();
    }
}