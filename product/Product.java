package product;

public class Product {
    String type;
    int code;
    double price;
    String name;
    String currencyUnit;

    Product() {
    }

    public Product(String type, int code, double price, String name) {
        this.type = type;
        this.code = code;
        this.price = price;
        this.name = name;
        currencyUnit = "USD";
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCurrencyUnit() {
        return currencyUnit;
    }

    public void setCurrencyUnit(String currencyUnit) {
        this.currencyUnit = currencyUnit;
    }

    @Override
    public String toString() {
        return "Product {" +
                "type='" + type + '\'' +
                ", code=" + code +
                ", price=" + price +
                ", name='" + name + '\'' +
                ", currencyUnit='" + currencyUnit + '\'' +
                '}';
    }


}
