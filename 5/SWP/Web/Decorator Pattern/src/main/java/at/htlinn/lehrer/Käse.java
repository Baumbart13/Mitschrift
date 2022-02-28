package at.htlinn.lehrer;

public class Käse implements IPizza{
    private IPizza p;

    public Käse(IPizza p){
        super();
        this.p = p;
    }

    @Override
    public double getPrice() {
        return p.getPrice() + 0.5d;
    }

    @Override
    public String getDescription() {
        return p.getDescription() + " mit Käse";
    }
}
