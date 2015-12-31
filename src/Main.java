

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		SubmitStageFightRequest fightRequest = new SubmitStageFightRequest();
		fightRequest.stageId =1;
		fightRequest.steps = new ArrayList<>();
		fightRequest.steps.add(new Step());
		
		
		byte[] bytes = fightRequest.getBytes();
		System.out.println(Arrays.toString(fightRequest.getBytes()));
		
		
		SubmitStageFightRequest fightRequest2 = new SubmitStageFightRequest();
		fightRequest2.readFromBytes(bytes);
		
		System.out.println(fightRequest2);
	}

}
