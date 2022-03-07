package at.htlinn.auto;

public interface IKlassiker {
    MotorTyp getMotorTyp();
    int getPS();
    String getFahrgestellnummer();
    int getSitze();
    boolean getBenutzt();
    double getPrice();
    String getBeschreibung();
    void printAllInfo();
}
