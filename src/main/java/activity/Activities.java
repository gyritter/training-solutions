package activity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Activities {

    public List<Activity> activities = new ArrayList();

    public Activities(List<Activity> activities) {
        this.activities = activities;
    }

    public void addActivity(Activity activity) {
        activities.add(activity);
    }

    public int numberOfTrackActivities() {
        int count = 0;
        for (Activity act : activities) {
            if (act instanceof ActivityWithTrack) count++;
        }
        return count;
    }

    public int numberOfWithoutTrackActivities() {
        int count = 0;
        for (Activity act : activities) {
            if (act instanceof ActivityWithoutTrack) count++;
        }
        return count;
    }

    public List<Report> distancesByTypes() {
        List<ActivityType> types = List.of(ActivityType.BIKING, ActivityType.HIKING, ActivityType.RUNNING, ActivityType.BASKETBALL);
        List<Double> distances = Arrays.asList(0.0, 0.0, 0.0, 0.0);
        for (Activity act : activities) {
            for (int i = 0; i < 4; i++) {
                if (types.get(i) == act.getType()) {
                    distances.set(i, distances.get(i) + act.getDistance());
                }
            }
        }
        List<Report> result = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            result.add(new Report(types.get(i), distances.get(i)));
        }
        return result;
    }

}
