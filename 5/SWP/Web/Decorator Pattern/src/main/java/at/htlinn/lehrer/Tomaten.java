package at.htlinn.lehrer;

public class Tomaten implements IPizza {
    private IPizza p;

    public Tomaten(IPizza p){
        super();
        this.p = p;
    }

    @Override
    public double getPrice() {
        return p.getPrice() + .50d;
    }

    @Override
    public String getDescription() {
        return p.getDescription() + " mit Tomatensauce";
    }
}
