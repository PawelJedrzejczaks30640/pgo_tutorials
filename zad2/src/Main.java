import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner skaner = new Scanner(System.in);
        double liczba = skaner.nextDouble();
        if(liczba<0) {
            System.out.println("The number is negative");
        } else if(liczba > 0){
                System.out.println("The number is positive");
            }
            else {
                System.out.println("The value equals 0");
            }
        }
    }

