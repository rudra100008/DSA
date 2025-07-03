package Array.SingleArray;

public class Student {
    private final String name;
    public Student(String name){
        this.name = name;
    }
    @Override
    public String toString(){
        return "Name: " + name;
    }
}

 class Main{
    public static void main(String[] args) {
        // declares an Array and initializing the
        // elements of the array
        Student[] students = new Student[]{
                new Student("Sharma"),new Student("Hari")
                , new Student("Ashum"), new Student("Abin")
        };
        // accessing the elements of the specified array
        for(Student s :students){
            System.out.println(s);
        }

    }
}
