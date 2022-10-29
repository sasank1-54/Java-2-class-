package JavaTask;

public class Labelled {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		jai: for(int i = 0;i<10;i++) {
			for(int j = 0;j <5;j++) {
				for(int k = 0; k<3;k++) {
					if(k==2) {
						continue jai; 
					}
					System.out.print("Balayya ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}

}
