package week06d05;

public class BottleMain {
    public static void main(String[] args) {


    Bottle pet=Bottle.of(BottleType.PET_BOTTLE);

        System.out.println(pet.getFilledUntil());
        pet.fill(1600);
        System.out.println(pet.getFilledUntil());
}
}
