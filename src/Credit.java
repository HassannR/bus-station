/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HassanRagab
 */
public class Credit implements Payment  {
    @Override
    public float calculateTotal(){
    float total=0;
    //calculations 
    return total;
    }
    boolean checkCredit(float credit,float total){
        return credit >= total;
    }
}
