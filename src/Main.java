import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int sicaklik;
        Scanner input = new Scanner(System.in);

        System.out.print("Sıcaklığı giriniz: ");
        sicaklik = input.nextInt();

        if(sicaklik < 5)
            System.out.println("Kayak yapabilirsin");
        else if(sicaklik <= 15)
            System.out.println("Sinema izleyebilirsin");
        else if(sicaklik <= 25)
            System.out.println("Piknik yapabilirsin");
        else if(sicaklik > 25)
            System.out.println("Yüzmeye gidebilirsin.");
    }
}