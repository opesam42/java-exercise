public class Classroom {
    String className;
    String[] students;

    public Classroom(String className, String[] students){
        this.className = className;
        this.students = students;
    }

    public static void main(String[] args) {
        Classroom ss1 = new Classroom("SS1", new String[] {"Olamide Willy", "Adekunle Biodun", "Michelle Bode"});
        System.out.println("The new class is " + ss1.className + "\n");
        System.out.println("Students");
        String[] students = ss1.students;

        for(int i = 0; i < students.length; i++){
            System.out.println( i+1 + ". " + students[i] );
        }
    }
}
