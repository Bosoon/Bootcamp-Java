public class BooleanComparions {
    public static void main(String[] args) {
        int chemistryGrade = 95;
        int biologyGrade = 75;
        int englishGrade = 75;

        System.out.println(biologyGrade > chemistryGrade);
        System.out.println(biologyGrade < chemistryGrade);
        System.out.println(chemistryGrade >= englishGrade);
        System.out.println(biologyGrade <= englishGrade);
        System.out.println(biologyGrade == englishGrade);
        System.out.println(biologyGrade != englishGrade);

        String sentence = "I love this course!";
        String sentence2 = "I love this course!";

        System.out.println(sentence.equals(sentence2));
        System.out.println(!sentence.equals(sentence2));
    }    
}
