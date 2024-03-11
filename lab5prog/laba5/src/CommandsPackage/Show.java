package CommandsPackage;

import FlatCollectionPackage.MainCollection;

public class Show {
    public void show(){
        for(int a : MainCollection.getMaincol().values()){
            System.out.println(a);

        }
    }
    public void invoker(){
        show();
    }
    
}
