import java.util.ArrayList;

public class MaterialFactory {
	public static ArrayList<Material> matList = new ArrayList<Material>();
	
	/**
	 * Set up the static flyweights for the materials.
	 */
	public MaterialFactory() {
		Material misc = new Material();
		misc.name = "cloth";
		misc.thingType = "light";
		misc.armor = true;
		misc.weapon = false;
		misc.weight = 2;
		misc.cost = 2;
		misc.baseEnchant = 1;
		misc.baseResist = 2;
		misc.sharpResist = .5;
		misc.bluntResist = 1;
		misc.pierceResist = .5;
		misc.dexMod = 1.1;
		misc.sharpMult = 0;
		misc.bluntMult = 0;
		misc.pierceMult = 0;
		misc.tier = 0;
		misc.rarity = .5;
		misc.fireVul = 2;
		misc.shockVul = .2;
		misc.freezeVul = .2;
		matList.add(misc);
		
		misc = new Material();
		misc.name = "leather";
		misc.thingType = "light";
		misc.armor = true;
		misc.weapon = false;
		misc.weight = 5;
		misc.cost = 5;
		misc.baseEnchant = 1;
		misc.baseResist = 3;
		misc.sharpResist = 1;
		misc.bluntResist = 1;
		misc.pierceResist = 1;
		misc.dexMod = 1;
		misc.sharpMult = 0;
		misc.bluntMult = 0;
		misc.pierceMult = 0;
		misc.tier = 1;
		misc.rarity = 5;
		misc.fireVul = 1.1;
		misc.shockVul = .1;
		misc.freezeVul = .1;
		matList.add(misc);
		
		misc = new Material();
		misc.name = "iron";
		misc.thingType = "heavy";
		misc.armor = true;
		misc.weapon = true;
		misc.weight = 20;
		misc.cost = 30;
		misc.baseEnchant = .3;
		misc.baseResist = 6;
		misc.sharpResist = 1;
		misc.bluntResist = 1;
		misc.pierceResist = 1;
		misc.dexMod = .9;
		misc.sharpMult = 1;
		misc.bluntMult = 1;
		misc.pierceMult = 1;
		misc.tier = 1;
		misc.rarity = 5;
		misc.fireVul = .8;
		misc.shockVul = 1.5;
		misc.freezeVul = 2;
		matList.add(misc);
		
		misc = new Material();
		misc.name = "chainmail";
		misc.thingType = "light";
		misc.armor = true;
		misc.weapon = false;
		misc.weight = 25;
		misc.cost = 35;
		misc.baseEnchant = .1;
		misc.baseResist = 8;
		misc.sharpResist = 2;
		misc.bluntResist = 1;
		misc.pierceResist = .3;
		misc.dexMod = .95;
		misc.sharpMult = 0;
		misc.bluntMult = 0;
		misc.pierceMult = 0;
		misc.tier = 2;
		misc.rarity = .8*5;
		misc.fireVul = .8;
		misc.shockVul = 1.5;
		misc.freezeVul = 2;
		matList.add(misc);
		
		misc = new Material();
		misc.name = "steel";
		misc.thingType = "heavy";
		misc.armor = true;
		misc.weapon = true;
		misc.weight = 25;
		misc.cost = 50;
		misc.baseEnchant = 0;
		misc.baseResist = 12;
		misc.sharpResist = 1;
		misc.bluntResist = 1;
		misc.pierceResist = 1;
		misc.dexMod = .9;
		misc.sharpMult = 1.3;
		misc.bluntMult = 1.1;
		misc.pierceMult = 1.3;
		misc.tier = 3;
		misc.rarity = 2.5;
		misc.fireVul = .8;
		misc.shockVul = 1.5;
		misc.freezeVul = 2;
		matList.add(misc);
		
		misc = new Material();
		misc.name = "silver";
		misc.thingType = "heavy";
		misc.armor = true;
		misc.weapon = true;
		misc.weight = 25;
		misc.cost = 30;
		misc.baseEnchant = 1.2;
		misc.baseResist = 6;
		misc.sharpResist = 1;
		misc.bluntResist = 1;
		misc.pierceResist = 1;
		misc.dexMod = .9;
		misc.sharpMult = 1;
		misc.bluntMult = 1.2;
		misc.pierceMult = 1;
		misc.tier = 3;
		misc.rarity = 3;
		misc.fireVul = .8;
		misc.shockVul = 1.8;
		misc.freezeVul = 2;
		matList.add(misc);
		
		misc = new Material();
		misc.name = "gold";
		misc.thingType = "heavy";
		misc.armor = true;
		misc.weapon = true;
		misc.weight = 50;
		misc.cost = 50;
		misc.baseEnchant = 2;
		misc.baseResist = 8;
		misc.sharpResist = .1;
		misc.bluntResist = 1;
		misc.pierceResist = .2;
		misc.dexMod = .7;
		misc.sharpMult = .1;
		misc.bluntMult = 3;
		misc.pierceMult = .1;
		misc.tier = 3;
		misc.rarity = 1.5;
		misc.fireVul = .8;
		misc.shockVul = 2;
		misc.freezeVul = 2;
		matList.add(misc);
		
		misc = new Material();
		misc.name = "silk";
		misc.thingType = "light";
		misc.armor = true;
		misc.weapon = false;
		misc.weight = 2;
		misc.cost = 20;
		misc.baseEnchant = 2;
		misc.baseResist = .1;
		misc.sharpResist = 0;
		misc.bluntResist = 1;
		misc.pierceResist = 0;
		misc.dexMod = 1.2;
		misc.sharpMult = 0;
		misc.bluntMult = 0;
		misc.pierceMult = 0;
		misc.tier = 1;
		misc.rarity = 1.5;
		misc.fireVul = 2;
		misc.shockVul = .6;
		misc.freezeVul = .6;
		matList.add(misc);
		
		misc = new Material();
		misc.name = "platinum";
		misc.thingType = "heavy";
		misc.armor = true;
		misc.weapon = true;
		misc.weight = 55;
		misc.cost = 60;
		misc.baseEnchant = 1.8;
		misc.baseResist = 6;
		misc.sharpResist = 1;
		misc.bluntResist = 1;
		misc.pierceResist = 1;
		misc.dexMod = .65;
		misc.sharpMult = 1;
		misc.bluntMult = 2.2;
		misc.pierceMult = 1;
		misc.tier = 3;
		misc.rarity = .5;
		misc.fireVul = .8;
		misc.shockVul = 1.6;//??
		misc.freezeVul = 2;
		matList.add(misc);
		
		misc = new Material();
		misc.name = "mythril";
		misc.thingType = "heavy";
		misc.armor = true;
		misc.weapon = true;
		misc.weight = 15;
		misc.cost = 80;
		misc.baseEnchant = 1.5;
		misc.baseResist = 15;
		misc.sharpResist = 1;
		misc.bluntResist = 1;
		misc.pierceResist = 1;
		misc.dexMod = .9;
		misc.sharpMult = 1.5;
		misc.bluntMult = .9;
		misc.pierceMult = 1.5;
		misc.tier = 4;
		misc.rarity = .5;
		misc.fireVul = .6;
		misc.shockVul = 1;
		misc.freezeVul = 1.5;
		matList.add(misc);
		
		misc = new Material();
		misc.name = "adamantine";
		misc.thingType = "both";
		misc.armor = true;
		misc.weapon = true;
		misc.weight = 1;
		misc.cost = 120;
		misc.baseEnchant = 1.5;
		misc.baseResist = 20;
		misc.sharpResist = 1.1;
		misc.bluntResist = .8;
		misc.pierceResist = 1.1;
		misc.dexMod = 1;
		misc.sharpMult = 3;
		misc.bluntMult = .1;
		misc.pierceMult = 2;
		misc.tier = 4;
		misc.rarity = .1;
		misc.fireVul = .5;
		misc.shockVul = 0;
		misc.freezeVul = 0;
		matList.add(misc);
		
		misc = new Material();
		misc.name = "sunsunsteel";
		misc.thingType = "heavy";
		misc.armor = false;
		misc.weapon = true;
		misc.weight = 25;
		misc.cost = 120;
		misc.baseEnchant = 0;
		misc.baseResist = 12;
		misc.sharpResist = 1;
		misc.bluntResist = 1;
		misc.pierceResist = 1;
		misc.dexMod = .9;
		misc.sharpMult = 2.3;
		misc.bluntMult = 2.1;
		misc.pierceMult = 2.3;
		misc.tier = 4;
		misc.rarity = .25;
		misc.fireVul = .8;
		misc.shockVul = 1.5;
		misc.freezeVul = 2;
		matList.add(misc);
		
		misc = new Material();
		misc.name = "ectoplasm";
		misc.thingType = "light";
		misc.armor = true;
		misc.weapon = true;
		misc.weight = 2;
		misc.cost = 40;
		misc.baseEnchant = 1;
		misc.baseResist = 4;
		misc.sharpResist = .8;
		misc.bluntResist = 2;
		misc.pierceResist = .6;
		misc.dexMod = 1.2;
		misc.sharpMult = 1;
		misc.bluntMult = .8;
		misc.pierceMult = 1;
		misc.tier = 2;
		misc.rarity = .25;
		misc.fireVul = 2;
		misc.shockVul = 1;
		misc.freezeVul = 1;
		matList.add(misc);
		
		misc = new Material();
		misc.name = "moonsilver";
		misc.thingType = "heavy";
		misc.armor = true;
		misc.weapon = true;
		misc.weight = 25;
		misc.cost = 60;
		misc.baseEnchant = 1.5;
		misc.baseResist = 7;
		misc.sharpResist = 1;
		misc.bluntResist = 1;
		misc.pierceResist = 1;
		misc.dexMod = .9;
		misc.sharpMult = 1.2;
		misc.bluntMult = 1.3;
		misc.pierceMult = 1.2;
		misc.tier = 4;
		misc.rarity = .25;
		misc.fireVul = .8;
		misc.shockVul = 1.8;
		misc.freezeVul = 2;
		matList.add(misc);
		
		misc = new Material();
		misc.name = "wood";
		misc.thingType = "heavy";
		misc.armor = true;
		misc.weapon = true;
		misc.weight = 4;
		misc.cost = 3;
		misc.baseEnchant = .9;
		misc.baseResist = 2;
		misc.sharpResist = 1;
		misc.bluntResist = 1.5;
		misc.pierceResist = 1;
		misc.dexMod = .9;
		misc.sharpMult = .2;
		misc.bluntMult = .8;
		misc.pierceMult = .3;
		misc.tier = 0;
		misc.rarity = .1;
		misc.fireVul = 2;
		misc.shockVul = 0;
		misc.freezeVul = .5;
		matList.add(misc);
		
		misc = new Material();
		misc.name = "solar gold";
		misc.thingType = "heavy";
		misc.armor = true;
		misc.weapon = true;
		misc.weight = 100;
		misc.cost = 100;
		misc.baseEnchant = 2;
		misc.baseResist = 10;
		misc.sharpResist = .3;
		misc.bluntResist = 1.2;
		misc.pierceResist = .4;
		misc.dexMod = .5;
		misc.sharpMult = .2;
		misc.bluntMult = 3.5;
		misc.pierceMult = .2;
		misc.tier = 4;
		misc.rarity = .1;
		misc.fireVul = .8;
		misc.shockVul = 2;
		misc.freezeVul = 2;
		matList.add(misc);
		
		
		
	}
	
	public static Material randMat(Boolean armor, Boolean weapon) {
		ArrayList<Material> copyList = new ArrayList<Material>();
		ArrayList<Material> copyList2 = new ArrayList<Material>();
		for (Material mat: matList){
			if ((mat.armor == true && armor == true)||(mat.weapon == true && weapon == true)) {
			copyList.add(mat);}
		}
		double totalRarity = 0;
		Material mat;
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
}
