public class Table extends Furniture {
    private final int legs;
    public Table(String name, String material, double price, int legs) {
        super(name, material, price);
        this.legs = legs;
    }
    @Override
    public String getPurpose() { return "Поверхность для работы"; }
    @Override
    public String getDimensions() { return "120x80x75 см"; }
    @Override
    public void displayInfo() { super.displayInfo(); System.out.println("Ножек: " + legs); }
}
