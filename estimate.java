
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class estimate {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	String line;
	String conc="";
while(!(line=sc.nextLine()).equals("0")) {
	
	String[] getLine=line.split(" ");
	List<Long> convertedLine=new ArrayList<>();
	
	for (int i = 0; i < getLine.length; i++) {
		convertedLine.add(Long.valueOf(getLine[i]));
	}
	int cont=0;
	for (int x = 0; x < convertedLine.size(); x++) {
		
	
	
	List<Long> nums=divisores(convertedLine.get(x));
	Collections.sort(nums);
	

	for (int i = 1; i < nums.size(); i++) {
		long mult=nums.get(i-1)*nums.get(i);
		
	

long suma=nums.get(i-1)*(-convertedLine.get(x)/(nums.get(i-1)*nums.get(i)))+(-nums.get(i)*(-convertedLine.get(x)/(nums.get(i-1)*nums.get(i)))+(nums.get(i-1)*(-nums.get(i))));

		if(suma==1) {
			cont++;
			break;
		}
	}
	}
int estimate=cont*100/convertedLine.size();
conc+=estimate+"\n";
	

}
System.out.println(conc);
sc.close();
	}
	public static List<Long> divisores(long num){
		List<Long> divisores = new ArrayList<>();
		divisores.add(1L);
		for (long i = 2; i <= (long)Math.sqrt(num); i++) {
			if(num%i==0) {
				divisores.add(i);
				if(i!=num/i) {
				divisores.add(num/i);
				}
			}
		}
		return divisores;
	}

}
