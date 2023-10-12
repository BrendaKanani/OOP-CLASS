
import java.util.Scanner;

public class MultiArray {


        public static void main(String[] args) {
            // TODO Auto-generated method stub
            int studentMarks[][]=new int[4][3];
            int roll[]=new int[4];
            String names[]=new String[4];
            String marksResults[]=new String[4];
            String grade[]=new String[4];
            int total[]=new int[4];
            float average[]=new float[4];

            int x,y;
            for(x=0;x<4;x++) {

                System.out.println("Enter the Student Roll Number :");
                Scanner scanner = new Scanner(System.in);
                roll[x]=scanner.nextInt();

                System.out.println("Enter the Student Name :");
                Scanner scaner = new Scanner(System.in);
                names[x]=scanner.next();

                System.out.println("Enter the Three Marks :");
                for(y=0;y<3;y++) {
                    Scanner scan = new Scanner(System.in);
                    studentMarks[x][y]=scanner.nextInt();


                    total[x]=studentMarks[x][0]+studentMarks[x][1]+studentMarks[x][2];
                    System.out.println("The Total is :"+total[x]);
                    average[x]=total[x]/3;
                }


                if(average[x]>50) {
                    marksResults[x]="P";
                } else {
                    marksResults[x]="F";
                }
                if(average[x]>69) {
                    grade[x]="A";
                }else if(average[x]>49) {
                    grade[x]="B";
                }else if(average[x]<50) {
                    grade[x]="C";
                }

            }

            System.out.println("*****************************************************************************************************************************************************");
            System.out.println("                                                  STUDENT MARKLIST                                                            ");
            System.out.println("*****************************************************************************************************************************************************");
            System.out.println("ROLL\t\tNAME\t\tMARK1\t\tMARK2\t\tMARK3\t\tTOTAL\t\tRESULT\t\tAverage\t\tGRADE\t\t");
            System.out.println(""+roll[0]+"\t\t"+names[0]+"\t\t  "+studentMarks[0][0]+"\t\t"+studentMarks[0][1]+"\t\t"+studentMarks[0][2]+"\t\t"+total[0]+"\t\t"+marksResults[0]+"\t\t"+average[0]+"\t\t"+grade[0]);
            System.out.println(""+roll[1]+"\t\t"+names[1]+"\t\t  "+studentMarks[1][0]+"\t\t"+studentMarks[1][1]+"\t\t"+studentMarks[1][2]+"\t\t"+total[1]+"\t\t"+marksResults[1]+"\t\t"+average[1]+"\t\t"+grade[1]);
            System.out.println(""+roll[2]+"\t\t"+names[2]+"\t\t  "+studentMarks[2][0]+"\t\t"+studentMarks[2][1]+"\t\t"+studentMarks[2][2]+"\t\t"+total[2]+"\t\t"+marksResults[2]+"\t\t"+average[2]+"\t\t"+grade[2]);
            System.out.println(""+roll[3]+"\t\t"+names[3]+"\t\t  "+studentMarks[3][0]+"\t\t"+studentMarks[3][1]+"\t\t"+studentMarks[3][2]+"\t\t"+total[3]+"\t\t"+marksResults[3]+"\t\t"+average[3]+"\t\t"+grade[3]);
        }
    }

