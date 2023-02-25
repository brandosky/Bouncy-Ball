import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;
/**
 * Write a description of class ball here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ball extends Actor
{
    private int offSetX=5;
    private int offSetY=5;
    private static int nextOffSet=5;
    
    public ball(){
        offSetX=nextOffSet;
         offSetY=nextOffSet;
         nextOffSet+=3;
    }
    /**
     * Act - do whatever the ball wants to do. This method is called whenever
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
        bear bear=(bear)getOneIntersectingObject(bear.class);
        if(bear!=null){
            World world=getWorld();
            
            world.addObject(new bomb(),x,y);
        }
    }
}

