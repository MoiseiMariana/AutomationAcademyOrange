package Lesson8;

public class Toys {
    private String name;
    private String description;

    public Toys(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Toy{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}

