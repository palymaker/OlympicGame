package Template;

public abstract class Race {
    public int getMeter() {
        return meter;
    }

    public void setMeter(int meter) {
        this.meter = meter;
    }

    protected int meter;
    public abstract int Ready();
    public abstract int Run();
    public abstract int End();
    public final void Action(){
        int r=Ready();
        while(r!=1){
            r=Ready();
        }
        Run();
        End();
    }
}
