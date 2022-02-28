package at.htlinn.lehrer;

public class Hefeteig implements IPizza {
    @Override
    public double getPrice() {
        return 1.0d;
    }

    @Override
    public String getDescription() {
        return "Hefeteig";
    }
}
