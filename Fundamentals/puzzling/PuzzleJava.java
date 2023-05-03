import java.util.Random;
import java.util.ArrayList;

public class PuzzleJava {
    public int[] getTenRolls() {
        Random rand = new Random();
        int[] rand_array = new int[10];

        for(int i=1; i<10; i++) {
            rand_array[i] = rand.nextInt(20);
        }
        return rand_array;
    }
    public ArrayList<Integer> getRolls(int num_rolls) {
        Random rand = new Random();
        ArrayList<Integer> rand_array = new ArrayList<Integer>();

        for(int i=1; i<10; i++) {
            rand_array.add(rand.nextInt(num_rolls));
        }
        return rand_array;
    }

    public char getRandomLetter() {
        char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        Random rand = new Random();
        int rand_num = rand.nextInt(26);
        return alphabet[rand_num];
    }

    public String generatePassword() {
        String password = "";
        for(int i=0; i<8; i++) {
            String rand_letter = Character.toString(getRandomLetter());
            password+= rand_letter;
        }
        return password;
    }

    public ArrayList<String> getNewPasswordSet(int length) {
        ArrayList<String> rand_words = new ArrayList<String>();
        for(int i=0; i<length; i++) {
            rand_words.add(generatePassword());
        }
        return rand_words;
    }

    public ArrayList<Integer> shuffleArray(ArrayList<Integer> myArray) {
        ArrayList<Integer> first_rand_array = new ArrayList<Integer>();
        first_rand_array = getRolls(myArray.size());
        ArrayList<Integer> second_rand_array = new ArrayList<Integer>();
        second_rand_array = getRolls(myArray.size());

        for(int i=0; i<myArray.size(); i++) {
            int first_index = first_rand_array.get(i);
            int second_index = second_rand_array.get(i);

            Integer temp = myArray.get(first_index);  
            myArray.set(first_index, myArray.get(second_index));
            myArray.set(second_index, temp);
        }
        return myArray;
    }
}