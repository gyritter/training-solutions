package localvariables;

public class DistanceMain {
    public static void main(String[] args) {
        Distance distance = new Distance();
        System.out.println(distance.getDistanceinKm());
        System.out.println(distance.isExact());
        int i;
        i = (int) distance.getDistanceinKm();
        System.out.println(i);

    }
}
