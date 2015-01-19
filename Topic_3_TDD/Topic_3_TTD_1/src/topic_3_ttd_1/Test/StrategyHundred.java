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
public class StrategyHundred implements IConvertStrategy{
private String[] number = null;
    @Override
    public String convert(String a) {
return number[Integer.parseInt(a.substring(0, 1))];
    }
    public StrategyHundred(){
        number=new String[11];
        number[0] = "";
        number[1] = "one hundred";
        number[2] = "two hundred";
        number[3] = "three hundred";
        number[4] = "four hundred";
        number[5] = "five hundred";
        number[6] = "six hundred";
        number[7] = "seven hundred";
        number[8] = "eight hundred";
        number[9] = "nine hundred";
        
        
    }
            
}
