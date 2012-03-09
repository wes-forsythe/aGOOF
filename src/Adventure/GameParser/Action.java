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
    
    /**
     * Empty Constructor
     */
    public Action() {
        
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
        return "ACTION(SUB("+subject+"),ACT("+action+"),dOBJ("+dobject+"),iOBJ("+iobject+"))";
    }
}