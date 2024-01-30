public class SwapWithoutTemp {
    public static void main(String[] args){
        int a = 5;
        int b = 10;
        a = a ^ b; //USING XOR
        b = a ^ b;
        a = a ^ b;
        System.out.println("After swapping: a = " +a+ " and b = " +b);
    }
}
