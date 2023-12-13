package introPracticeCodes;

public class result {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1Name = "Sam";
//String s2Name = "Kim";
//String s3Name = "Tim";
int rno1 = 101;
//int rno2 = 102;
//int rno3 = 103;
float sm1 = 95; float sm2 = 65; float sm3 = 88;
float stotal;
stotal=sm1 + sm2 + sm3;
 float avg = stotal/3;
System.out.println("Result of " + s1Name + " " + rno1 +"  is =" +"total = " + stotal + "avarage = " + avg);
if(avg>= 35) {
	System.out.println("Student is Passed,Congratulations");
} else { System.out.println("Sorry you failed,better luck next time");
	}

	}}
