public class Append {
    public static void main(String[] args) {
        Append appender = new Append(); // Create an instance of the Append class
        String result = appender.appendCITE("We do ordinary things, extraordinarily well!");
        System.out.println(result);
    }

    public String appendCITE(String motto) {
        String cite = "CITE:";
        String appended = cite + " " + motto;
        return appended;
    }
}