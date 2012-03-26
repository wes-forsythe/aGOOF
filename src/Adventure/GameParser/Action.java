/**
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
    
    /**
     * Empty Constructor
     */
    public Action() {
        subject = action = dobject = iobject = "";
        errorMsg = null;
    }
    
    public void setError(String error) {
        this.errorMsg = error;
    }
    
    /**
     * A typical "get" method
     * @return subject
     */
    public String Subject() {
        return subject;
    }
    
    /**
     * A typical "set" method
     * @param subject subject of the Action
     */
    public void setSubject(String subject) {
        this.subject = subject;
    }
    
    /**
     * A typical "get" method
     * @return action performed
     */
    public String Action() {
        return action;
    }
    
    /**
     * A typical "set" method
     * @param action The action to be performed
     */
    public void setAction(String action) {
        this.action = action;
    }
    
    /**
     * A typical "get" method
     * @return dobject The direct object of the action
     */
    public String DObject() {
        return dobject;
    }
    
    /**
     * A typical "set" method
     * @param dobject The direct object of the action
     */
    public void setDObject(String dobject) {
        this.dobject = dobject;
    }
    
    /**
     * A typical "get" method
     * @return iobject The indirect object of the action
     */
    public String IObject() {
        return iobject;
    }
    
    /**
     * A typical "set" method
     * @param iobject The indirect object of the action
     */
    public void setIObject(String iobject) {
        this.iobject = iobject;
    }
    
    /**
     * Override of the toString() method.
     * @return String appended string that contains the subject, action, direct
     * object, and indirect object
     */
    @Override
    public String toString() {
        String action = errorMsg;
        if (this.errorMsg == null)
            action = "ACTION(SUB("+this.subject+"),ACT("+this.action+
                    "),dOBJ("+this.dobject+"),iOBJ("+this.iobject+"))";
        return action;
    }
}
