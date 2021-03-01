class Main {
  public static void main(String[] args) {
    Student student1 = new Student();
    
    student1.setName("Arnold Spielberg");    student1.setGPA(4.0);
    student1.setMajor("Electrical Engineering");
    
// or can do this with the dot operator    //student1.name = "Arnold Spielberg";    //student1.gpa = 4.0;    //student1.major = "Electrical Engineering";    
    
    System.out.println("student1's name is " +        student1.getName() + " and their GPA is " + student1.getGPA() + " and their major is " + student1.getMajor());
    
    Student student2 = new Student();
    
    student2.setName("Chris Fenter");
    student2.setGPA(3.9);
    student2.setMajor("Information Systems");
    
    System.out.println("student2's name is " + student2.getName() + " and their GPA is " +
    student2.getGPA() + " and their major is " + student2.getMajor());}
}
    
// or can do this with the dot operator    //System.out.println("student1's name is " + student1.name + " and their GPA is" + student1.gpa + " and their major is " + student1.major);  }}