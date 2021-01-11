package exceptionclass;

public class SimpleTime {

    private int hour;
    private int minute;

    public SimpleTime(int hours, int minutes) {
        if (hourValidator(hours)) this.hour = hours;
        if (minuteValidator(minutes)) this.minute = minutes;
    }

    public SimpleTime(String time) {
        if (time==null || time.length()<1){
            throw new InvalidTimeException("Time is null");
        }

        if (time.length() != "hh:mm".length() || time.charAt(2) != ':')
            throw new InvalidTimeException("Time is not hh:mm");

        int h;
        try {
            h = Integer.parseInt(time.substring(0,2));
        } catch (NumberFormatException ex) {
            throw new InvalidTimeException("Time is not hh:mm");
        }

        int m;
        try {
            m = Integer.parseInt(time.substring(3, 5));
        } catch (NumberFormatException ex) {
            throw new InvalidTimeException("Time is not hh:mm");
        }

        this.hour = h;
        this.minute = m;
    }

    private int numberValidator(String numb){
        if(numb.length()==2){
            String digit="0123456789";
            if (digit.contains(numb.substring(0,1)) && digit.contains(numb.substring(1))){
                return Integer.parseInt(numb);
            }
        }
        throw new InvalidTimeException("Time is not hh:mm");
    }

    private boolean hourValidator(int hour){
        if(hour<0 || hour>23){
            throw new InvalidTimeException("Hour is invalid (0-23)");
        }
        return true;
    }

    private boolean minuteValidator(int minutes){
        if(minutes<0 || minutes>59){
            throw new InvalidTimeException("Minute is invalid (0-59)");
        }
        return true;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public String toString(){
        return numberConvert(hour) + ":" + numberConvert(minute);
    }

    private String numberConvert(int number){
        String num=""+number;
        if (num.length()<2){
            return "0"+num;
        }
        return num;
    }
}
