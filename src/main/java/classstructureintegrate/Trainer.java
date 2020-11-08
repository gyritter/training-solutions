package classstructureintegrate;

public class Trainer {
    private String name;

    private int yearOfBirth;

    public Trainer (String name, int yearOfBirth ) { this.name= name; this.yearOfBirth=yearOfBirth;}


    public int getYearofBirth() {
        return yearOfBirth;
    }
        public String getName() {
            return name;

        }
        public int getAge () {
        return (2020-yearOfBirth);
        }

    public void setName (String name) {
       name = this.name;
    }

    public void setyearOfBirth (int yearOfBirth){
        yearOfBirth = this.yearOfBirth;
    }

    public void changeName(String newName) {
        name = newName;
    }


}
