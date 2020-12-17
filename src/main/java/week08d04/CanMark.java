package week08d04;

public interface CanMark {
    default int giveMark(){
        return 4;
    }
}
