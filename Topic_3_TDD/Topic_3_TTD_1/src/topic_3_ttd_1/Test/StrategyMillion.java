/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topic_3_ttd_1.Test;

/**
 *
 * @author Frederic
 */
public class StrategyMillion implements IConvertStrategy {
 private String[] number = new String[11];
    @Override
    public String convert(String a) {
       return number[Integer.parseInt(a.substring(0, 1))];
    }
    
    public StrategyMillion(){
         number[0] = "million";
        number[1] = "one million";
        number[2] = "two million";
        number[3] = "three million";
        number[4] = "four million";
        number[5] = "five million";
        number[6] = "six million";
        number[7] = "seven million";
        number[8] = "eight million";
        number[9] = "nine million";
        
        
        
        
    }
    
    
    
}
