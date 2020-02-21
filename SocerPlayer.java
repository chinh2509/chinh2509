/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SoccerPlayer;

/**
 *
 * @author Dell
 */
public class SocerPlayer {
    private final String name = " triệu cao hưng";
    private final int number = 23;
    private final String xlocation = "m10";
    private final String ylocation = "cr7";

    public SocerPlayer(){
        System.out.println("cầu thủ" + name + "số áo:" + number +"idol" + ylocation );
    }
    
    
    public void run(){  System.out.println("cầu thủ" + name);}
    public void jump(){  System.out.println("số áo:" + number);}
    public void kickBall(){  System.out.println("idol" + ylocation );}
}