public class Bottle {

    private int volume;

    public Bottle(int volume){
        this.volume = volume;
    }

    public int getVolume(){
        return volume;
    }

    public int reduceDrink(){
        return volume -= 10;
    }

    public int empty(){
        return volume = 0;
    }

    public int fill(){
        return volume;
    }

}
