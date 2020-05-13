import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

public class Oracle extends Feature implements java.io.Serializable{ //extends feature later
	static ArrayList<Tip> tips;
	private int visits = 0;
	private int level;

	public Oracle(String string, int level) {
		name = string;
		this.level = level;
		color = Color.MAGENTA;
		tutorialText = "Oracles can provide guidance.";
	}

	public Oracle() {
		//just for non-static single commands
		tutorialText = "Oracles can provide guidance.";
		color = Color.MAGENTA;
	}

	public static void tip(String mask) {//public so it can be accessed in other stuff
		ArrayList<Tip> masklist = (ArrayList<Tip>) tips.clone();
		if (!mask.equals("")) {
		for (int i = masklist.size()-1;i> 0;i-- ) {
			Tip t = masklist.get(i);
			if (!t.mask.equals(mask)) {
				masklist.remove(i);
			}
		}
		}
		
		extra.println("\""+ masklist.get(extra.randRange(1,masklist.size()-1)).tip + "\"");
	}
	
	public static String tipString(String mask) {//public so it can be accessed in other stuff
		ArrayList<Tip> masklist = (ArrayList<Tip>) tips.clone();
		if (!mask.equals("")) {
		for (int i = masklist.size()-1;i> 0;i-- ) {
			Tip t = masklist.get(i);
			if (!t.mask.equals(mask)) {
				masklist.remove(i);
			}
		}
		}
		
		return masklist.get(extra.randRange(1,masklist.size()-1)).tip;
	}
	
	public void load() {
		tips = new ArrayList<Tip>();
		
		
		//System.out.println(new File(".").getAbsolutePath());
		Scanner fileInput = new Scanner (getClass().getResourceAsStream("/resource/oldTips.txt"));
		
		while (fileInput.hasNextLine()) {
			tips.add(new Tip(fileInput.nextLine(),"old"));
		}
		fileInput.close();
		fileInput = new Scanner (getClass().getResourceAsStream("/resource/utterTips.txt"));
		
		while (fileInput.hasNextLine()) {
			tips.add(new Tip(fileInput.nextLine(),"utter"));
		}
		
		fileInput.close();
		//
		fileInput = new Scanner (getClass().getResourceAsStream("/resource/cultTips.txt"));
		
		while (fileInput.hasNextLine()) {
			tips.add(new Tip(fileInput.nextLine(),"cult"));
		}
		
		fileInput.close();
		
		fileInput = new Scanner (getClass().getResourceAsStream("/resource/racistPraiseTips.txt"));
		
		while (fileInput.hasNextLine()) {
			tips.add(new Tip(fileInput.nextLine(),"racistPraise"));
		}
		
		fileInput.close();
		
		fileInput = new Scanner (getClass().getResourceAsStream("/resource/racistShunTips.txt"));
		
		while (fileInput.hasNextLine()) {
			tips.add(new Tip(fileInput.nextLine(),"racistShun"));
		}
		
		fileInput.close();
		
		fileInput = new Scanner (getClass().getResourceAsStream("/resource/equalityTips.txt"));
		
		while (fileInput.hasNextLine()) {
			tips.add(new Tip(fileInput.nextLine(),"equality"));
		}
		
		fileInput.close();
		
fileInput = new Scanner (getClass().getResourceAsStream("/resource/shamanTips.txt"));
		
		while (fileInput.hasNextLine()) {
			tips.add(new Tip(fileInput.nextLine(),"shaman"));
		}
		
		fileInput.close();
		
		
	}
	
	public void utterance() {
		if (Player.bag.getGold() >= level*1) {
		extra.println("Pay "+ level*1 +" gold for an utterance?");
		if (extra.yesNo()) {
			Player.bag.addGold(-level*10);
			tip("");
			visits++;
			if (visits == 5) {
				Player.player.addTitle(this.getName() + " vistor");
			}
			if (visits == 10) {
				Player.player.addTitle(this.getName() + " listener");
			}
			if (visits == 50) {
				Player.player.addTitle(this.getName() + " consulter");
			}
		}
		}else {
			extra.println("You can't afford that!");
		}
	}
	
	public void utterance2() {
		if (Player.bag.getGold() >= level*100) {
		extra.println("Pay "+ level*100 +" gold for an premium utterance?");
		if (extra.yesNo()) {
			Player.bag.addGold(-level*100);
			tip("utter");
			visits++;
			if (visits == 5) {
				Player.player.addTitle(this.getName() + " vistor");
			}
			if (visits == 10) {
				Player.player.addTitle(this.getName() + " listener");
			}
			if (visits == 50) {
				Player.player.addTitle(this.getName() + " consulter");
			}
		}
		}else {
			extra.println("You can't afford that!");
		}
	}

	@Override
	public void go() {
		Networking.setArea("shop");
		//TODO types of oracles
		//differnt oracles are for different quests
		Networking.sendStrong("Discord|imagesmall|oracle|Oracle|");
		goDelphi();
		
	}

	@Override
	public void passTime(double time) {
		// TODO Auto-generated method stub
		
	}
	
	//TODO: Main quest guidance, swallow touched
	
	private void goDelphi() {
		while (true) {
		extra.println("1 buy an utterance ("+level*1+" gold)");
		extra.println("2 buy a premium utterance ("+level*100+" gold)");
		extra.println("3 sit around and wait for them to talk to you");
		extra.println("4 leave");
		switch (extra.inInt(4)) {
		case 1: utterance();break;
		case 2: utterance2();break;
		case 3:swaQuest(); Player.addTime(.5);;//main quest stuff
			;break;
		case 4: return;
		}
		}
	}
	
	private void swaQuest() {
		switch(Player.player.animalQuest) {
		case -1: extra.println("The oracles ignore you.");break;
		case 0: extra.println("\"Seek the "+Player.player.animalName() +" in the forest. Look for trees felled in it's wake.\"");break;
		case 1: extra.println("\"You are touched now. Go to the altar, in the north. Revan is what you must seek.\"");break;
		case 2: extra.println("\"Fight- and win...\"");break;
		case 3: extra.println("\"Seek an empty inn... start a barfight.\"");break;
		case 4: extra.println("\"Epino arena... in Tevar...\"");break;
		case 5: extra.println("\"Return to the altar.\"");break;
		}
	}
}
