import java.util.Scanner;
public class StudentGradeCalculator {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Student Grade Calculator");
        System.out.println("Enter no of Subjects: ");
        int sub=sc.nextInt();
        int total=0;
        for(int i=0; i<sub;i++){
            System.out.println("Enter marks obtained in "+(i+1)+ ": ");
            int marks=sc.nextInt();
            total+=marks;
        }
        double avg=(double)total/sub;
        char Grade;
        if(avg>=90){
            Grade='O';
        }
        else if(avg>=80){
            Grade='A';
        }
        else if(avg>=70){
            Grade='B';
        }
        else if(avg>=60){
            Grade='C';
        }
        else if(avg>=50){
            Grade='D';
        }
        else if(avg>=40){
            Grade='E';
        }
        else{
            Grade='F';
        }
        System.out.println("Total marks scored is:  "+total);
        System.out.println("The average % gained is:  "+avg+"%");
        System.out.println("Grade: "+Grade);
    }
}
