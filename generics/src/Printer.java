public  class Printer <T> {
    private T value;
    public Printer(T value)
    {
        this.value=value;
    }
    public void print()
    {
        System.out.println(value);

    }
}
