package charm;

import java.util.Scanner;

public class Main {
	Scanner in = new Scanner(System.in);
	charm charm = new charm();
	
	
	//1
	System.out.print("face : ");
	int face = in.nextInt();
	boolean bool = charm.isCondition(face);
	while (bool) {
		System.out.println("��͡��� 0 - 10 ");
		face = in.nextInt();
		bool = charm.isCondition(face);
	}
	
	//2
	int smile = in.nextInt();
	bool = charm.isCondition(smile);
	while (bool) {
		System.out.println("��͡��� 0 - 10 ");
		face = in.nextInt();
		bool = charm.isCondition(smile);
	}
}
}
