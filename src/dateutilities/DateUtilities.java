/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dateutilities;

import java.time.*;

/**
 *
 * @author Ryan Schissel
 * @version 1.0
 * 
 * <h2>getAbbreviatedDayOfWeek(DayOfWeek day, int startIndex, int endIndex)</h2>
*<h3>
*<ul>
*<li>Returns abbreviated day of week as a string.</li>
*</ul> 
*</h3>     
* <h4>Arguments:</h4>
* <ol type = "1">
*<p>
* <li>day should be one of the following:</li>
*	</p>
*<p>
 *  <ul style = "list-style-type:square">
  *         <li>DayOfWeek.MONDAY</li>
   *        <li>DayOfWeek.TUESDAY</li>
    *       <li>DayOfWeek.WEDNESDAY</li>
     *      <li>DayOfWeek.THURSDAY</li>
      *     <li>DayOfWeek.FRIDAY</li>
       *    <li>DayOfWeek.SATURDAY</li>
        *   <li>DayOfWeek.SUNDAY</li>
   *</ul>
*</p>
*  <p>
 *      <li>startIndex is the index at which you want the first letter
  *         of the abbreviation is located.</li>
*</p>
*<p>
 *      <li>endIndex is the index at which the last letter of the 
  *         abbreviation is located</li>
*  </p>
 * </ol>
 * 
 *
 *      
 */
public class DateUtilities {
    
    public String getAbbreviatedDayOfWeek(DayOfWeek weekDay, int startIndex, int endIndex){
        String day = "";
        switch (weekDay){
            case MONDAY:
                day = "Monday";
                break;
            case TUESDAY:
                day = "Tuesday";
                break;
            case WEDNESDAY: 
                day = "Wednesday";
                break;
            case THURSDAY:
                day = "Thursday";
                break;
            case FRIDAY:
                day = "Friday";
                break;
            case SATURDAY:
                day = "Saturday";
                break;
            case SUNDAY:
                day = "Sunday";
        }
        return day.substring(startIndex, endIndex);
    }
    
}
