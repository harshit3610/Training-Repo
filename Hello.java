import java.util.Function
class Hello{
    public static void main(String args[]) {
        System.out.println("Hello,World!");
        Function<Integer,Integer> f1=(x)->x*10;
        System.out.println("DONE");
    }    
}

