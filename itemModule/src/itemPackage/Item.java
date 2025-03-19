package itemPackage;

public class Item {
    private String item1;
    private double item1Price;
    private String  item2;
    private double item2Price;

    public Item(String item1, double item1Price, String item2, double item2Price) {
        this.item1 = item1;
        this.item1Price = item1Price;
        this.item2 = item2;
        this.item2Price = item2Price;
    }
    public double getItem1Price() {
        return item1Price;
    }
    public double getItem2Price() {
        return item2Price;
    }

    public void add(){
        double newItem = item1Price + item2Price;
        System.out.println("The addition of the new item total is "+newItem+"$");
    }
}
