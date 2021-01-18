package week07;

public class OutPut {
	public static void main(String[] args) {
        Dog ani = new Dog("Dog");
        
        ani.name = "Lucky";
        ani.species = "Dog";
        ani.Species = "Pooddle";
        ani.color = "Brown";
        ani.age = 2;
        ani.place = "jungle";
        ani.size = "Small";
        ani.bark = "Box Box!!";
        ani.sport = "run";
        ani.hair = "Short";
        
        ani.introduce();
        ani.MyDog();
        ani.DogSport();
        ani.DogSizeBark();
        ani.Doghair();
   
        System.out.println("--------------------------------------------------");

        Fish ani1 = new Fish("Fish");
        
        ani1.name = "HMT";
        ani1.species = "Fish";
        ani1.Species = "Shark";
        ani1.age = 21;
        ani1.speed = 999;
        ani1.color = "yellow";
        ani1.water = "Salt water";
        ani1.Size = "500cm";
        ani1.sea = "Sea";

        ani1.introduce();
        ani1.MyFish();
        ani1.FishLive();
        ani1.FishSize();
        ani1.FishSpeed();
        ani1.FishSea();

        System.out.println("--------------------------------------------------");

        Bird ani2 = new Bird("Bird");

        ani2.country = "China";
        ani2.Species = "peacock ";
        ani2.speak = "Bird languages";
        ani2.fly = "can't";
        ani2.age = 1;
        ani2.color = "It's mostly green";
        ani2.name = "songxiling";

        ani2.introduce();
        ani2.Mybird();
        ani2.BirdLive();
        ani2.Birdspeak();
        ani2.BirdFly();

    }
        
}


