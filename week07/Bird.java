package week07;

public class Bird extends Pets {
    String country;
    String speak;
    String fly;
    String species;
    
    public Bird(String species){
        this.species = species;
    }
    public void Mybird(){
        System.out.println("Name: "+name+" Species: "+Species+" Color: "+color+" Age: "+age);
    }
    public void BirdLive(){
        System.out.println(country);
    }
    public void Birdspeak(){
        System.out.println("the"+speak );
    }
    public void BirdFly(){
        if ("ccan't".equals(fly)){
            System.out.println(fly+" fly: true");
        }else{
            System.out.println("False is "+fly+" hair");
        }
    }}