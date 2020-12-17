package week08d04;

public class Trainer {
    CanMark canMark;

    public Trainer(CanMark canMarkPéldány) {
        this.canMark = canMarkPéldány;
    }
    public int giveMark(){
        return canMark.giveMark();
    }

    public static void main(String[] args) {
        Trainer badTrainer=new Trainer(new BadMood());
        Trainer goodTrainer=new Trainer(new GoodMood());
        System.out.println("BAD " + badTrainer.giveMark());
        System.out.println("GOOD " + goodTrainer.giveMark());
    }
}
