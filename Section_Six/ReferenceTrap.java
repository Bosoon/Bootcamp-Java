import java.util.Arrays;

public class ReferenceTrap{
    public static void main(String[] args){
        String[] staffLastYear = {"Tommy", "Joel", "Ellie"};
        // String[] staffThisYear = new String[3];
        // for(int i = 0 ; i < staffThisYear.length; i++){
        //     staffThisYear[i] = staffLastYear[i];
        // }

        String[] staffThisYear = Arrays.copyOf(staffLastYear, staffLastYear.length);

        System.out.println("Before chaning something in array");
        System.out.println(Arrays.toString(staffLastYear));
        System.out.println(Arrays.toString(staffThisYear));

        staffThisYear[1] = "Abby";
        System.out.println("\nAfter chaning something in array");
        System.out.println(Arrays.toString(staffLastYear));
        System.out.println(Arrays.toString(staffThisYear));

        String[] items = {"Clock", "Table", "Ladder", "Chair", "Oven", "Phone"};
        function(items);
        System.out.println(items[0]);
    }

    public static void function(String[] item){
        item[0] = "bed";
    }
}