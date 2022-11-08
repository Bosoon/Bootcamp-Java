import java.util.Arrays;

public class TDarrays {
    public static void main(String[] args) {
        int[][] grades = new int[3][4];
        System.out.println("\tHarry: " + Arrays.toString(grades[0]));
        System.out.println("\tRon: " + (Arrays.toString(grades[1])));
        System.out.println("\tHermione: " + Arrays.toString(grades[2]));

        System.out.println("After updating");
        grades[0][0] = 72;
        grades[0][1] = 74;
        grades[0][2] = 78;
        grades[0][3] = 76;

        grades[1][0] = 65;
        grades[1][1] = 64;
        grades[1][2] = 61;
        grades[1][3] = 67;

        grades[2][0] = 95;
        grades[2][1] = 98;
        grades[2][2] = 99;
        grades[2][3] = 100;

        System.out.println("\tHarry: " + Arrays.toString(grades[0]));
        System.out.println("\tRon: " + (Arrays.toString(grades[1])));
        System.out.println("\tHermione: " + Arrays.toString(grades[2]));

        System.out.println("\nUsing the other initialization");
        int[][] grades2 = { {72, 74, 78, 76},
         {65, 64, 61, 67}, 
         {95, 98, 99, 100}
        };
        System.out.println("\tHarry: " + Arrays.toString(grades2[0]));
        System.out.println("\tRon: " + (Arrays.toString(grades2[1])));
        System.out.println("\tHermione: " + Arrays.toString(grades2[2]));

        System.out.println("Using loop");
        String[] names = {"Harry", "Ron", "Hermione"};

        for(int i = 0; i < 3; i++){
            System.out.print("\t" + names[i] + ": ");
            for(int j=0; j < 4 ; j++){
                System.out.print(grades[i][j]+ " ");
            }
            System.out.println();
        }

        String[][] tables = new String[3][3];
        System.out.println(tables[0]);
        System.out.println(Arrays.toString(tables[0]));
        }
}
