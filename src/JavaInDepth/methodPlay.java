package JavaInDepth;

import java.util.Scanner;

public class methodPlay {

    static boolean exit;
    private static double LEK=10;
    private static double GBP=20;
    private static double EUR=30;
    private static double CHF=40;
    private static double USD=50;
    private static double CAD=60;
    private static methodPlay md = new methodPlay();

    void updateMonedhat(double numb){
        USD = numb;
    }
    double convertLekeUSD(double num, double num2){
        return num * num2;
    }
    public static void main(String[] args) {

        System.out.println("\tConvert Money\n");
        mainMenue();

        System.out.println("You added : ");
        System.out.println("Converting #### to #### :  "+"######");

    }
    protected static void mainMenue(){

        while(!exit){
            menue();
            int isChoise = getSelected();
            selectedOne(isChoise);
            int isChoise2 = getSelected();
            selectedOne(isChoise2);
            System.out.println("Rezultati "+ md.convertLekeUSD(isChoise,isChoise2)+"\n");

        }
    }
    protected static int getSelected(){
        Scanner scanner = new Scanner(System.in);
        int count = 0;
            int choice = -1;
            while (choice < 0 || choice > 6) {
                try {
                    System.out.println("Enter Currency: ");
                    choice = Integer.parseInt(scanner.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Wrong entry, please try it again!");
                }
            }
            return choice;
    }

    static void menue() {
        System.out.println("\tSelect choice:");
        System.out.println("1. British Pound Sterling (GBP)\n"
                +"2. European Euro (EUR)\n"
                +"3. Swiss Franc (CHF)\n"
                +"4. U.S. Dollar (USD)\n"
                +"5. Canadian Dollar (CAD)\n"
                +"6. Albanian LEK\n"
                +"7. Other ");
    }
    protected static void selectedOne(int choice){
        switch (choice){
            case 0: exit=true;
                System.out.println("Good day!");
                System.exit(0);
                break;
            case 1: double E = EUR;
                System.out.println("You selected Euro "+E);
                break;
            case 2: double D =USD;
                System.out.println("You selected dollare "+D);
                break;
            case 3:double L = LEK;
                System.out.println("You selected lek "+L);
                break;
            case 4: double G = GBP;
                System.out.println("You selected Euro "+G);
                break;
            case 5: double C =CHF;
                System.out.println("You selected dollare "+C);
                break;
            case 6:double CC = CAD;
                System.out.println("You selected lek "+CC);
                break;
        }
    }
}
