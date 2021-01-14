package week6;
//yangyang 632115511
public class Artist extends Person{
String genre;
String job1;
String job2;
String job3;
String job4;
public Artist(String name,int age){
this.age=age;
this.name=name;
}
public void playMusic(){
    System.out.println(name+"is playing"+genre+"music");
}
public void job(){
System.out.println("Ten years ago I was a"+job1);
System.out.println("Then i became a "+job2);
System.out.println("After meeting my girlfriend, I became a "+job3);
System.out.println("Now i am a "+job4);
}
}



    
    
