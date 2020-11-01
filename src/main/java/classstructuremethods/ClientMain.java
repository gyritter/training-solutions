package classstructuremethods;

public class ClientMain {

public static void main(String[] args){

        Client client = new Client();
        client.setName("Kiss Janos");
        client.setYear(1999);
        client.setAddress("Pecs Fűzfa utca 9");
        System.out.println(client.getName());
        System.out.println(client.getYear());
        System.out.println(client.getAddress());

        client.migrate("2440 Százhalombatta, Tópart u. 29.");

        System.out.println("Új lakcím: " + client.getAddress());}
}

