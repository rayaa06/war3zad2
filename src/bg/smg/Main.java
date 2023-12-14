package bg.smg;

public class Main {

    public static void main(String[] args) {
        Fish fish=new Fish();
        Bunny bunny=new Bunny();

        AnimalHouse<Fish> fishHouse= new AnimalHouse<>();
        fishHouse.animal=fish;

        AnimalHouse<Bunny> bunnyHouse=new AnimalHouse<>();
        bunnyHouse.animal=bunny;
    }
}
