import java.util.ArrayList;


public class ExceptionsTest {
    public static void main(String[] args) {

        ArrayList<Object> myList = new ArrayList<Object>();
        myList.add("13");
        myList.add("hello world");
        myList.add(48);
        myList.add("Goodbye World");

        for(int i=0; i<myList.size(); i++) {
            try {
                Integer casted_value = (Integer) myList.get(i);
            } catch(Exception e) {
                System.out.println("Error: " + e);
                System.out.println("Error occurred at index " + i + ". The value at this index is: " + myList.get(i));
                System.out.println();
            }
        }
    }
}
