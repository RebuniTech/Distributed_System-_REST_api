package astu.edu.restemp;

import java.util.HashMap;

public class Storage {
    private static HashMap<Long, EMP> es = new HashMap<>();
    public static HashMap<Long,EMP> getStorage(){
        return es;
    }
}
