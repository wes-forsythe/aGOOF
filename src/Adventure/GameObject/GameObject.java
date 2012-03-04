/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Adventure.GameObject;

import Adventure.GameParser.*;
/**
 *
 * @author jeffj
 */
public abstract class GameObject implements Label {
  
    private String name;
    private String description;
    private Noun word;
    
    public GameObject(String label) {
        this.name = label;
    }
    
    public GameObject() {
        this("nameless");
    }
    
    public void Register() {
        
    }
    
    public String name() {
        return this.name;
    }
    
    public String description() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "GameObject("+this.getClass().getSimpleName()+","+this.name+")";
    }    
}