package week06d05;

public class Biscuit {

    private static BiscuitType type;
    private static int gramAmount;

    public static void of(BiscuitType type, int gramAmount){
        type=type;
        gramAmount=gramAmount;
    }

    public static BiscuitType getType() {
        return type;
    }

    public static int getGramAmount() {
        return gramAmount;
    }

    public static void print(){
        System.out.println(type +" "+gramAmount);
    }

}








   /* Készíts a week06d05 csomagban egy Biscuit nevű osztályt,
    amelynek van 2 attribútuma: BiscuitType type és int
    gramAmount. A BiscuitType legyen
    felsorolásos típus a 3 kedvenc
    kekszfajtáddal. A Biscuit nevű osztálynak
    legyen egy static metódusa of néven, mely paraméterként
    egy BiscuitType-ot, és egy int gramAmount-ot vár és visszaad egy
    új Biscuit objektumot amelyet a megadott paraméterek alapján hoz
    létre. Bónusz feladat: konzolra
    írás esetén a Biscuit jelenítse meg a type és a gramAmount mezőket!
    */
