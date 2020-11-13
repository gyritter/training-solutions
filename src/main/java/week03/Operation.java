package week03;

public class Operation {

    private int left;
    private int right;
    private String input;

    public Operation(String input) {
       left= Integer.parseInt(input.substring(0,input.indexOf("+")));
      right= Integer.parseInt(input.substring(input.indexOf("+")+1));


    }

    public int getResult() {
        return left+right;
    }
}
