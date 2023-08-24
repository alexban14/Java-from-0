public class Gorilla {
    public static int count;
    public static void addGorilla() {
        count++;
    }
    public void babyGorilla() {
        count++;
    }
    public void announcedBabies() {
        // fine because an instance method can call a static method
        addGorilla();
        babyGorilla();
    }
    public int total;
    public static void announcedBabiesToEveryone() {
        addGorilla();
        babyGorilla(); // DOES NOT COMPILE
                       // a static method cannot call an instance method
    }
    public int total;
    public static average = total / count; //DOES NOT COMPILE
                                           // a static method cannot call an instance method
