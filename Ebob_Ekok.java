import java.util.Scanner;

public class Ebob_Ekok {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n1, n2, ebob = 1, ekok;
        System.out.print("n1 sayisi: ");
        n1 = inp.nextInt();
        System.out.print("n2 sayisi: ");
        n2 = inp.nextInt();

        for(int i = 1; i <= n1 && i <= n2; ++i)
        {
            if(n1 % i == 0 && n2 % i == 0)
                ebob = i;
        }

        ekok = (n1 * n2) / ebob;
        while (true) {
            if (ekok % n1 == 0 && ekok % n2 == 0)
                break;
            }
        System.out.printf(" %d ve  %d sayilarinin EBOB'u %d \n", n1, n2, ebob);
        System.out.printf(" %d ve  %d sayilarinin EKOK'u %d \n", n1, n2, ekok);





    }
}

       


