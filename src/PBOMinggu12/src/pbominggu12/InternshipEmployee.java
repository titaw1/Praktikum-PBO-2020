/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbominggu12;

/**
 *
 * @author tita
 */
public class InternshipEmployee extends Employee{
    private int length;
    
    public InternshipEmployee(String name, int length){
        this.length=length;
        this.name=name;
    }
    public int getLength(){
        return length;
    }
    public void setLength(int length){
        this.length=length;
    }
    @Override
    public String getEmployeeInfo(){
        String info = super.getEmployeeInfo()+"\n";
        info += "Registererd as internship employee for "+length+" month/s\n";
        return info;
    }
}
