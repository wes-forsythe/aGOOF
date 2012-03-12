/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Adventure.GameParser;

/**
 *
 * @author jeffj
 */
public class Action {
    private String subject;
    private String action;
    private String dobject;
    private String iobject;
    private String errorMsg;
    
    public Action() {
        subject = action = dobject = iobject = "";
        errorMsg = null;
    }
    
    public void setError(String error) {
        this.errorMsg = error;
    }
    
    public String Subject() {
        return subject;
    }
    
    public void setSubject(String subject) {
        this.subject = subject;
    }
    
    public String Action() {
        return action;
    }
    
    public void setAction(String action) {
        this.action = action;
    }
    
    public String DObject() {
        return dobject;
    }
    
    public void setDObject(String dobject) {
        this.dobject = dobject;
    }
    
    public String IObject() {
        return iobject;
    }
    
    public void setIObject(String iobject) {
        this.iobject = iobject;
    }
    
    @Override
    public String toString() {
        String action = errorMsg;
        if (this.errorMsg == null)
            action = "ACTION(SUB("+this.subject+"),ACT("+this.action+
                    "),dOBJ("+this.dobject+"),iOBJ("+this.iobject+"))";
        return action;
    }
}