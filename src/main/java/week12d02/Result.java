package week12d02;

public class Result {

    private Fence fence;
    private int number;

    public Fence getFence() {
        return fence;
    }

    public int getNumber() {
        return number;
    }

    public Result(Fence fence) {
        this.fence = fence;
        this.number = 0;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
