
public class Item {
    
    private int location;
    private String description;
    
    public Item(int location, String description)
    {
        this.location=location;
        this.description=description;
    }
    
    public int getLocation()
    {
        return location;
    }
    
    public void setLocation(int location)
    {
        this.location=location;
    }
    
    public String getDescription()
    {
        return description;
    }
    
    public void setDescription(String description)
    {
        this.description=description;
    }
    
    public class Monster extends Item
    {
    private int x;
    
    public Monster(int location, String description, int x)
    {
  
        super(location,description);
        this.x=x;
    }
    } 
}
