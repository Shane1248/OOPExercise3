public class Main {
    public static void main(String[] args) {
        Subject math = new Subject("monday");

        Teacher teacher = new Teacher();
        math = new Subject("friday", teacher);
     
        //System.out.println(math.present());
		System.out.println(math.getSchedule());
    }
}
