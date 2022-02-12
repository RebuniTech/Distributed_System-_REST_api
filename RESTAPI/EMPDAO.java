package astu.edu.restemp;

import java.util.ArrayList;
import java.util.HashMap;

public class EMPDAO {
    private HashMap<Long,EMP> st = Storage.getStorage();
    Database database = new Database();


    public EMPDAO() {
        EMP e1 = new EMP(1L,"Derera");
        EMP e2 = new EMP(2L,"Eba");
        st.put(e1.getId(),e1);
        st.put(e2.getId(),e2);
    }
    public ArrayList<EMP> getEMPs(){
        return new ArrayList<EMP>(st.values());
    }
    public EMP createEMP(EMP e){
        st.put(e.getId(),e);



        return e;
    }
    public EMP updateEMP(EMP e){
        st.put(e.getId(),e);
        return e;
    }
    public  long deleteEMP(Long id){
        st.remove(id);
        return id;
    }


}
