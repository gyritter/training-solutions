package week14d05;

public class Capital {

    public String convert(String name){
        if (name.equals("")){
            return "semmi";
        }
        return name.toUpperCase();
    }


    public static void main(String[] args) {
    Capital capital= new Capital();


        System.out.println(capital.convert(""));
        String name="Pisti";
        System.out.println(capital.convert(name));
        System.out.println(name);

}

}
