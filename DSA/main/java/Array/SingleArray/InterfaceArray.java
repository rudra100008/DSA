package Array.SingleArray;


interface MyInterface{
    void doSomething();
    void anotherAction(String message);
}

class ClassA implements MyInterface{
    @Override
    public void doSomething(){
        System.out.println("Class A is doing something.");
    }

    @Override
    public void anotherAction(String message) {
        System.out.println("Class A: "+ message);
    }
}

class  ClassB implements MyInterface{
    @Override
    public void doSomething() {
        System.out.println("Class B is doing something.");
    }

    @Override
    public void anotherAction(String message) {
        System.out.println("Class B: "+ message);
    }
}

public class InterfaceArray {
    public static void main(String[] args) {
        MyInterface[] myInterface = new MyInterface[2];

        myInterface[0] = new ClassA();
        myInterface[1] = new ClassB();

        for(MyInterface obj : myInterface){
            obj.doSomething();
            obj.anotherAction("Hello World!");
        }
    }
}
