import java.util.Scanner;

public class perfect {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        int n, sum =0;

        System.out.print("Enter The Number: ");
        n = input.nextInt();

        for (int i=n-1; i>=1; i--){

            if (n%i==0){
                sum +=i;
            }
        }
        if (sum==n){
            System.out.print("Your number is perfect Number");
        }else{
            System.out.print("Your number is not perfect Number");
        }
    }
}
