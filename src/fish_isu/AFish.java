package fish_isu;

public abstract class AFish implements Comparable {
    
    private String     name;    
    private String     origin;     
    private Double     price;
    private Integer    weight;
    protected int      id;    
    private static int count = 0;
    
    //constructor 1
    public AFish() {
        name = "A name";
        origin = "An origin";
        price = 0.0;
        weight = 0;
        incCount();
    }
    //constructor 2
    public AFish(String name_, String origin_, Double price_, Integer weight_, int id_) {
        name = name_;        
        origin = origin_; 
        price = price_;
        weight = weight_;
        id = id_;
        incCount();
    }
    //implement
    @Override
    public abstract String toString();
    
    //static
    public static synchronized int getCount() {
        return count;
    }    
    public static synchronized void incCount() {
        count++;
    }
    public static synchronized void decCount() {
        count--;
    }        
    //overridable
    public String getName() {
        return name;
    }
    public void setName(String s) {
        name = s;
    }
    //behave differently
    public String getFamily()
    {
        return "An abstract fish";
    }
    //finals
    public final int getId() {
        return id;
    }   
    public final void setId(int i) {
        id = i;
    }
    public final Double getPrice() {
        return price;
    }   
    public final void setPrice(Double d) {
        price = d;
    }
    public final String getOrigin() {
        return origin;
    }
    public final void setOrigin(String s) {
        origin = s;
    }
    public final Integer getWeight() {
        return weight;
    }   
    public final void setWeight(Integer i) {
        weight = i;
    }
}
