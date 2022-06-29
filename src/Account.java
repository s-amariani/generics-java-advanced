import java.util.ArrayList;
import java.util.List;

class Account<T>{//generic კლასი
//ექაუნთი საბანკო ანგარიშისთვის(გამარტივებული მაგალითი)
    private T id;
    private int sum;

    private List<T> products = null;
    Account(T id, int sum){
        this.id = id;
        this.sum = sum;
    }

    public T getId() { return id; }
    public int getSum() { return sum; }
    public void setSum(int sum) { this.sum = sum; }

    //generic მეთოდი
    public <T> void subscribeProducts(T[] products){
        for (int i=0;i<products.length;i++) {

            for(T product: products){ //დასამატებელი პროდუქტების ბეჭდვა
            System.out.println(product);
        }

            /*
            /////
            საბანკო პროდუქტების დამატების ლოგიკა
            /////
             */
        }
    }
}