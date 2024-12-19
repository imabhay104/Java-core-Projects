import static java.lang.constant.ConstantDescs.NULL;

public class MyLinkedList implements NodeList{
    private ListItem root;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }


        @Override
    public boolean addItem(ListItem  item) {
        if (root==NULL) {
            this.root = item;
            return true;
        }
        return false;
    }

    @Override
    public void removeItem() {

    }

    @Override
    public void traverse() {

    }
}
