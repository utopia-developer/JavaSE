package part3_Java常用工具类.chapter20_集合排序.comparator;

public class Cat {
    private String name;
    private int age;
    private String species;

    public Cat(String name, int age, String species) {
        this.setName(name);
        this.setAge(age);
        this.setSpecies(species);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    @Override
    public String toString() {
        return "[名字：" + this.getName() + "，年龄：" + this.getAge()
                + "，品种：" + this.getSpecies() + "]";
    }
}
