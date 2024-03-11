package CommandsPackage;


import java.time.LocalDate;

import FlatCollectionPackage.MainCollection;

public class Info {
    LocalDate initTime = LocalDate.now();
    public void info(){
        System.out.println(MainCollection.getMaincol().getClass().getSuperclass());
        System.out.println(initTime);
        System.out.println(MainCollection.getMaincol().values());
    }
    public void invoker(){
        info();
    }
}
