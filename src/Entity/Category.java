package Entity;

public class Category {
    private String id;
    private String nameCategory;

    public Category() {
    }

    public Category(String id, String nameCategory) {
        this.id = id;
        this.nameCategory = nameCategory;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id='" + id + '\'' +
                ", nameCategory='" + nameCategory + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNameCategory() {
        return nameCategory;
    }

    public void setNameCategory(String nameCategory) {
        this.nameCategory = nameCategory;
    }
}
