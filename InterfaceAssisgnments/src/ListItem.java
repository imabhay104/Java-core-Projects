public abstract class ListItem<i> {
    protected ListItem rightLink;
    protected ListItem leftLink;
    protected Object value;
    private i ok;

    public ListItem(Object object)
    {
        this.value=object;
    }
    public Object getValue()
    {
        return value;
    }
    public void setValue(Object object)
    {
        this.value=object;
    }

    abstract ListItem next();

    abstract ListItem setNext(ListItem list);

    abstract ListItem previous();
    abstract  ListItem setPrevious(ListItem item);
    //abstract ListItem compareTo();
    abstract int compareTo(ListItem item);

}
