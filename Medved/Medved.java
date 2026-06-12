import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Medved extends Actor
{
    private int pocitadlo;
    private int tempoPostupu;
    public Medved()
    {
        pocitadlo = 0;
        tempoPostupu = Greenfoot.getRandomNumber(4) + 3;
    }
    public void act()
    {
        pocitadlo++;
        move(tempoPostupu);
        if (pocitadlo > 50)
        {
            turn(90);
            pocitadlo = 0;
        }
        if (isAtEdge())
        {
            tempoPostupu = tempoPostupu + Greenfoot.getRandomNumber(7) - 3;
            move(-50);
        }
    }
}
