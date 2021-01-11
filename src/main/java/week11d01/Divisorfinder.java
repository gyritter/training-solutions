package week11d01;

public class Divisorfinder {



        public int findDivisors(int n) {

            String szam=Integer.toString(n);

            int count=0;

            for(int i=0; i<szam.length(); i++){

                if(n%(Integer.parseInt(szam.substring(i,i+1)))==0){
                    count++;
                }

            }

            return count;
        }
    }

