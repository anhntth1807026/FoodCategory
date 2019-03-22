package Entity;

public class Food {

    private String id;
    private String name;
    private String description;
    private int price;
    private int createAt;

    public Food(String id, String name, String description, int price, int createAt) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.createAt = createAt;
    }

    @Override
    public String toString() {
        return "Main{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", description=" + description +
                ", price='" + price + '\'' +
                ", createAt='" + createAt + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCreateAt() {
        return createAt;
    }

    public void setCreateAt(int createAt) {
        this.createAt = createAt;
    }
}
