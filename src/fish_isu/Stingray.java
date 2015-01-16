package fish_isu;

public class Stingray extends AFish {
    //additional properties
    String family = "Rays";
    String type = "Stingray";
    boolean hasAirBladder = true;
    
    //constructor 1
    public Stingray(int id_) {
        id = id_;
    }
    //constructor 2
    public Stingray (String name_,
                     String origin_,
                     Double price_,
                     Integer weight_,
                     int id_)
    {
        super(name_, origin_, price_, weight_, id_);
    }
    //implement abstract
    public String toString() {
        return family+" "+type+" "+getFamily()+""+getName()+" "+getOrigin()+" "+getWeight()+" "+getPrice()+" "+hasAirBladder;
    }
    //unique
    public boolean hasAirBladder() {
        return hasAirBladder;
    }
    //sort by name
    public int compareTo(Object o) {
        return getName().compareTo(((AFish)o).getName());
    }
    //override parent
    @Override
    public String getFamily()
    {
        return family;
    }
    public void setFamily(String s)
    {
        family = s;
    }
    //
    public String getType()
    {
        return type;
    }
    public void setType(String s)
    {
        type = s;
    }
}
