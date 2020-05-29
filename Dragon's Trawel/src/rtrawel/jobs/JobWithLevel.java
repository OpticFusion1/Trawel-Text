package rtrawel.jobs;

public class JobWithLevel implements java.io.Serializable {

	public String jobName;
	public int level;
	public int xp;
	
	public JobWithLevel(String n, int l) {
		jobName = n;
		level = l;
		xp = 0;
	}

	public void addXp(int totalxp) {
		//TODO add path points
		switch (level) {
		case 1://https://gamefaqs.gamespot.com/ds/937281-dragon-quest-ix-sentinels-of-the-starry-skies/faqs/57795
			if (xp >= 15) {
				xp-=15;
				level++;
				addXp(0);
			}
			break;
		case 2:
			if (xp >= 35) {
				xp-=35;
				level++;
				addXp(0);
			}
			break;
		case 3:
			if (xp >= 65) {
				xp-=65;
				level++;
				addXp(0);
			}
			break;
		case 4:
			if (xp >= 112) {
				xp-=112;
				level++;
				addXp(0);
			}
			break;
		}
		
	}
}
