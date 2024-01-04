package Model;


public class T_Shirt {

    private String item_Name;
    private String item_Code;
    private double price;
    private String brand;
    private String description;

    private String[]size;

    public Tshirt(String item_Name, String productCode, double price, String brand, String description, String[] sizes) {
        this.item_Name = item_Name;
        this.item_Code = productCode;
        this.price = price;
        this.brand = brand;
        this.description = description;
        this.size = sizes;
    }

    public String getItem_Name() {
        return item_Name;
    }

    public void setItem_Name(String item_Name) {
        this.item_Name = item_Name;
    }

    public String getItem_Code() {
        return item_Code;
    }

    public void setItem_Code(String item_Code) {
        this.item_Code = item_Code;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String[] getSize() {
        return size;
    }

    public void setSize(String[] size) {
        this.size = size;
    }

    public void displayTshirt() {
        System.out.println("Item name: " + item_Name);
        System.out.println("Description: " + description);
        System.out.println("Product code: " + item_Code);
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);


    }

