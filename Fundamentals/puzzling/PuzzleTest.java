import java.util.ArrayList;

public class PuzzleTest {
    public static void main(String[] args) {

        PuzzleJava puzzles = new PuzzleJava();
        // System.out.println(puzzles.getTenRolls());
        // System.out.println(puzzles.getRolls(10));

        // System.out.println(puzzles.getRandomLetter());
        // System.out.println(puzzles.generatePassword());

        // System.out.println(puzzles.getNewPasswordSet(3));

        ArrayList<Integer> myArray = new ArrayList<Integer>();
        myArray = puzzles.getRolls(10);
        System.out.println(myArray);
        System.out.println(puzzles.shuffleArray(myArray));
    }
}