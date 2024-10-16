
package com.mycompany.oopprojecr;

/**
  @author leeno
 */
public class USER {
    
    private String PASNGER_NAME;
    private String PASNGER_ID;
    
    public USER (String name,String id){
        this.PASNGER_NAME=name;
        this.PASNGER_ID=id;
    }

    public String getPASNGER_NAME() {
        return PASNGER_NAME;
    }

    public String getPASNGER_ID() {
        return PASNGER_ID;
    }

    public void setPASNGER_NAME(String PASNGER_NAME) {
        this.PASNGER_NAME = PASNGER_NAME;
    }

    public void setPASNGER_ID(String PASNGER_ID) {
        this.PASNGER_ID = PASNGER_ID;
    }

    @Override
    public String toString() {
        return "USER{" + "PASNGER_NAME=" + PASNGER_NAME + ", PASNGER_ID=" + PASNGER_ID + '}';
    }
    
    
    
    
}
