import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int k;
        int l=0;
        int sayac = 0;

        Scanner inp = new Scanner(System.in);
        System.out.println("Sayı Gir: ");
        k = inp.nextInt();


        for (int i=1 ; i<=k; i++)
        {
            if ((i%3==0) && (i%4==0))
            {
                l +=i;
                sayac++;
            }
        }
        System.out.println(l/sayac);
    }
}