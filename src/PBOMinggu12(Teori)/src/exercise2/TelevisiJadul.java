/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise2;

/**
 *
 * @author tita
 */
public class TelevisiJadul extends Elektronik{
    private String modelInput;
    
    public TelevisiJadul(){
        this.modelInput = "DVI";
    }
    public String getModelInput(){
        return modelInput;
    }
}
