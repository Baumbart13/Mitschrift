package at.htlinn.lehrer;

public class Schinken implements IPizza{
    private IPizza p;

    public Schinken(IPizza p){
        super();
        this.p = p;
    }

    @Override
    public double getPrice() {
        return p.getPrice() + 0.5d;
    }

    @Override
    public String getDescription() {
        return p.getDescription() + " mit Schinken";
    }
}
