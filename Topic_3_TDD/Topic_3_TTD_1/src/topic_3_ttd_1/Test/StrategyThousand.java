package topic_3_ttd_1.Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Frederic
 */
public class StrategyThousand implements IConvertStrategy{
private String[] number =null;
    @Override
    public String convert(String a) {
       return number[Integer.parseInt(a.substring(0, 1))];
    }
   public StrategyThousand(){
        number= new String[11];
       number[0] = "thousand";
        number[1] = "one thousand" ;
        number[2] = "two thousand";
        number[3] = "three thousand";
        number[4] = "four thousand";
        number[5] = "five thousand";
        number[6] = "six thousand";
        number[7] = "seven thousand";
        number[8] = "eight thousand";
        number[9] = "nine thousand";
       
       
       
   }
    
    
    
    
    
}
