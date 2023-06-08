import java.util.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("Sum Of N Natural Numbers!!\n\n\n");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number:- ");
        int num = sc.nextInt();
        int i=0,sum=0;
        while(i<= num){
            sum = sum + i;
            i++;
        }
        System.out.println("The Sum of total Numbers is:- " + sum);

    }
}