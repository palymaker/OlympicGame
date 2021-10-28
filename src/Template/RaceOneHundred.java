package Template;

public class RaceOneHundred extends Race{
    RaceOneHundred(){
        this.meter = 100;
    }
    @Override
    public int Ready() {
        System.out.println("On your Mark!");
        System.out.println("Set!");
        System.out.println("Go!");
        return 1;
    }

    @Override
    public int Run() {
        return 0;
    }

    @Override
    public int End() {
        return 0;
    }
}
