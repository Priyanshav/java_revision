enum Laptop{
    Macbook(2000), XPS(2500), Surface(1500), ThinkPad(1800), JioBook;

    private int price;
    private Laptop(){
        price = 500;
    }
    private Laptop(int price){
        this.price = price;
    }
    public int getPrice(){
        return price;
    }
    public void setPrice(int price){
        this.price = price;
    }
}

public class enumImplem{
    public static void main(String[] args){
        Laptop l1 = Laptop.ThinkPad;
        l1.setPrice(1850);
        for(Laptop lappy : Laptop.values()){
            System.out.println(lappy.ordinal() + ". " + lappy + " : " + lappy.getPrice());
        }
        switch(l1){
            case Macbook:
                System.out.println("Expensive");
                break;
            case XPS:
                System.out.println("Very Expensive");
                break;
            case ThinkPad:
                System.out.println("Great");
                break;
            case Surface:
                System.out.println("Cheaper");
                break;
            default:
                System.out.println("Cheapest");
        }
    }
}