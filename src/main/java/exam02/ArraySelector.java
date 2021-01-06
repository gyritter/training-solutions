package exam02;

public class ArraySelector {

    public String selectEvens(int[] arrayOfNumbers) {
        if (arrayOfNumbers == null || arrayOfNumbers.length == 0) {
            return "";
        }
        StringBuilder result = new StringBuilder();
        result.append("[");
        for (int i = 0; i < arrayOfNumbers.length; i = i + 2) {
            result.append(arrayOfNumbers[i]).append(", ");
        }
        return result.delete(result.length() - 2, result.length()).append("]").toString();
    }
}
