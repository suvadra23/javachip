import java.util.*;
public class ClassicalPlanning {
	public void load(int no, String start) {
		System.out.println("LOAD(C" + no + ", P"+no +", " + start+")");
	}
	public void unload(int no, String end) {
		System.out.println("UNLOAD(C" + no + ", P"+no +", " + end+")");
	}


	public void fly(int no, String start, String end) { 
		System.out.println("FLY(P" + no + ", "+ start +", " + end+")");
	}
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in); 
		ClassicalPlanning c = new ClassicalPlanning();
		System.out.println("Implementing Air Cargo Transport using Classical Transport"); 
			System.out.println("Enter the number of cargoes to Load?");
			int size = sc.nextInt();
			for(int i=0; i<size; i++)
			{


				System.out.println("Enter Initial Location: "); 
				String start = sc.next().toUpperCase(); 
				System.out.println("Enter Destination: "); 
				String end = sc.next().toUpperCase(); 
				c.load(i+1, start);
				c.fly(i+1, start, end); 
				c.unload(i+1, end); 
				System.out.println();
			}


	}


}



