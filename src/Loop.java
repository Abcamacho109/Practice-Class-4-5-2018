

public class Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array = {5,7,2,4,6};

 int evennumbers = 0;

	int oddnumbers = 0;
	
	for(int i = 0; i<5; i ++){
		if( array [i]%2==1){
			oddnumbers = oddnumbers + 1;
		}else{
			evennumbers = evennumbers + 1;
		}
	}
	
System.out.println(evennumbers);
System.out.println(oddnumbers);
		



}
}
	
