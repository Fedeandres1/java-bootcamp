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
public class StrategyTwoDigit implements IConvertStrategy {

    private String[] number = null;
    private String[] numberMore = null;

    @Override
    public String convert(String a) {
        String res = "";
        int num=Integer.parseInt(a);
       if (num<20) {
            
            res = number[Integer.parseInt(a)];
        }else{ 
           
          int primero,segundo; //First and Second digit
           primero= Integer.parseInt(a.substring(0, 1));
           
           segundo= Integer.parseInt(a.substring(1,2));
           res = numberMore[primero] +" "+number[segundo]   ;
         
           
            
           
           
       }

        return res;
    }

    public StrategyTwoDigit() {
        number = new String[21];
        numberMore = new String[11];
       // number[0] = "cero";
        number[1] = "one";
        number[2] = "two";
        number[3] = "three";
        number[4] = "four";
        number[5] = "five";
        number[6] = "six";
        number[7] = "seven";
        number[8] = "eight";
        number[9] = "nine";
        number[10] = "ten";
        number[11] = "eleven";
        number[12] = "twelve";
        number[13] = "thirteen";
        number[14] = "fourteen";
        number[15] = "fifteen";
        number[16] = "sixteen";
        number[17] = "seventeen";
        number[18] = "eightteen";
        number[19] = "nineteen";
        numberMore[2] = "twenty";
        numberMore[3] = "threety";
        numberMore[4] = "fourty";
        numberMore[5] = "fifty";
        numberMore[6] = "sixty";
        numberMore[7] = "seventy";
        numberMore[8] = "eighty";
        numberMore[9] = "ninety";
    }

}
