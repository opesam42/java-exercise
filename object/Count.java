public class Count {
    static int count;

    public Count(){
        this.count = count + 1;
    }

    public static int getCount(){
        return count;
    }

    public static void main(String[] args){
        Count count1 = new Count();
        Count count2 = new Count();
        Count count3 = new Count();


        System.out.println(Count.getCount());
    }
}
