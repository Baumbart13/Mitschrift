package at.htlinn.auto;

import at.htlinn.auto.Audi.*;
import at.htlinn.auto.Ford.*;
import at.htlinn.auto.Toyota.*;

public class Autohaus {
    public static IAuto getAudiA3()
    {
        IAuto a = new Auto();
        a = new A3(a);
        return a;
    }
    public static IRennauto getAudiR8Spyder()
    {
        IRennauto r = new Rennauto();
        r = new R8_Spyder(r);
        return r;
    }
    public static IKlassiker getFordMustang()
    {
        IKlassiker k = new Klassiker();
        k = new Mustang(k);
        return k;
    }
    public static IAuto getToyotaChr(){
        IAuto a = new Auto();
        a = new CH_R(a);
        return a;
    }
}
