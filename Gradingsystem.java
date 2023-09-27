package gradingSystem;
import java.util.Scanner;
public class Gradingsystem {

	public static void main(String[] args) {
		//initialize the variables
		String name[],grade[];
		int roll[],mark1[],mark2[],mark3[],total[];
		int average[];
		String result[];
		//initialize arrays
		name = new String[4];
		roll = new int[4];
        mark1 = new int[4];
        mark2 = new int[4];
        mark3 = new int[4];
        total = new int[4];
        average =  new int [4];
        grade = new String[4];
        result = new String[4];
        for(int i=0;i<4;i++) {
        	System.out.print("Enter your name:");
        	Scanner slap = new Scanner(System.in);
        	name[i] = slap.nextLine();
        	System.out.print("Enter mark1:");
        	mark1[i] = slap.nextInt();
        	System.out.print("Enter mark2:");
        	mark2[i] = slap.nextInt();
        	System.out.print("Enter mark3:");
        	mark3[i] = slap.nextInt();
        	total[i] = mark1[i]+mark2[i]+mark3[i];
        	average[i] = total[i]/3;
        
        	if (average[i]>39) {
        		result[i]="P";
        	}else {
        		result[i]="F";
        	}
		
	        if (average[i] > 79) {
	            grade[i] = "A";
	        } else if (average[i] > 74) {
	            grade[i] = "B+";
	        } else if (average[i] > 64) {
	            grade[i] = "B";
	        } else if (average[i]> 54) {
	            grade[i] = "C+";
	        } else if (average[i]> 49){
	            grade[i] = "C";
	        } else if (average[i]> 39) {
	        	grade[i] = "D";
	        }else if(average[i]<40) {
	        	grade[i] = "F";
	        }
        }
	        //print the page layout
	        System.out.println("**************************************************************************************");
	        System.out.println("\t\t\t\t STUDENT MARKLIST \t\t\t\t");
	        System.out.println("**************************************************************************************");
	        System.out.println("ROLL\t\tNAME\t\tMARK1\t\tMARK2\t\tMARK3\t\tTOTAL\t\tRESULT\t\tAverage\t\tGRADE");
	        
	        System.out.println("101\t\t"+name[0]+"\t\t"+mark1[0]+"\t\t"+mark2[0]+"\t\t"+mark3[0]+"\t\t"+total[0]+"\t\t"+result[0]+"\t\t"+average[0]+"\t\t"+grade[0]);
	        System.out.println("101\t\t"+name[1]+"\t\t"+mark1[1]+"\t\t"+mark2[1]+"\t\t"+mark3[1]+"\t\t"+total[1]+"\t\t"+result[1]+"\t\t"+average[1]+"\t\t"+grade[1]);
	        System.out.println("101\t\t"+name[2]+"\t\t"+mark1[2]+"\t\t"+mark2[2]+"\t\t"+mark3[2]+"\t\t"+total[2]+"\t\t"+result[2]+"\t\t"+average[2]+"\t\t"+grade[2]);
	        System.out.println("101\t\t"+name[3]+"\t\t"+mark1[3]+"\t\t"+mark2[3]+"\t\t"+mark3[3]+"\t\t"+total[3]+"\t\t"+result[3]+"\t\t"+average[3]+"\t\t"+grade[3]);
	        
	}
	}

