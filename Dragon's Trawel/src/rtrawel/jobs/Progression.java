package rtrawel.jobs;

import java.util.ArrayList;
import java.util.List;

public class Progression {

	public List<PathWithLevel> paths = new ArrayList<PathWithLevel>();
	public List<JobWithLevel> jobs = new ArrayList<JobWithLevel>();
	
	public int jobLevel(String j) {
		for (JobWithLevel k: jobs) {
			if (k.jobName.equals(j)) {
				return k.level;
			}
		}
		return -1;
	}
	public int pathLevel(String p) {
		for (PathWithLevel k: paths) {
			if (k.path.name().equals(p)){
				return k.level;
			}
		}
		return -1;
	}
	
	public void addPathPoints(String p, int points) {
		if (pathLevel(p) == -1) {
			paths.add(new PathWithLevel(PathFactory.getPathByName(p), points));
		}else {
			for (PathWithLevel k: paths) {
				if (k.path.name().equals(p)){
					k.level+=points;
				}
			}
		}
	}
}
