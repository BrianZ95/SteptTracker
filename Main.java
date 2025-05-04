public class Main{
    public static void main(String[] args){
         StepTracker test = new StepTracker(10000);
         System.out.println(test.activeDays());
         System.out.println(test.averageSteps());
         test.addDailySteps(9000);
         test.addDailySteps(5000);

         System.out.println(test.activeDays());
         System.out.println(test.averageSteps());
         test.addDailySteps(13000);

         System.out.println(test.activeDays());
         System.out.println(test.averageSteps());

         test.addDailySteps(23000);
         test.addDailySteps(1111);

         System.out.println(test.activeDays());
         System.out.println(test.averageSteps());
    }
}