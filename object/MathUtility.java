public class MathUtility {

    public static int add(int num1, int num2){
        return num1 + num2;
    }

    public static void main(String[] args){
        MathUtility math1 = new MathUtility();
        System.out.println( math1.add(2,5) );
        System.out.println(add(2,7));
    }
}
