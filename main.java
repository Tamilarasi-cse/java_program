import java.util.Scanner;
class Employee 
{
 String Emp_name,Emp_id,Address,Mail_id,Mobile_no;
 Employee()
 {
 Emp_name ="";
 Emp_id ="";
 Address ="";
 Mail_id ="";
 Mobile_no="";
 }
}
 class Programmer extends Employee
{
 double bp,hra,da,pf,scf,gross,net;
 Programmer()
 {
 super(); 
 }
void input( Scanner in ) 
 { 

 System.out.println("Enter Name:");
 super.Emp_name = in.nextLine();
 System.out.println("Enter ID:");
 super.Emp_id = in.nextLine();
 System.out.println("Enter address:");
 super.Address = in.nextLine();
 System.out.println("Enter mail:");
 super.Mail_id = in.nextLine();
 System.out.println("Enter Mobile No.:");
 super.Mobile_no = in.nextLine();
 System.out.println("Enter Base Salary:");
 bp=in.nextDouble();
 in.nextLine();
 da=(0.97)*bp;
 hra=0.1*bp;
 pf=0.12*bp;
 scf=0.001*bp;

 }
 
 void calculate()
 {
 gross=bp+hra+da+scf;
 net=gross-pf;
 }
 
 void printslip() 
 {
 System.out.println("Name:\t"+this.Emp_name);
 System.out.println("ID:\t"+this.Emp_id);
 System.out.println("Address:\t"+this.Address);
 System.out.println("Mail ID:\t"+this.Mail_id);
 System.out.println("Mobile No.:\t"+this.Mobile_no);
 System.out.println("-------------------------------------");
 System.out.println("Base Salary:\t"+this.bp);
 System.out.println("HRA:\t"+this.hra);
 System.out.println("DA:\t"+this.da);
 System.out.println("PF:\t"+this.pf);
 System.out.println("GROSS SALARY:\t"+this.gross);
 System.out.println("NET SALARY:\t"+this.net);
 }
}
 class Professor extends Employee
{
 double bp,hra,da,pf,scf,gross,net;
 Professor()
 {
 super();
 }
 void input( Scanner in ) 
 { 

 System.out.println("Enter Name:");
 super.Emp_name = in.nextLine();
 System.out.println("Enter ID:");
 super.Emp_id = in.nextLine();
 System.out.println("Enter address:");
 super.Address = in.nextLine();
 System.out.println("Enter mail:");
 super.Mail_id = in.nextLine();
 System.out.println("Enter Mobile No.:");
 super.Mobile_no = in.nextLine();
 System.out.println("Enter Base Salary:");
 bp=in.nextDouble();
 in.nextLine();
 da=(0.97)*bp;
 hra=0.1*bp;
 pf=0.12*bp;
 scf=0.001*bp;

 }


 void calculate()
 {
 gross=bp+hra+da+scf;
 net=gross-pf;
 }
 
 void printslip() 
 {
 System.out.println("Name:\t"+this.Emp_name);
 System.out.println("ID:\t"+this.Emp_id);
 System.out.println("Address:\t"+this.Address);
 System.out.println("Mail ID:\t"+this.Mail_id);
 System.out.println("Mobile No.:\t"+this.Mobile_no);
 System.out.println("-------------------------------------");
 System.out.println("Base Salary:\t"+this.bp);
 System.out.println("HRA:\t"+this.hra);
 System.out.println("DA:\t"+this.da);
 System.out.println("PF:\t"+this.pf);
 System.out.println("GROSS SALARY:\t"+this.gross);
 System.out.println("NET SALARY:\t"+this.net);
 }
}
 class AssistantProfessor extends Employee
{
 double bp,hra,da,pf,scf,gross,net;
 AssistantProfessor()
 {
 super(); 
 }
void input( Scanner in ) 
 { 

 System.out.println("Enter Name:");
 super.Emp_name = in.nextLine();
 System.out.println("Enter ID:");
 super.Emp_id = in.nextLine();
 System.out.println("Enter address:");
 super.Address = in.nextLine();
 System.out.println("Enter mail:");
 super.Mail_id = in.nextLine();
 System.out.println("Enter Mobile No.:");
 super.Mobile_no = in.nextLine();
 System.out.println("Enter Base Salary:");
 bp=in.nextDouble();
 in.nextLine();
 da=(0.97)*bp;
 hra=0.1*bp;
 pf=0.12*bp;
 scf=0.001*bp;

 }
 
 void calculate()
 {
 gross=bp+hra+da+scf;
 net=gross-pf;
 }
 
 void printslip()
 {
 System.out.println("Name:\t"+this.Emp_name);
 System.out.println("ID:\t"+this.Emp_id);
 System.out.println("Address:\t"+this.Address);
 System.out.println("Mail ID:\t"+this.Mail_id);
 System.out.println("Mobile No.:\t"+this.Mobile_no);
 System.out.println("-------------------------------------");
 System.out.println("Base Salary:\t"+this.bp);
 System.out.println("HRA:\t"+this.hra);
 System.out.println("DA:\t"+this.da);
 System.out.println("PF:\t"+this.pf);
 System.out.println("GROSS SALARY:\t"+this.gross);
 System.out.println("NET SALARY:\t"+this.net);
 }
}
 class AssociateProfessor extends Employee
 {
 double bp,hra,da,pf,scf,gross,net;
 AssociateProfessor()
 {
 super(); 
 }
 void input( Scanner in ) 
 { 

 System.out.println("Enter Name:");
 super.Emp_name = in.nextLine();
 System.out.println("Enter ID:");
 super.Emp_id = in.nextLine();
 System.out.println("Enter address:");
 super.Address = in.nextLine();
 System.out.println("Enter mail:");
 super.Mail_id = in.nextLine();
 System.out.println("Enter Mobile No.:");
 super.Mobile_no = in.nextLine();
 System.out.println("Enter Base Salary:");
 bp=in.nextDouble();
 da=(0.97)*bp;
 hra=0.1*bp;
 pf=0.12*bp;
 scf=0.001*bp;

 }
 void calculate()
 {
 gross=bp+hra+da+scf;
 net=gross-pf;
 }
 void printslip() 
 {
 System.out.println("Name:\t"+this.Emp_name);
 System.out.println("ID:\t"+this.Emp_id);
 System.out.println("Address:\t"+this.Address);
 System.out.println("Mail ID:\t"+this.Mail_id);
 System.out.println("Mobile No.:\t"+this.Mobile_no);
 System.out.println("-------------------------------------");
 System.out.println("Base Salary:\t"+this.bp);
 System.out.println("HRA:\t"+this.hra);
 System.out.println("DA:\t"+this.da);
 System.out.println("PF:\t"+this.pf);
 System.out.println("GROSS SALARY:\t"+this.gross);
 System.out.println("NET SALARY:\t"+this.net);
 }
}
 class main
{
public static void main(String args[])
 {
 Scanner in = new Scanner(System.in);
 Programmer pro = new Programmer();
 System.out.println("Programmer:");
 pro.input(in);
 pro.calculate();
 pro.printslip();
 Professor pro1 = new Professor();
 System.out.println("Professor:");
 pro1.input(in);
 pro1.calculate();
 pro1.printslip();
 System.out.println("Assistant Professor:");
 AssistantProfessor pro2 = new AssistantProfessor();
 pro2.input(in);
 pro2.calculate();
 pro2.printslip();
 AssociateProfessor pro3 = new AssociateProfessor();
 System.out.println("Associate Professor:");
 pro3.input(in);
 pro3.calculate();
 pro3.printslip();
 }
}