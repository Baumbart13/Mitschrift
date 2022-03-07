package at.htlinn.auto;

public interface IRennauto {
    MotorTyp getMotorTyp();
    String getGestellTyp();
    String getHersteller();
    double getPreis();
    int getPS();
    String getBeschreibung();
    void printAllInfo();
}
