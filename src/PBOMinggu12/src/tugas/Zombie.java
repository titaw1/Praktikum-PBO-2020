/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;

/**
 *
 * @author tita
 */
public class Zombie implements Destroyable{
    protected int health;
    protected int level;
    
    public void heal(){
        
    }
    @Override
    public void destroyed() {
    }
    public String getZombieInfo(){
        String info = "";
        info += "Health = "+this.health+"\n";
        info += "Level = "+this.level+"\n";
        return info;
    }
}
