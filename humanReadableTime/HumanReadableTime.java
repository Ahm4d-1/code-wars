public class HumanReadableTime {

    public static void main(String[] args) {
        System.out.println(makeReadable(60));
    }

    public static String makeReadable(int seconds) {
        int hours = seconds / 60 / 60;
        int mins = (seconds / 60) % 60;
        seconds = seconds % 60;

        return String.format("%s:%s:%s", hours >= 10 ? hours : "0" + hours,
                mins >= 10 ? mins : "0" + mins, seconds >= 10 ? seconds : "0" + seconds);
    }
}