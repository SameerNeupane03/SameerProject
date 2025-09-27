/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentlist;

/**
 *
 * @author 97798
 */
public class PartTime {
    //to know if the student is part time or not.
    private int creditHour;
    
    public PartTime(){
        this.creditHour = 10;
    }
    
    public void checkStatus(){
    if(creditHour > 12){
        System.out.println("Full Time Student");
}else{
        System.out.println("Part Time Student");
}
    }
}
