package trawel;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

public class Altar extends Feature{

	
	public Altar() {
		name = "sky altar";
		tutorialText = "OwO what's this?";
		color = Color.MAGENTA;
	}
	@Override
	public void go() {
		Networking.sendStrong("Discord|imagesmall|altar|Altar|");
		Networking.setArea("mountain");
		mainGame.story.altar();
		MenuGenerator mGen = new MenuGenerator() {

			@Override
			public List<MenuItem> gen() {
				List<MenuItem> mList = new ArrayList<MenuItem>();
				mList.add(new MenuSelect() {

					@Override
					public String title() {
						return "examine the altar";
					}

					@Override
					public boolean go() {
						examine();
						return false;
					}
				});
				for (QuestR qr: qrList) {
					mList.add(new QRMenuItem(qr));
				}
				mList.add(new MenuSelect() {

					@Override
					public String title() {
						return "stand on the altar";
					}

					@Override
					public boolean go() {
						swaQuest();
						return false;
					}
				});
				mList.add(new MenuSelect() {

					@Override
					public String title() {
						return "sacrifice something";
					}

					@Override
					public boolean go() {
						sacrifice();
						return false;
					}
				});
				mList.add(new MenuSelect() {

					@Override
					public String title() {
						return "exit";
					}

					@Override
					public boolean go() {
						return true;
					}
				});
				return mList;
			}};
		/*while (true) {
		extra.println("1 ");
		extra.println("2 ");
		//extra.println("3 reincarnate (Restart character with skillpoints)");
		extra.println("3 leave");
		switch (extra.inInt(3)) {
		case 1: examine();break;
		case 2:swaQuest() //main quest stuff
			;break;
		//case 3: transmute();break;
		//case 3: 
			//Networking.sendColor(Color.RED);
			//extra.println("Really reincarnate? You will lose your items and gold.");if (extra.yesNo()) {Player.player.reincarnate();}break;
		case 3: return;
		}
		}*/
			extra.menuGo(mGen);
	}
	

	private void swaQuest() {
		if (Player.player.animalQuest == 1) {
			extra.println("The altar flashes. You feel bloodthirsty.");
			Player.player.animalQuest =2;
		}
		if (Player.player.animalQuest == 2 && Player.player.wins > 10) {
			extra.println("The altar flashes. The bloodlust fades. You crave a beer... and another fight.");
			Player.player.animalQuest =3;
		}
		if (Player.player.animalQuest == 5) {
			extra.println("The altar flashes.");
		}
		
	}


	@Override
	public void passTime(double time) {
		// TODO Auto-generated method stub
		
	}
	
	private void examine() {
		extra.println("You examine the altar. It's of a "+Player.player.animalName()+".");
	}
	
	private void sacrifice() {
		DrawBane inter = Player.bag.discardDrawBanes(true);
		if (inter != null && !inter.equals(DrawBane.NOTHING)) {
			switch (inter) {
			case BEATING_HEART:
				Player.player.forceRelation += 5;
				break;
			case BLOOD: case MEAT:
				Player.player.forceRelation += 0.1;
				break;
			case CEON_STONE:
				Player.player.forceRelation += 2;
				break;
			case ENT_CORE:
				Player.player.forceRelation += 1;
				break;
			case TRUFFLE: case PUMPKIN: case GARLIC: case HONEY: case APPLE: case EGGCORN:
				Player.player.forceRelation += 0.1;
				break;
			case GOLD: case SILVER:
				Player.player.forceRelation += 0.5;
				break;
			case VIRGIN:
				Player.player.forceRelation += 10;
				break;
			case WAX: case WOOD:
				Player.player.forceRelation += 0.02;
				break;
			}
			
			switch (Player.player.forceRewardCount) {
			case 0: if (Player.player.forceRelation >= 5) {
				Player.player.forceRewardCount++;
				Player.player.getPerson().addSkill(Skill.SKY_BLESSING_1);
				extra.println("You feel blessed.");
				return;
			}
			break;
			
			}
			extra.println("The gift disappears, but nothing else happens.");
		}
	}
	
}
