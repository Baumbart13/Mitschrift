package at.htlinn.auto;

public interface IAuto {
    MotorTyp getMotortyp();
    int getSitze();
    int getTüren();
    String getFahrgestellnummer();
    double getPreis();
    String getBeschreibung();
    int getPS();
    void printAllInfo();
}
