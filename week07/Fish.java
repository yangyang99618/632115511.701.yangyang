package week07;
//yangyang 632115511
public class Fish extends Pets {
    String size;
    String water;
    double speed;
    String sea;   
    String Species;
	public String Size;
    public Fish(String species){
        this.species = species;
    }
    public void MyFish(){
        System.out.println("Name: "+name+" Species: "+Species+" Color: "+color+" Age: "+age);
    }
    public void FishSpeed(){
        System.out.println(speed+"m/s");
    }
    public void FishSize(){
        System.out.println(Size);
    }
    public void FishSea(){
        System.out.println("live in  "+sea);
    }
    public void FishLive(){
        if ("Salt water".equals(water)){
            System.out.println(water+" water: true");
        }else{
            System.out.println("False is "+water+"  fresh water");
        }
    }}
