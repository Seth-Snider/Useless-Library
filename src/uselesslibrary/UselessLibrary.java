/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uselesslibrary;

/**
 *
 * @author snidso01
 */
public class UselessLibrary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      UselessLibrary UL = new UselessLibrary();
        
        System.out.println(UL.StringToCoord("Istanbul", "notConstantinople"));
    }
    
    public String StringToCoord(String s1, String s2){
        int s1Dec = 0;
        int s2Dec = 0;
        int longitude;
        int latitude;
        int remainder; 
        char curChar;
        
        for(int i = 0; i < s1.length(); i++){
            curChar = s1.charAt(i);
            s1Dec += (int) curChar;
        }
        
        for(int i = 0; i < s2.length(); i++){
            curChar = s2.charAt(i);
            s2Dec += (int) curChar;
        }
        
        remainder = s1Dec % 360;
        longitude = remainder - 160;
        
        remainder = s2Dec % 180;
        latitude = remainder - 90;
        
        return "Latitude: " + latitude + "\nLongitude: " + longitude +  "\nCoordinates: (" + latitude + ", " + longitude + ")";
    }
}
