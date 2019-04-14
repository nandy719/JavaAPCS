/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package macdonaldlab;

/**
 *
 * @author nandy
 */
public class NamedCow extends Cow {
    private String name;
    public NamedCow(String aName){
        super();
        name = aName;
    }
    public String getName(){
        return name;
    }
    @Override
    public String getType(){
        return super.getType() + " named " + name;
    }
    
}
