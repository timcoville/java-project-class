public class ProjectTest{
    public static void main(String[] args){
        Project project = new Project("Hava Awakening Website", "Website for Marcie Hava's business using JS/HTML/CSS", 1000.15);

        Project project2 = new Project("Hava Awakening Website", "Website for Marcie Hava's business using JS/HTML/CSS", 500.50);        System.out.println(project.elevatorPitch());

        Portfolio projectList = new Portfolio();
        projectList.addProject(project);
        
        projectList.addProject(project2);
        
        double portfolioCost = projectList.getPortfolioCost();
        System.out.println(portfolioCost);
        projectList.showPortfolio();
        


    }
}