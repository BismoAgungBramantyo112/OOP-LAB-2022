import java.util.*;

//Bismo Agung Tri Achmad Bramantyo - 2440059495 - Lab Week 5

public class lab5 {

    public static void binary_converter_nostep(int a) {
        
        int[] binary_number = new int[100];
        int i = 0, j = 0, k = a;

        while (a > 0) {
            binary_number[i] = a % 2;
            a = a / 2;
            i ++;
        }
        
        System.out.print("\n\nThe result of binary number " + k + " is : ");
        for (j = i - 1 ; j >= 0 ; j --){
            System.out.print(binary_number[j]);
        }
        
        System.out.println();

    }

    public static void binary_converter_step(int a) {
        
        int[] binary_number = new int[100];
        int i = 0, j = 0, k = a, v = a, step = 1, remain=0 , quot=0 , num = 0;

        while (a > 0) {
            binary_number[i] = a % 2;
            a = a / 2;
            i ++;
        }


        while(k > 0){

            remain = k % 2;
            quot = k/2 ;
            System.out.println("Step " + step + ": " + k + "/2, Remainder: " + remain + ", Quotient : " + quot);

            k = k/2;
            step = step + 1;

        }
        
        System.out.print("\n" + v + " in binary is : ");
        for (j = i - 1 ; j >= 0 ; j --){
            System.out.print(binary_number[j]);
        }
        System.out.println();

    }

    public static void main(String[] args) {
        
        int menu = 0, number = 0;
        Scanner baca = new Scanner(System.in);


        do{

            System.out.println("Binary Number Calculator");
            System.out.println("========================\n");
            System.out.println("1. Binary Number");
            System.out.println("2. Binary Number With Step");
            System.out.println("3. Exit\n");

            System.out.print("Choose: ");
            menu = baca.nextInt();

            switch (menu) {

                case 1:
                    do {
                        System.out.print("Input the number [1-100]: ");
                        try {
                            number = baca.nextInt();
                        } catch (Exception e) {
                            System.out.println("Please read the input constraint ");
                        }
                        
                    }while((number < 1) || number > 100);

                    binary_converter_nostep(number);
                    System.out.println();

                    menu = 0;
                    break;

                case 2:
                    do {
                        System.out.print("Input the number [1-100]: ");
                        try {
                            number = baca.nextInt();
                        } catch (Exception e) {
                            System.out.println("Please read the input constraint ");
                        }
                    }while((number < 1) || number > 100);

                    binary_converter_step(number);
                    System.out.println();

                    menu = 0;
                    
                    break;

                
                case 3:

                    System.out.println("Thank you for using this ^_^");

                break;

                default:
                    System.out.println("Invalid Option\n");
                    break;
            }

        

        }while(menu != 3);

    }
}