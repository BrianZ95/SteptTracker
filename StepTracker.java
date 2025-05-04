public class StepTracker{
    private int minSteps;
    private int active;
    private int totalDays;
    private int totalSteps;
    public StepTracker(int steps){
        minSteps = steps;
        active = 0;
        totalDays = 0;
        totalSteps = 0;
    }

    public void addDailySteps(int num){
        if (num >= minSteps) active++;
        totalSteps += num;
        totalDays++;
    }

    public int activeDays(){
        return active;
    }

    public double averageSteps(){
        if (totalDays == 0) return 0;
        return ((double) totalSteps) / totalDays; 
    }
}