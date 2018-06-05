public class Project {
    String name;
    String description;
    double initialCost;

    //Constuctors
    public Project(){
        System.out.println("No arguments on constructor");
    }
    public Project(String name){
        this.name = name;
    }
    public Project(String name, String description){
        this.name = name;
        this.description = description;
    }
    public Project(String name, String description, double initialCost){
        this.name = name;
        this.description = description;
        this.initialCost = initialCost;
    }

    //Setters
    public void setName(String name){
        this.name = name;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public void updateCost(double updateCost ){
        this.initialCost = updateCost;
    }

    //Getters
    public String elevatorPitch(){
        return this.name + " ("+this.initialCost+")"+ ": " + this.description;
    }

    public String getName(){
        return this.name;
    }
    public String getDescription(){
        return this.description;
    }

    public double getCost(){
        return this.initialCost;
    }

}