import java.util.*;

//student class creation

class Student
  {
    //class variables
    String name;
    int id;
    double percentage;
    ArrayList<String> Skills = new ArrayList<String>();
  
     // single variable setters
    Student(String name)
    {
         this.name=name;
    }
    Student(int id)
    {
        this.id=id;
    }
    Student(double percentage)
    {
        this.percentage=percentage;
    }
    Student(ArrayList<String> skills)
    {
        this.Skills = skills;
    }

 

    //all variable setters
    Student(String name, int id, double percentage, ArrayList<String> skills)
    {
       this.name = name;
       this.id = id;
       this.percentage = percentage;
       this.Skills = skills;
    }

 

    //getters
    public int getName() 
    {
        return name;
    }
    public int getId() 
    {
        return id;
    }
    public int getPercentage() 
    {
        return percentage;
    }
    public ArrayList<String> getSkills() 
    { 
        return Skills;
    }

 

 

}
  //operations class with all required methods
  class operations extends student {
    
      public void changeName(String name){
        this.name = name;
    }
    //method to update name
      public void changeName(){
        System.out.prinltn("Enter the new name");
        String name = sc.next();
        this.name = name;
    }
    //method to add skills
      public void addSkill(){
        int sk = 6;
        while(sk>5){
            System.out.println("Enter the no of skills you want to add. It shoould be max 5");
            sk = sc.nextInt();
        }
        for(int i = 0;i<sk;i++){
            System.out.println("Enter the skill");
            String skill = sc.next();
            this.skills.add(skill);
        }
      }
    }
  

 

  //displayOperations class with all functions
  class displayOperations extends operations{
   public void showAttributes(){
        System.out.prinltn(this.id);
        System.out.prinltn(this.name);
        System.out.prinltn(this.percentage);
        System.out.prinltn(this.skills);
    }
   //display name in upper case
    public void showName(){
        System.out.prinltn(this.name.toUpperCase());
    }
   //display percentage difference
    public void showDifference(displayOperations d){
        System.out.prinltn(this.percentage-d.percentage);
    }
}

 
//Driver code
public class Driver{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
      //creating 5 objects
        Student S1 = new displayOperations("ABC", 1, 45.34, new ArrayList<String>());
        Student S2 = new displayOperations("DEF", 2, 90.34, new ArrayList<String>{{add("php"); add("mySQL")}});
        Student S3 = new displayOperations("GHI", 3, 63.34, new ArrayList<String>{{add("php"); add("mySQL")}});
        Student S4 = new displayOperations("JKL", 4, 12.34, new ArrayList<String>{{add("php"); add("mySQL")}});
        Student S5 = new displayOperations("MNO", 5, 80.34, new ArrayList<String>{{add("php"); add("mySQL")}});
      //calling methods
        S2.changeName("XYZ");
        S3.changeName();
        S1.addSkill();
        S2.showAttributes();
        S4.showName();
        S5.showDifference(S3);
      
    }
}
