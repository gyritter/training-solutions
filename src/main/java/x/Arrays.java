package x;

public class Arrays {
    StringBuilder sb = new StringBuilder();

    public String arraySel(int[] input) {
        if(input==null) throw new IllegalArgumentException("Empty array");
        sb.append("[");
        for (int i = 0; i < input.length; i=i+2) {
            sb.append(input[i]);
        }
        sb.append("]");
        return sb.toString();
    }

    public static void main(String[] args) {
        Arrays arrays = new Arrays();
        System.out.println(arrays.arraySel(new int[]{2, 3, 4, 5}));

    }
}
