/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dateutilities;

import java.time.DayOfWeek;

/**
 *
 * @author Ryan Schissel
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DateUtilities du = new DateUtilities();
        DayOfWeek dow = DayOfWeek.FRIDAY;
        System.out.println(du.getAbbreviatedDayOfWeek(dow,0,3));
        
    }
    
}
