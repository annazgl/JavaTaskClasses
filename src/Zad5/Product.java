package Zad5;

public class Product {
    private String name;
    private String description;
    private String specification;

    public Product(String name) {
        this.name = name;
        this.description = description;
    }

    public Product(String name, String description, String specification) {
        this.name = name;
        this.description = description;
        this.specification = specification;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", specification='" + specification + '\'' +
                '}';
    }
}
