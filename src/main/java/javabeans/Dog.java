package javabeans;

public class Dog {

    private String name;
    private int age;
    private Boolean pedigree;
    private Double weight;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Boolean isPedigree() {
        return pedigree;
    }

    public Double getWeight() {
        return weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPedigree(Boolean pedigree) {
        this.pedigree = pedigree;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }
}
