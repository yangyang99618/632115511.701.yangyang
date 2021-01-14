package week6;
public class InheritanceEXample{
    public static void main(String[] args){
        Artist art = new Artist("Ball",20);
        art.genre="hiphop";
        art.job0="teacher";
        art.job2="anchor"; 
        art.job3=" Worker";
        art.job4="Write";
        art.introduce();
        art.playMusic();
        art.job();
}
}