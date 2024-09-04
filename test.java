import java.util.Scanner;

public class test {

    public static void islemEksiArti(int n) {
        System.out.print(n + " ");

        if (n <= 0) {
            return;
        }

        islemEksiArti(n - 5);


        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int sayi = scanner.nextInt();


        islemEksiArti(sayi);

    }
}









