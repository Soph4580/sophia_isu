
package fish_isu;

public class Shark extends AFish {
    
    //additional properties
    String family = "Sphyrnidae";
    String type = "Shark";
    boolean hasAirBladder = false;
    
    //constructor 1
    public Shark(int id_) {        
        super();
        id = id_;
    }
    //constructor 2
    public Shark (String name_,
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
    //unique characteristic
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
