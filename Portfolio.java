import java.util.ArrayList;

public class Portfolio{
    ArrayList<Project> projectList = new ArrayList<Project>();

    public ArrayList<Project> getProjects(){
        return projectList;
    }

    public void addProject(Project newProject){
        System.out.println(newProject);
        projectList.add(newProject);
    }

    public double getPortfolioCost(){
        double portfolioCost = 0;
        for (Project project : projectList){
            portfolioCost += project.initialCost;
        }
        return portfolioCost;
    }

    public void showPortfolio(){
        for (Project project : projectList){
            System.out.println(project.elevatorPitch());
            System.out.println("Project cost: $" + project.initialCost);
        }
    }


}