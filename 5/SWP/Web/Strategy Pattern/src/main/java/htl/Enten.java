package htl;

public class Enten {
    private LautVerhalten laut;

    public BewegungsVerhalten getBewegen() {
        return bewegen;
    }

    public void setBewegen(BewegungsVerhalten bewegen) {
        this.bewegen = bewegen;
    }

    private BewegungsVerhalten bewegen;

    public Enten(LautVerhalten lautVerhalten, BewegungsVerhalten bewegungsVerhalten) {
        laut = lautVerhalten;
        bewegen = bewegungsVerhalten;
    }

    public void bewegen(){
        bewegen.bewegen();
    }

    // Laut geben
    public void gibLaut() {
        // Delegate
        laut.gibLaut();
    }

    // Ändern des LautVerhaltens
    public void setLaut(LautVerhalten v) {
        laut = v;
    }

    public LautVerhalten getLaut() {
        return laut;
    }
}
