package week07;
//yangyang 632115511
public class Bird extends Pets {
    String country;
    String speak;
    String fly;
    String Species;
	
    public Bird(String species){
        this.Species = species;
    }
    public void Mybird(){
        System.out.println("Name: "+name+" Species: "+Species+" Color: "+color+" Age: "+age);
    }
    public void BirdLive(){
        System.out.println(country);
    }
    public void Birdspeak(){
        System.out.println(speak );
    }
    public void BirdFly(){
        if ("can't".equals(fly)){
            System.out.println(fly+" fly: true");
        }else{
            System.out.println("False is "+fly+" can fly");
        }
    }}