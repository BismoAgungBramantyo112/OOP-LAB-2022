import java.util.*;

//Bismo Agung Tri Achmad B - 2440059495 - Lab Week 3

public class lab3 {
    public static void main(String[] args) {
        int Jumlah = 0, baris = 0, kolom = 0;
        char Character;
        int i = 0, j = 0, n = 0;
        Scanner baca = new Scanner(System.in);

        do{
        System.out.println("Input kolom: ");
        kolom = baca.nextInt();
        }while(kolom<3 || kolom > 10);
        
        do{
        System.out.println("Input baris: ");
        baris = baca.nextInt();
        }while(baris<3 || kolom > 10);

        System.out.println("Input Karater: ");
        Character = baca.next().charAt(0);
        
        do{
        System.out.println("Input jumlah: ");
        Jumlah = baca.nextInt();  
        }while(Jumlah<1 || Jumlah>5);    

        
         for (i = 1; i <= baris ; i++ ){
                
           for(n=1 ; n <= Jumlah ; n++){

                for(j = 1; j <= kolom ; j++){

                    System.out.print("  "); 

                    if( (i == 1) || (i == baris) ){
                        System.out.print(Character);
                    }
                    else{
    
                        if((j == 1) || (j == kolom)){
                            System.out.print(Character);
                        }
                        else{
                            System.out.print(" ");  
                        }
                        
                    }
                   
                }
           }
           System.out.println();     
        }

    }
}
