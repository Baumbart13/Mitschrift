package htl;

import htl.bohrer.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Command Pattern");

        System.out.println("\n================ BROWSER ================");
        var browserRec = new CommandRecorder();
        var web = new WebRequest();

        browserRec.execute(new GetRequestCmd(web, "Seite1"));
        browserRec.execute(new GetRequestCmd(web, "Seite2"));
        browserRec.execute(new GetRequestCmd(web, "Seite3"));
        browserRec.execute(new GetRequestCmd(web, "Seite4"));
        browserRec.execute(new GetRequestCmd(web, "Seite5"));
        System.out.println("================ Test1 - Browser ================");
        browserRec.undo();
        browserRec.undo();
        browserRec.undo();
        System.out.println("================ Test2 - Browser ================");
        browserRec.redo();
        browserRec.redo();

        System.out.println("\n================ BOHRER ================");
        // Bewegung eines Bohrers programmieren
        var bohrerRec = new CommandRecorder();
        var bohrer = new Bohrer();

        bohrerRec.execute(new HebenCmd(bohrer, 111));
        bohrerRec.execute(new LinksCmd(bohrer, 222));
        bohrerRec.execute(new RechtsCmd(bohrer, 333));
        bohrerRec.execute(new VorCmd(bohrer, 444));
        bohrerRec.execute(new ZurückCmd(bohrer, 555));
        bohrerRec.execute(new SenkenCmd(bohrer, 666));
        System.out.println("================ Test1 - Bohrer ================");
        while(bohrerRec.canUndo()){
            bohrerRec.undo();
        }
        System.out.println("================ Test2 - Bohrer ================");
        bohrerRec.redo();
        bohrerRec.redo();
        bohrerRec.redo();
        bohrerRec.undo();
        System.out.println("================ Test3 - Bohrer ================");
        while(bohrerRec.canUndo()){
            bohrerRec.undo();
        }
        while(bohrerRec.canRedo()){
            bohrerRec.redo();
        }
    }
}
