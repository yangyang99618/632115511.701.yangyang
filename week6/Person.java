package week6;
//yangyang 632115511
public class Person {
    String name;
    int age;
    public Person(){

    }
    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }
    public void introduce(){
        System.out.println("My name is "+name+" and my age is "+age);
        
    }
}
