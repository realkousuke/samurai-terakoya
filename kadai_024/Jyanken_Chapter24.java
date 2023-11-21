package kadai_024;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter24 {
	public String getMyChoice() {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("自分のじゃんけんの手を入力しましょう");
			System.out.println("グーはrockのrを入力しましょう");
			System.out.println("チョキはscissorsのsを入力しましょう");
			System.out.println("パーはpaperのpを入力しましょう");
			
			String input = scanner.next();
			
		if(!(input.equals("r") || input.equals("s") || input.equals("s")) ) {
			System.out.println(input + "はじゃんけんの手ではありません");
		} else {
			scanner.close();
			return input;
		}
		}
		
	}
	
	public String getRandom() {
		String[] rpsArray = {"r", "p", "s"};
		
		String Rondom = rpsArray[(int) Math.floor(Math.random() * 3)];
		return Rondom;
	}
	
	public void playGame(String myChoice, String random) {

	    HashMap<String, String> output = new HashMap<String, String>();
	    output.put("r", "グー");
	    output.put("s", "チョキ");
	    output.put("p", "パー");

	    System.out.println("自分の手は" + output.get(myChoice) + "対戦相手の手は" + output.get(random));

	    
		
	    if (myChoice.equals("r") && random.equals("r")) {
			System.out.println("のあいこです");
		}
		if (myChoice.equals("r") && random.equals("s")) {
			System.out.println("自分の勝ちです");
		}
		if (myChoice.equals("r") && random.equals("p")) {
			System.out.println("自分の負けです");
		}
		if (myChoice.equals("s") && random.equals("r")) {
			System.out.println("自分の負けです");
		}
		if (myChoice.equals("s") && random.equals("s")) {
			System.out.println("あいこです");
		}
		if (myChoice.equals("s") && random.equals("p")) {
			System.out.println("自分の勝ちです");
		}
		if (myChoice.equals("p") && random.equals("r")) {
			System.out.println("自分の勝ちです");
		}
		if (myChoice.equals("p") && random.equals("s")) {
			System.out.println("自分の負けです");
		}
		if (myChoice.equals("r") && random.equals("p")) {
			System.out.println("あいこです");
		}
	}
}