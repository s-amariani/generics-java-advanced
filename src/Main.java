import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Account<String> acc1 = new Account<String>("2345", 5000); //გადავცემთ id-ის string-ად
        String acc1Id = acc1.getId();
        System.out.println(acc1Id);

        Account<Integer> acc2 = new Account<Integer>(2345, 5000);//გადავცემთ id-ის int-ად
        Integer acc2Id = acc2.getId();
        System.out.println(acc2Id);

        ArrayList<String> k = new ArrayList<>();
        k.add("მიმდინარე ანგარიში");
        k.add("სმს სერვისი");
        acc1.subscribeProducts(new ArrayList[]{k});
    }
}