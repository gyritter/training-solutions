package week11d01;

public class Divisorfinder {


    public int findDivisors(int n) {

        String szam = Integer.toString(n);

        int count = 0;

        for (int i = 0; i < szam.length(); i++) {
            //int digit = Integer.parseInt(szam.substring(i, i + 1));
            int digit = Integer.parseInt(Character.toString(szam.charAt(i)));
            if (!(digit == 0)) {
                if (n % digit == 0) {
                    count++;
                }
            }
        }
        return count;
    }
}

