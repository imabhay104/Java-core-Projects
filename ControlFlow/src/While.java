public class While {
    public static void main(String[] args) {
        int i = 5;
        while (i <= 20)
        {
            if (isEvenNumber(i))
            {
                System.out.println(i);
            }
            i++;
        }
    }
    public  static boolean isEvenNumber(int no)
    {
        if (no%2==0) return true;
        else  return false;
    }
}
