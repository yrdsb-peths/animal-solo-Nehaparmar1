import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * title screen
 * 
 * @author Neha 
 * @version May 2026
 */
public class TitleScreen extends World
{
    Label titleLabel = new Label("The Elephant", 60);
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        super(600, 400, 1); 

        addObject(titleLabel, getWidth()/2, 60);
        prepare();
    }

    public void act()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Elephant elephant = new Elephant();
        addObject(elephant,497,82);
        elephant.setLocation(421,88);
        elephant.setLocation(466,108);
        elephant.setLocation(475,87);
        Label label = new Label("Use <-- and --> to move", 40);
        addObject(label,267,268);
        label.setLocation(294,253);
        elephant.setLocation(449,90);
        elephant.setLocation(316,192);
        elephant.setLocation(328,145);
        elephant.setLocation(328,173);
        label.setLocation(346,241);
        label.setLocation(298,245);
        label.setLocation(318,247);
        Label label2 = new Label("Press <Space> to start", 40);
        addObject(label2,302,295);
        label2.setLocation(342,293);
        label2.setLocation(315,294);
        label.setLocation(328,251);
        label.setLocation(328,251);
        label.setLocation(302,250);
        label2.setLocation(288,294);
        label2.setLocation(315,298);
        label2.setLocation(303,291);
    }
}
