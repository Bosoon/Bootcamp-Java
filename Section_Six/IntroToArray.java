public class IntroToArray {
    public static void main(String[] args) {
        String[] kingdoms = {"Merica", "Wessex", "Northumbria", "E A"};
        System.out.println(kingdoms);
        for(String kingdom:kingdoms){
            System.out.println(kingdom);
        }
        System.out.println("Length of array : " + kingdoms.length);
    }
}
