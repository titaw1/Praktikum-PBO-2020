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
public class WalkingZombie extends Zombie{
    public WalkingZombie(int health, int level){
        this.health=health;
        this.level=level;
    }
    public void heal(){
        if(this.level==1){
            this.health += (0.1*this.health);
        } else if(this.level==2){
            this.health += (0.3*this.health);
        } else if(this.level==3){
            this.health += (0.4*this.health);
        }
    }
    public void destroyed(){
        this.health -= (20*this.health/100);
    }
    public String getZombieInfo(){
        String info = super.getZombieInfo();
        return "Walking Zombie Data = \n"+info;
    }
}
