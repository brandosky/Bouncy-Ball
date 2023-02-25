import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;
/**
 * Write a description of class bear here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bear extends Actor
{
    private int offSetX=2;
    private int offSetY=2;
    private static int nextOffSet=15;
    
    public bear(){
        offSetX=nextOffSet;
         offSetY=nextOffSet;
         if(nextOffSet>5){
             nextOffSet-=3;
            }
         nextOffSet+=4;
    }
    /**
     * Act - do whatever the bear wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        int x=getX();
        int y=getY();
        
        setLocation(x+offSetX,y+offSetY);
        if(getY()>=390||getY()<=0){
            offSetY*=-1;
        }
        if(getX()>=575||getX()<=0){
            offSetX*=-1;
        }
        
    }
}
