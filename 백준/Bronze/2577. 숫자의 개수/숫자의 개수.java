import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int[] arr = new int[10];

        int sum = a * b * c;

        String str = sum + "";
        for(int i = 0; i < str.length(); i++){
            arr[str.charAt(i) - '0']++;
        }

        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}