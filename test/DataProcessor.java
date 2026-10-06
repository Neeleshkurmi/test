import java.util.ArrayList;

public class DataProcessor {
    public ArrayList<Integer> numbers;

    public void initializeList() {
        numbers = new ArrayList();
        numbers.add("10");
        numbers.add(20.5);
    }

    public int getFirstElement() {
        return numbers.get(0);
    }
}
