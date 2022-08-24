import java.io.*; 
import java.util.*;
import java.util.Iterator; 
	public class Fol {
		public static void main(String args[]) { 
			String A;
			Scanner sc = new Scanner(System.in); 
			ArrayList<String> arr_uni =new ArrayList<String>(); 
			ArrayList<String> arr_ext = new ArrayList<String>(); 
			System.out.print("Enter the Sentence :");
			A = sc.nextLine();
			arr_ext.add("someone");
			arr_ext.add("something"); 
			arr_ext.add("each"); 
			arr_ext.add("some"); 
			arr_ext.add("any"); 
			arr_uni.add("all"); 
			arr_uni.add("everyone"); 
			arr_uni.add("anything"); 
			arr_uni.add("everything"); 
			arr_uni.add("anyone"); 
			String check_uni=""; 
			String check_ext="";
			String[] words = A.split(" ");
			int i = 0;
			for (String word :words) {
				for(i = 0; i<arr_uni.size(); i++) {
						if (arr_uni.get(i).equals(word.toLowerCase())) { 
							System.out.println("Universal Quantifier :"+word); 
							check_uni="Found";
						}


			}

			for(i = 0; i<arr_ext.size(); i++) {

				if (arr_ext.get(i).equals(word.toLowerCase())) { 
					System.out.println("Existential Quantifier :"+ word); 
					check_ext="Found"; 
					}
			}
		}
		if (check_uni != "Found" && check_ext !="Found") { 
			System.out.println("No Quantifier Found !!");
		}

		else if (check_uni == "Found" && check_ext =="Found") {
			System.out.println("Both Quantifier Found !!!");
		}


	}

}

