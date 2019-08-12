import java.util.Scanner;

// Array Rotation class
// main function
// rotation function returning rotated array
class arrayRotation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i = 0; i < N; i++) {
            System.out.print(i + " :- ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter d :- ");
        int d = sc.nextInt();
        arr = arrayRotate(arr, d, N);
        sc.close();
    }

    public static int[] arrayRotate(int[] a, int d, int n) {
        int[] s = new int[n];
        for(int i = 0; i < n; i++) {
            
        }
        return s;
    }
}