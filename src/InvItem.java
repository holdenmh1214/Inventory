/**
 * Created by holdenhughes on 10/12/15.
 */
public class InvItem {
    String name;
    int qty;

    public InvItem (String text){
        this.name = text;
        this.qty=0;
    }

    public InvItem (String name, int qty){
        this.name = name;
        this.qty=qty;
    }
}
