import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    int sirka = getWidth() / 2;
    int vyska = getHeight() / 2;
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        Medved m = new Medved();
        addObject(m, sirka / 4, vyska / 2);
        Medved m2 = new Medved();
        addObject(m2, sirka * 3 / 4, vyska / 2);
    }
}
