package trawel;
import java.util.ArrayList;

public class RaceFactory {
	public static Race misc = new Race();
	public static ArrayList<Race> raceList = new ArrayList<Race>();
	
	public RaceFactory() {
		misc = new Race();
		misc.name = "human";
		misc.namePlural = "humans";
		misc.swears.add("thinskin");
		misc.aimMod = 1.05;
		misc.damMod = 1;
		misc.dodgeMod = 1;
		misc.hpMod = 1;
		misc.speedMod = 1.05;
		misc.tradeMod = 1.2;
		misc.rarity = 3;
		misc.insultList.add("Your skin is as thin as your brain!");
		misc.baseMap = "human";
		misc.raceMaps.add("0");
		misc.raceMaps.add("1");
		misc.raceMaps.add("2");
		misc.magicPower = 1;
		misc.defPower = 2;
		misc.racialType = Race.RaceType.HUMANOID;
		misc.targetType = TargetFactory.TargetType.HUMANOID;
		misc.emitsBlood = true;
		misc.voice = SoundBox.Voice.FEMALE_BASIC;
		misc.minPitch = .975f;
		misc.maxPitch = 1.025f;
		raceList.add(misc);
		
		misc = new Race();
		misc.name = "orc";
		misc.namePlural = "orcs";
		misc.swears.add("greenskin");
		misc.aimMod = .9;
		misc.damMod = 1.2;
		misc.dodgeMod = 1.1;
		misc.hpMod = 1.2;
		misc.speedMod = .9;
		misc.tradeMod = .8;
		misc.rarity = 1;
		misc.insultList.add("They say 'as dumb as an orc' for a reason!");
		misc.baseMap = "nada";
		misc.raceMaps.add("nuthin");
		misc.magicPower = 0;
		misc.defPower = 2;
		misc.racialType = Race.RaceType.HUMANOID;
		misc.targetType = TargetFactory.TargetType.HUMANOID;
		misc.emitsBlood = true;
		misc.voice = SoundBox.Voice.FEMALE_BASIC;
		misc.minPitch = .9f;
		misc.maxPitch = .95f;
		raceList.add(misc);
		
		misc = new Race();
		misc.name = "lizardfolk";
		misc.namePlural = "lizardfolk";
		misc.swears.add("lizard");
		misc.swears.add("reptile");
		misc.aimMod = 1.2;
		misc.damMod = 1;
		misc.dodgeMod = 1.1;
		misc.hpMod = 1;
		misc.speedMod = 1;
		misc.tradeMod = .9;
		misc.rarity = 1;
		misc.insultList.add("What do you want, lizard?");
		misc.baseMap = "nada";
		misc.raceMaps.add("nuthin");
		misc.magicPower = 1;
		misc.defPower = 1;
		misc.racialType = Race.RaceType.HUMANOID;
		misc.targetType = TargetFactory.TargetType.HUMANOID;
		misc.emitsBlood = true;
		misc.voice = SoundBox.Voice.FEMALE_BASIC;
		misc.minPitch = .975f;
		misc.maxPitch = 1.025f;
		raceList.add(misc);
		
		misc = new Race();
		misc.name = "high elf";
		misc.namePlural = "high elves";
		misc.swears.add("pointy-ear");
		misc.aimMod = 1.2;
		misc.damMod = 1;
		misc.dodgeMod = 1.1;
		misc.hpMod = .7;
		misc.speedMod = 1.1;
		misc.tradeMod = 1;
		misc.rarity = .5;
		misc.insultList.add("Have you heard of the 'high' elves?");
		misc.insultList.add("What are you going to do, stab me with your ears?");
		misc.baseMap = "nada";
		misc.raceMaps.add("nuthin");
		misc.magicPower = 2;
		misc.defPower = 0;
		misc.racialType = Race.RaceType.HUMANOID;
		misc.targetType = TargetFactory.TargetType.HUMANOID;
		misc.emitsBlood = true;
		misc.voice = SoundBox.Voice.FEMALE_BASIC;
		misc.minPitch = .975f;
		misc.maxPitch = 1.025f;
		raceList.add(misc);
		
		misc = new Race();
		misc.name = "low elf";
		misc.namePlural = "low elves";
		misc.swears.add("tree-hugger");
		misc.swears.add("pointy-ear");
		misc.swears.add("hippie");
		misc.aimMod = 1.1;
		misc.damMod = 1;
		misc.dodgeMod = 1.3;
		misc.hpMod = .75;
		misc.speedMod = 1.1;
		misc.tradeMod = 1;
		misc.rarity = .5;
		misc.insultList.add("Go, hug a tree!");
		misc.insultList.add("What are you going to do, stab me with your ears?");
		misc.baseMap = "nada";
		misc.raceMaps.add("nuthin");
		misc.magicPower = 1;
		misc.defPower = 0;
		misc.racialType = Race.RaceType.HUMANOID;
		misc.targetType = TargetFactory.TargetType.HUMANOID;
		misc.emitsBlood = true;
		misc.voice = SoundBox.Voice.FEMALE_BASIC;
		misc.minPitch = .975f;
		misc.maxPitch = 1.025f;
		raceList.add(misc);
		
		misc = new Race();
		misc.name = "wolf-bound";
		misc.namePlural = "wolf-bound";
		misc.swears.add("dog");
		misc.aimMod = 1;
		misc.damMod = .9;
		misc.dodgeMod = 1.2;
		misc.hpMod = .9;
		misc.speedMod = 1.1;
		misc.tradeMod = 1;
		misc.rarity = .25;
		misc.insultList.add("Go fetch, dog!");
		misc.insultList.add("Howl somewhere else, dog!");
		misc.baseMap = "nada";
		misc.raceMaps.add("nuthin");
		misc.magicPower = 0;
		misc.defPower = 1;
		misc.racialType = Race.RaceType.HUMANOID;
		misc.targetType = TargetFactory.TargetType.HUMANOID;
		misc.emitsBlood = true;
		misc.voice = SoundBox.Voice.FEMALE_BASIC;
		misc.minPitch = .975f;
		misc.maxPitch = 1.025f;
		raceList.add(misc);
		
		misc = new Race();
		misc.name = "turtle-kin";
		misc.namePlural = "turtle-kin";
		misc.swears.add("shelly");
		misc.aimMod = 1;
		misc.damMod = 1;
		misc.dodgeMod = 1;
		misc.hpMod = 1.5;
		misc.speedMod = .7;
		misc.tradeMod = 1;
		misc.rarity = .25;
		misc.insultList.add("I'll rip that shell right off!");
		misc.baseMap = "nada";
		misc.raceMaps.add("nuthin");
		misc.magicPower = 1;
		misc.defPower = 3;
		misc.racialType = Race.RaceType.HUMANOID;
		misc.targetType = TargetFactory.TargetType.HUMANOID;
		misc.emitsBlood = true;
		misc.voice = SoundBox.Voice.FEMALE_BASIC;
		misc.minPitch = .9f;
		misc.maxPitch =.95f;
		raceList.add(misc);
		
		misc = new Race();
		misc.name = "cat-kin";
		misc.namePlural = "cat-kin";
		misc.swears.add("fleabag");
		misc.swears.add("hairball");
		misc.aimMod = 1.2;
		misc.damMod = 1;
		misc.dodgeMod = 1;
		misc.hpMod = 1;
		misc.speedMod = 1;
		misc.tradeMod = 1;
		misc.rarity = .25;
		misc.insultList.add("Stay away, I don't want fleas!");
		misc.insultList.add("Go meow somewhere else!");
		misc.insultList.add("You'd make a nice rug, cat.");
		misc.baseMap = "cat";
		misc.raceMaps.add("0");
		misc.raceMaps.add("2");
		misc.raceMaps.add("3");
		misc.raceMaps.add("4");
		misc.magicPower = 0;
		misc.defPower = 1;
		misc.racialType = Race.RaceType.HUMANOID;
		misc.targetType = TargetFactory.TargetType.HUMANOID;
		misc.emitsBlood = true;
		misc.voice = SoundBox.Voice.FEMALE_BASIC;
		misc.minPitch = 1.05f;
		misc.maxPitch = 1.1f;
		raceList.add(misc);
		
		misc = new Race();
		misc.name = "slugman";
		misc.namePlural = "slugmen";
		misc.swears.add("slowpoke");
		misc.aimMod = 2;
		misc.damMod = 1;
		misc.dodgeMod = .5;
		misc.hpMod = 1.2;
		misc.speedMod = .6;
		misc.tradeMod = 1.2;
		misc.rarity = .2;
		misc.insultList.add("Clean up after your trail!");
		misc.baseMap = "nada";
		misc.raceMaps.add("nuthin");
		misc.magicPower = 2;
		misc.defPower = 1;
		misc.racialType = Race.RaceType.HUMANOID;
		misc.targetType = TargetFactory.TargetType.HUMANOID;
		misc.emitsBlood = true;
		misc.voice = SoundBox.Voice.FEMALE_BASIC;
		misc.minPitch = .975f;
		misc.maxPitch = 1.025f;
		raceList.add(misc);
		
		misc = new Race();
		misc.name = "tenderheart";
		misc.namePlural = "tenderhearts";
		misc.swears.add("exposed");
		misc.aimMod = 1;
		misc.damMod = .7;
		misc.dodgeMod = 1.3;
		misc.hpMod = 1.1;
		misc.speedMod = 1;
		misc.tradeMod = 1.2;
		misc.rarity = .2;
		misc.insultList.add("Look out, your heart's hanging out!");
		misc.baseMap = "nada";
		misc.raceMaps.add("nuthin");
		misc.magicPower = 2;
		misc.defPower = 0;
		misc.racialType = Race.RaceType.HUMANOID;
		misc.targetType = TargetFactory.TargetType.HUMANOID;
		misc.emitsBlood = true;
		misc.voice = SoundBox.Voice.FEMALE_BASIC;
		misc.minPitch = .975f;
		misc.maxPitch = 1.025f;
		raceList.add(misc);
		
		misc = new Race();
		misc.name = "skeleton";
		misc.namePlural = "skeletons";
		misc.swears.add("boneman");
		misc.aimMod = 1;
		misc.damMod = 1;
		misc.dodgeMod = 1.3;
		misc.hpMod = .5;
		misc.speedMod = 1.3;
		misc.tradeMod = 1;
		misc.rarity = .2;
		misc.insultList.add("Rattle your bones somewhere else!");
		misc.baseMap = "nada";
		misc.raceMaps.add("nuthin");
		misc.magicPower = 0;
		misc.defPower = 0;
		misc.racialType = Race.RaceType.HUMANOID;
		misc.targetType = TargetFactory.TargetType.HUMANOID;
		misc.emitsBlood = false;
		misc.voice = SoundBox.Voice.NONE;
		misc.minPitch = .975f;
		misc.maxPitch = 1.025f;
		raceList.add(misc);
		
		misc = new Race();
		misc.name = "voltican";
		misc.namePlural = "volticans";
		misc.swears.add("sparky");
		misc.aimMod = .9;
		misc.damMod = 1.2;
		misc.dodgeMod = 1.2;
		misc.hpMod = .9;
		misc.speedMod = 1.1;
		misc.tradeMod = 1;
		misc.rarity = .2;
		misc.insultList.add("Oh good, I needed a firestarter!");
		misc.baseMap = "nada";
		misc.raceMaps.add("nuthin");
		misc.magicPower = 2;
		misc.defPower = 0;
		misc.racialType = Race.RaceType.HUMANOID;
		misc.targetType = TargetFactory.TargetType.HUMANOID;
		misc.emitsBlood = false;
		misc.voice = SoundBox.Voice.FEMALE_BASIC;
		misc.minPitch = .975f;
		misc.maxPitch = 1.025f;
		raceList.add(misc);
		
		misc = new Race();
		misc.name = "fugue";
		misc.namePlural = "fugues";
		misc.swears.add("reclaimer");
		misc.aimMod = 1;
		misc.damMod = 1;
		misc.dodgeMod = 1;
		misc.hpMod = 1;
		misc.speedMod = 1;
		misc.tradeMod = 1;
		misc.rarity = .2;
		misc.insultList.add("You won't be reclaiming this!");
		misc.baseMap = "nada";
		misc.raceMaps.add("nuthin");
		misc.magicPower = 1;
		misc.defPower = 1;
		misc.racialType = Race.RaceType.HUMANOID;
		misc.targetType = TargetFactory.TargetType.HUMANOID;
		misc.emitsBlood = true;
		misc.voice = SoundBox.Voice.FEMALE_BASIC;
		misc.minPitch = .95f;
		misc.maxPitch = 1.00f;
		raceList.add(misc);
		
		misc = new Race();
		misc.name = "mermaid";
		misc.namePlural = "mermaids";
		misc.swears.add("fish");
		misc.aimMod = 1;
		misc.damMod = 1;
		misc.dodgeMod = 1.2;
		misc.hpMod = 1;
		misc.speedMod = 1.01;
		misc.tradeMod = .9;
		misc.rarity = .7;
		misc.insultList.add("Go, swim away!");
		misc.baseMap = "mermaid";
		misc.raceMaps.add("nuthin");
		misc.magicPower = 1;
		misc.defPower = 1;
		misc.racialType = Race.RaceType.HUMANOID;
		misc.targetType = TargetFactory.TargetType.HUMANOID;
		misc.emitsBlood = true;
		misc.voice = SoundBox.Voice.FEMALE_BASIC;
		misc.minPitch = .975f;
		misc.maxPitch = 1.025f;
		raceList.add(misc);
		
		
		
		//////beasts
		misc = new Race();
		misc.name = "wolf";
		misc.namePlural = "wolves";
		misc.swears.add("dog");
		misc.aimMod = 1.1;
		misc.damMod = .9;
		misc.dodgeMod = 1.3;
		misc.hpMod = .9;
		misc.speedMod = 1.2;
		misc.tradeMod = 1;
		misc.rarity = 1;
		misc.insultList.add("Die, you mutt!");
		misc.insultList.add("Die, dog!");
		misc.baseMap = "wolf";
		misc.raceMaps.add("0");
		misc.raceMaps.add("1");
		misc.raceMaps.add("2");
		misc.raceMaps.add("3");
		misc.raceMaps.add("4");
		misc.magicPower = 0;
		misc.defPower = 0;
		misc.racialType = Race.RaceType.BEAST;
		misc.targetType = TargetFactory.TargetType.QUAD;
		misc.emitsBlood = true;
		misc.voice = SoundBox.Voice.WOLF;
		misc.minPitch = .975f;
		misc.maxPitch = 1.025f;
		raceList.add(misc);
		
		misc = new Race();
		misc.name = "open-mimic";
		misc.namePlural = "open mimics";
		misc.swears.add("box");
		misc.aimMod = 1.2;
		misc.damMod = 1;
		misc.dodgeMod = .8;
		misc.hpMod = 1.6;
		misc.speedMod = 1;
		misc.tradeMod = 1;
		misc.rarity = 1;
		misc.insultList.add("Die, box!");
		misc.baseMap = "mimic";
		misc.raceMaps.add("0");
		misc.raceMaps.add("1");
		misc.raceMaps.add("2");
		misc.raceMaps.add("3");
		misc.raceMaps.add("4");
		misc.magicPower = 0;
		misc.defPower = 0;
		misc.racialType = Race.RaceType.BEAST;
		misc.targetType = TargetFactory.TargetType.OPEN_MIMIC;
		misc.emitsBlood = true;
		raceList.add(misc);
		
		misc = new Race();
		misc.name = "hiding-mimic";
		misc.namePlural = "hiding mimics";
		misc.swears.add("box");
		misc.aimMod = 1;
		misc.damMod = 1;
		misc.dodgeMod = .6;
		misc.hpMod = 1.6;
		misc.speedMod = 1;
		misc.tradeMod = 1;
		misc.rarity = 1;
		misc.insultList.add("Die, box!");
		misc.baseMap = "chest";
		misc.raceMaps.add("0");
		misc.raceMaps.add("1");
		misc.raceMaps.add("2");
		misc.raceMaps.add("3");
		misc.raceMaps.add("4");
		misc.magicPower = 0;
		misc.defPower = 0;
		misc.racialType = Race.RaceType.BEAST;
		misc.targetType = TargetFactory.TargetType.MIMIC;
		misc.emitsBlood = false;
		raceList.add(misc);
		
		
		misc = new Race();
		misc.name = "standing-reaver";
		misc.namePlural = "standing reavers";
		misc.swears.add("scum");
		misc.aimMod = 1;
		misc.damMod = 1;
		misc.dodgeMod = .8;
		misc.hpMod = 1.2;
		misc.speedMod = 1.1;
		misc.tradeMod = 1;
		misc.rarity = 1;
		misc.insultList.add("Die, you scum!");
		misc.baseMap = "";
		misc.raceMaps.add("0");
		misc.magicPower = 0;
		misc.defPower = 0;
		misc.racialType = Race.RaceType.BEAST;
		misc.targetType = TargetFactory.TargetType.S_REAVER;
		misc.emitsBlood = true;
		raceList.add(misc);
		
		misc = new Race();
		misc.name = "crouching-reaver";
		misc.namePlural = "crouching reavers";
		misc.swears.add("scum");
		misc.aimMod = 1.3;
		misc.damMod = 1.1;
		misc.dodgeMod = .5;
		misc.hpMod = 1.2;
		misc.speedMod = 1;
		misc.tradeMod = 1;
		misc.rarity = 1;
		misc.insultList.add("Die, you scum!");
		misc.baseMap = "";
		misc.raceMaps.add("0");
		misc.magicPower = 0;
		misc.defPower = 0;
		misc.racialType = Race.RaceType.BEAST;
		misc.targetType = TargetFactory.TargetType.C_REAVER;
		misc.emitsBlood = true;
		raceList.add(misc);
		
		misc = new Race();
		misc.name = "ent";
		misc.namePlural = "ent";
		misc.swears.add("tree");
		misc.aimMod = 1;
		misc.damMod = .9;
		misc.dodgeMod = .4;
		misc.hpMod = 2;
		misc.speedMod = .9;
		misc.tradeMod = 1;
		misc.rarity = 1;
		misc.insultList.add("Die, tree!");
		misc.baseMap = "ent";
		misc.raceMaps.add("0");
		misc.magicPower = 0;
		misc.defPower = 0;
		misc.racialType = Race.RaceType.BEAST;
		misc.targetType = TargetFactory.TargetType.STATUE;
		misc.emitsBlood = false;
		misc.voice = SoundBox.Voice.ENT;
		misc.minPitch = .975f;
		misc.maxPitch = 1.025f;
		raceList.add(misc);
		
		misc = new Race();
		misc.name = "bear";
		misc.namePlural = "bears";
		misc.swears.add("beast");
		misc.aimMod = 1;
		misc.damMod = 1;
		misc.dodgeMod = .6;
		misc.hpMod = 2;
		misc.speedMod = .7;
		misc.tradeMod = 1;
		misc.rarity = 1;
		misc.insultList.add("Die, you bear!");
		misc.insultList.add("Die, bear!");
		misc.baseMap = "bear";
		misc.raceMaps.add("0");
		misc.magicPower = 0;
		misc.defPower = 0;
		misc.racialType = Race.RaceType.BEAST;
		misc.targetType = TargetFactory.TargetType.QUAD;
		misc.emitsBlood = true;
		misc.voice = SoundBox.Voice.BEAR;
		misc.minPitch = .975f;
		misc.maxPitch = 1.025f;
		raceList.add(misc);
		
		misc = new Race();
		misc.name = "bat";
		misc.namePlural = "bats";
		misc.swears.add("bat");
		misc.aimMod = 1;
		misc.damMod = .8;
		misc.dodgeMod = 1.4;
		misc.hpMod = .7;
		misc.speedMod = 1.1;
		misc.tradeMod = 1;
		misc.rarity = 1;
		misc.insultList.add("Die, you bat!");
		misc.insultList.add("Die, bat!");
		misc.baseMap = "bat";
		misc.raceMaps.add("0");
		misc.magicPower = 0;
		misc.defPower = 0;
		misc.racialType = Race.RaceType.BEAST;
		misc.targetType = TargetFactory.TargetType.FLY;
		misc.emitsBlood = true;
		misc.voice = SoundBox.Voice.BAT;
		misc.minPitch = .975f;
		misc.maxPitch = 1.025f;
		raceList.add(misc);
		
		misc = new Race();
		misc.name = "flesh-golem";
		misc.namePlural = "flesh-golems";
		misc.swears.add("meatsack");
		misc.aimMod = .9;
		misc.damMod = 1.1;
		misc.dodgeMod = .6;
		misc.hpMod = 1.4;
		misc.speedMod = .9;
		misc.tradeMod = .9;
		misc.rarity = 1;
		misc.insultList.add("Die, meatsack!");
		misc.baseMap = "flesh_golem";
		misc.raceMaps.add("0");;
		misc.magicPower = 0;
		misc.defPower = 1;
		misc.racialType = Race.RaceType.BEAST;
		misc.targetType = TargetFactory.TargetType.HUMANOID;
		misc.emitsBlood = true;
		misc.voice = SoundBox.Voice.F_GOLEM;
		misc.minPitch = .975f;
		misc.maxPitch = 1.025f;
		raceList.add(misc);
		
		misc = new Race();
		misc.name = "unicorn";
		misc.namePlural = "unicorns";
		misc.swears.add("horsey");
		misc.aimMod = 1.3;
		misc.damMod = .9;
		misc.dodgeMod = .8;
		misc.hpMod = 1.5;
		misc.speedMod = 1.1;
		misc.tradeMod = 1;
		misc.rarity = 1;
		misc.insultList.add("Die, stupid horse!");
		misc.baseMap = "unicorn";
		misc.raceMaps.add("0");
		misc.magicPower = 3;
		misc.defPower = 0;
		misc.racialType = Race.RaceType.BEAST;
		misc.targetType = TargetFactory.TargetType.QUAD;
		misc.emitsBlood = true;
		misc.voice = SoundBox.Voice.WOLF;
		misc.minPitch = .975f;
		misc.maxPitch = 1.025f;
		raceList.add(misc);
		
		misc = new Race();
		misc.name = "harpy";
		misc.namePlural = "harpies";
		misc.swears.add("harpy");
		misc.aimMod = 1;
		misc.damMod = 1.1;
		misc.dodgeMod = 1.25;
		misc.hpMod = .9;
		misc.speedMod = 1;
		misc.tradeMod = 1;
		misc.rarity = 1;
		misc.insultList.add("Die, you feathery fiend!");
		misc.baseMap = "harpy";
		misc.raceMaps.add("0");
		misc.magicPower = 0;
		misc.defPower = 0;
		misc.racialType = Race.RaceType.BEAST;
		misc.targetType = TargetFactory.TargetType.FLY;
		misc.emitsBlood = true;
		misc.voice = SoundBox.Voice.BAT;
		misc.minPitch = .975f;
		misc.maxPitch = 1.025f;
		raceList.add(misc);
		
		misc = new Race();
		misc.name = "drudger-stock";
		misc.namePlural = "stock-drudgers";
		misc.swears.add("drowner");
		misc.aimMod = 1;
		misc.damMod = 1;
		misc.dodgeMod = 1;
		misc.hpMod = 1;
		misc.speedMod = 1;
		misc.tradeMod = .5;
		misc.rarity = 1;
		misc.insultList.add("Drudger!");
		misc.baseMap = "flesh_golem";
		misc.raceMaps.add("0");;
		misc.magicPower = 0;
		misc.defPower = 0;
		misc.racialType = Race.RaceType.BEAST;
		misc.targetType = TargetFactory.TargetType.HUMANOID;
		misc.emitsBlood = true;
		misc.voice = SoundBox.Voice.F_GOLEM;
		misc.minPitch = .975f;
		misc.maxPitch = 1.025f;
		raceList.add(misc);
		
		misc = new Race();
		misc.name = "drudger-titan";
		misc.namePlural = "titan-drudgers";
		misc.swears.add("drowner");
		misc.aimMod = 1;
		misc.damMod = 1.2;
		misc.dodgeMod = .4;
		misc.hpMod = 2;
		misc.speedMod = .5;
		misc.tradeMod = .5;
		misc.rarity = 1;
		misc.insultList.add("Drudger!");
		misc.baseMap = "flesh_golem";
		misc.raceMaps.add("0");;
		misc.magicPower = 0;
		misc.defPower = 0;
		misc.racialType = Race.RaceType.BEAST;
		misc.targetType = TargetFactory.TargetType.HUMANOID;
		misc.emitsBlood = true;
		misc.voice = SoundBox.Voice.F_GOLEM;
		misc.minPitch = .975f;
		misc.maxPitch = 1.025f;
		raceList.add(misc);
		
	}
	
	public static Race randRace(Race.RaceType type) {
		ArrayList<Race> copyList = new ArrayList<Race>();
		ArrayList<Race> copyList2 = new ArrayList<Race>();
		for (Race mat: raceList){
			if (type == mat.racialType) {
			copyList.add(mat);}
		}
		double totalRarity = 0;
		Race mat;
		do {
			int i = (int) Math.floor((Math.random()*copyList.size()));
			mat = copyList.get(i);
			copyList2.add(mat);
			totalRarity += mat.rarity;
			copyList.remove(i);
		}while(!copyList.isEmpty());
		totalRarity*=Math.random();
		do {
			mat = copyList2.get(0);
			if (totalRarity > mat.rarity) {
				totalRarity-=mat.rarity;
				copyList2.remove(0);
			}else {
				totalRarity = 0;
			} 
				
				
		}while(totalRarity > 0);
		return mat;
	}
	
	public static Race getRace(String string) {
		for (Race m: raceList) {
			if (m.name.equals(string)) {
				return m;
			}
		}
		
		return null;
	}
	
	public static Person makeOld(int level) {
		Person p = new Person(level);
		p.personType = "grizzled";
		if (extra.chanceIn(1,5)) {
			p.getBag().getDrawBanes().add(DrawBane.KNOW_FRAG);
		}
		return p;
	}
	
	public static Person makeWolf(int level) {
		extra.printMode = true;
		Person w = new Person(level,true, Race.RaceType.BEAST,MaterialFactory.getMat("flesh"),Person.RaceFlag.NONE,false);
		w.getBag().swapWeapon(new Weapon(level,MaterialFactory.getMat("bone"),"generic teeth"));
		w.getBag().swapRace(RaceFactory.getRace("wolf"));
		if (extra.chanceIn(1,5)) {
			w.getBag().getDrawBanes().add(DrawBane.MEAT);
		}
		extra.printMode = false;
		return w;
	}

	public static Person makeMimic(int level) {
		extra.printMode = true;
		Person w = new Person(level,true, Race.RaceType.BEAST,MaterialFactory.getMat("wood"),Person.RaceFlag.NONE,false);
		w.getBag().swapWeapon(new Weapon(level,MaterialFactory.getMat("bone"),"generic teeth"));
		w.getBag().swapArmorSlot(new Armor(level,0,MaterialFactory.getMat("flesh")),0);
		w.getBag().swapRace(RaceFactory.getRace("hiding-mimic"));
		w.addSkill(Skill.MIMIC_CHEST);
		if (extra.chanceIn(1,5)) {
			w.getBag().getDrawBanes().add(DrawBane.MIMIC_GUTS);
		}
		extra.printMode = false;
		return w;
	}
	
	public static Person makeStatue(int level) {
		extra.printMode = true;
		Person w = new Person(level,true, Race.RaceType.HUMANOID,MaterialFactory.getMat("flesh"),Person.RaceFlag.CRACKS,false);
		//w.getBag().swapWeapon(new Weapon(level,MaterialFactory.getMat("bone"),"generic teeth"));
		if (extra.chanceIn(1,2)) {
			w.getBag().getDrawBanes().add(DrawBane.CEON_STONE);
		}
		extra.printMode = false;
		w.targetOverride = TargetFactory.TargetType.STATUE;
		return w;
	}
	
	public static Person makeFellReaver(int level) {
		extra.printMode = true;
		Person w = new Person(level,true, Race.RaceType.BEAST,MaterialFactory.getMat("flesh"),Person.RaceFlag.NONE,false);
		w.getBag().swapWeapon(new Weapon(level,MaterialFactory.getMat("bone"),"standing reaver"));
		w.backupWeapon = new Weapon(level,MaterialFactory.getMat("bone"),"generic teeth and claws");
		w.getBag().swapRace(RaceFactory.getRace("standing-reaver"));
		w.addSkill(Skill.FELL_REAVER);
		extra.printMode = false;
		return w;
	}

	public static Person getShaman(int level) {
		extra.printMode = true;
		Person w = new Person(level);
		w.getBag().getDrawBanes().add(DrawBane.PROTECTIVE_WARD);
		extra.printMode = false;
		return w;
	}
	public static Person makeEnt(int level) {
		extra.printMode = true;
		Person w = new Person(level,true, Race.RaceType.BEAST,MaterialFactory.getMat("wood"),Person.RaceFlag.NONE,false);
		w.getBag().swapWeapon(new Weapon(level,MaterialFactory.getMat("wood"),"branches"));
		w.getBag().getDrawBanes().add(DrawBane.ENT_CORE);
		w.getBag().swapRace(RaceFactory.getRace("ent"));
		extra.printMode = false;
		return w;
	}
	
	public static Person makeVampire(int level) {
		extra.printMode = true;
		Person w = new Person(level,true, Race.RaceType.HUMANOID,MaterialFactory.getMat("flesh"),Person.RaceFlag.NONE,false);
		w.setScar(biteFor(w.getBag().getRace()));
		if (extra.chanceIn(1,20)) {
			w.getBag().getDrawBanes().add(DrawBane.BLOOD);
		}
		extra.printMode = false;
		w.targetOverride = TargetFactory.TargetType.UNDEAD_H;
		return w;
	}
	
	public static Person makeBear(int level) {
		extra.printMode = true;
		Person w = new Person(level,true, Race.RaceType.BEAST,MaterialFactory.getMat("flesh"),Person.RaceFlag.NONE,false);
		w.getBag().swapWeapon(new Weapon(level,MaterialFactory.getMat("bone"),"generic teeth and claws"));
		w.getBag().swapRace(RaceFactory.getRace("bear"));
		w.getBag().getDrawBanes().add(DrawBane.MEAT);
		extra.printMode = false;
		return w;
	}
	
	public static Person makeBat(int level) {
		extra.printMode = true;
		Person w = new Person(level,true, Race.RaceType.BEAST,MaterialFactory.getMat("flesh"),Person.RaceFlag.NONE,false);
		w.getBag().swapWeapon(new Weapon(level,MaterialFactory.getMat("bone"),"generic teeth"));
		w.getBag().swapRace(RaceFactory.getRace("bat"));
		if (extra.chanceIn(1,7)) {
			w.getBag().getDrawBanes().add(DrawBane.MEAT);
		}
		if (extra.chanceIn(1,2)) {
			w.getBag().getDrawBanes().add(DrawBane.BAT_WING);
		}
		extra.printMode = false;
		return w;
	}
	
	public static Person getFleshGolem(int level) {
		extra.printMode = true;
		Person w = new Person(level,true, Race.RaceType.BEAST,MaterialFactory.getMat("flesh"),Person.RaceFlag.NONE,false);
		w.getBag().swapWeapon(new Weapon(level,MaterialFactory.getMat("flesh"),"generic fists"));
		w.getBag().swapRace(RaceFactory.getRace("flesh-golem"));
		w.getBag().getDrawBanes().add(DrawBane.BEATING_HEART);
		extra.printMode = false;
		//w.targetOverride = TargetFactory.TargetType.HUMANOID;
		return w;
	}
	
	public static Person makeUnicorn(int level) {
		extra.printMode = true;
		Person w = new Person(level,true, Race.RaceType.BEAST,MaterialFactory.getMat("flesh"),Person.RaceFlag.NONE,false);
		w.getBag().swapWeapon(new Weapon(level,MaterialFactory.getMat("bone"),"unicorn horn"));
		w.getBag().swapRace(RaceFactory.getRace("unicorn"));
		if (extra.chanceIn(1,5)) {
			w.getBag().getDrawBanes().add(DrawBane.UNICORN_HORN);
		}
		extra.printMode = false;
		return w;
	}
	
	public static Person makeHarpy(int level) {
		extra.printMode = true;
		Person w = new Person(level,true, Race.RaceType.BEAST,MaterialFactory.getMat("flesh"),Person.RaceFlag.NONE,false);
		w.getBag().swapWeapon(new Weapon(level,MaterialFactory.getMat("bone"),"generic talons"));
		w.getBag().swapRace(RaceFactory.getRace("harpy"));
		if (extra.chanceIn(1,6)) {
			w.getBag().getDrawBanes().add(DrawBane.MEAT);
		}
		if (extra.chanceIn(1,50)) {
			w.getBag().getDrawBanes().add(DrawBane.GOLD);
		}
		if (extra.chanceIn(1,20)) {
			w.getBag().getDrawBanes().add(DrawBane.SILVER);
		}
		extra.printMode = false;
		return w;
	}
	
	public static Person makeDrudgerStock(int level) {
		extra.printMode = true;
		Person w = new Person(level,true, Race.RaceType.BEAST,MaterialFactory.getMat("flesh"),Person.RaceFlag.NONE,false);
		w.getBag().swapWeapon(new Weapon(level,MaterialFactory.getMat("iron"),"fishing spear"));
		w.getBag().swapRace(RaceFactory.getRace("drudger-stock"));
		if (extra.chanceIn(1,6)) {
			w.getBag().getDrawBanes().add(DrawBane.MEAT);
		}
		extra.printMode = false;
		return w;
	}
	public static Person makeDrudgerTitan(int level) {
		extra.printMode = true;
		Person w = new Person(level,true, Race.RaceType.BEAST,MaterialFactory.getMat("flesh"),Person.RaceFlag.NONE,false);
		w.getBag().swapWeapon(new Weapon(level,MaterialFactory.getMat("iron"),"anchor"));
		w.getBag().swapRace(RaceFactory.getRace("drudger-titan"));
		w.getBag().getDrawBanes().add(DrawBane.MEAT);
		if (extra.chanceIn(1,2)) {
			w.getBag().getDrawBanes().add(DrawBane.MEAT);
		}
		extra.printMode = false;
		return w;
	}

	public static String scarFor(Race race) {
		switch (race.name) {
		case "human":
			if (extra.chanceIn(1, 3)) {
				return extra.choose("hscar_1","H_wound1","H_wound2","H_wound3","H_wound4","H_wound5","H_wound6","H_wound7","H_wound8","H_wound9","H_wound10","H_wound11");
			}
			break;
		}
		return "";
	}
	
	public static String biteFor(Race race) {
		switch (race.name) {
		case "human":
				return extra.choose("H_vampbite1","H_vampbite2","H_vampbite3","H_vampbite4","H_vampbite5");
		}
		return "";
	}

	
}
