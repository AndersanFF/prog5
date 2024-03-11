package FlatCollectionPackage;

import java.util.Hashtable;
public class MainCollection {
    private static Hashtable<String, Integer> maincol = new Hashtable<String, Integer>(){{
        put("121",1);
    }
    };

        
    



    public static Hashtable<String, Integer> getMaincol(){
        return maincol;
    }
    
}
