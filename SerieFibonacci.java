import java.util.Scanner;

public class SerieFibonacci {
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);
        int a=0,b=1,c,n;

        System.out.print("Ingresa la cantidad de elementos para la serie:");
        n= keyboard.nextInt();
        for(int i=0; i<n;i++){
            System.out.println(a);
            c=a+b; 
            a=b;
            b=c;
        }
    }
}
