import java.io.PrintStream;

public class Printer {

    private int paper;
    private int tonerVolume;

    public Printer(int paper, int tonerVolume){
        this.paper = paper;
        this.tonerVolume = tonerVolume;
    }

    public int getPaper(){
        return paper;
    }

    public int getToner(){
        return tonerVolume;
    }

    public void print(int numberPages, int numberCopies){
        int toPrint = numberCopies * numberPages;
        if(paper >= toPrint) {
            paper -= toPrint;
            tonerVolume -= toPrint;
        }
            System.out.println("Sorry, not enough paper");
    }

}
