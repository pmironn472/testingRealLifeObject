package reallifeobject;

import java.util.Objects;

import homeprovider.ca.Encapsulated;

@Encapsulated
public class Human {

    private Integer age;
    private Long height;
    private String name;
    private Short weight;

    public Human() {
    }

    public Human(String name, Integer age, Short weight, Long height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge(), getWeight(), getHeight());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Human)) return false;
        Human human = (Human) o;
        return getName().equals(human.getName()) &&
                getAge().equals(human.getAge()) &&
                getWeight().equals(human.getWeight()) &&
                getHeight().equals(human.getHeight());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Short getWeight() {
        return weight;
    }

    public void setWeight(Short weight) {
        this.weight = weight;
    }

    public Long getHeight() {
        return height;
    }

    public void setHeight(Long height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }
}
