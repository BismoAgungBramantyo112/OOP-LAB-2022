import java.util.*;

//Bismo Agung Tri Achmad Bramantyo - 2440059495

public class lab6 {
    
    public static void main(String[] args) {

        Random rand = new Random();
        Scanner baca = new Scanner(System.in);
        int[][] array = new int[20][20];
        int row = 0;
        int column = 0;
        int i = 0, j = 0;
        int ganjil = 0;
        int banding = 0;
        int parameter = 1, insert = 0;
        
        
        do 
        {

        System.out.println("Speed Guess?");
        
        do{
            System.out.print("Matrix Row Size [Max 20]: ");
            row = baca.nextInt();
        }while((row < 1) || (row > 20));
        
        do{
            System.out.print("Matrix Column Size [Max 20]: ");
            column = baca.nextInt();
        }while((column < 1) || (column > 20));

        for(i = 0 ; i < row ; i++){
            for(j = 0 ; j < column ; j++){
                int rand1 = rand.nextInt(100);
                array[i][j] = rand1;
            }
        }

        for(i = 0 ; i < row ; i++){

            System.out.println();
            for(j = 0 ; j < column ; j++){

                System.out.print("[" + i + "] " + "[" + j + "]  " + array[i][j] + "\t");
            }
        }
        
        for(i = 0 ; i < row ; i++){
            for(j = 0 ; j < column ; j++){

                if((array[i][j] % 2 == 1)){
                    ganjil = ganjil + 1;
                }
                
            }
        }

        System.out.println("\n\nHow Many Odd Number? ");
        System.out.print("Insert: ");
        banding = baca.nextInt();

        if(banding == ganjil){
            System.out.println("\n\nYou Are Brilliant!\n");
        }
        else{
            System.out.println("\n\nYou Are Wrong!!\n");
        }

        System.out.println("\n\n Do you wanna continue , 1 = Yes  2 = No");

        do{
        System.out.print("\nInsert: ");
        insert = baca.nextInt();
        }while((insert < 1)|| (insert > 2));

        if (insert == 1){
            parameter = 1;
        }
        else{
            parameter = 2;
        }
        


    }while(parameter == 1);



        


    }
}
