package exam03retake;

public class CdvCheck {

    public Boolean check (String taxID) {
        int sum = 0;
        for(int i=0;i<9;i++){
            if(taxID.length()!=10 ||
                    !Character.isDigit(taxID.charAt(i))) throw new IllegalArgumentException();
            sum+=((taxID.charAt(i))-'0')*(i+1);
        }

        if (sum%11==((taxID.charAt(9)))-'0') {
            return true;
        }
        return false;
    }


}
