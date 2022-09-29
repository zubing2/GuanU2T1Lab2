public class ChatBotRunner {
    public static void main(String[] args) {
        ChatBot debbie = new ChatBot("Debbie", 10);

        debbie.greeting("Zubin");
        debbie.favoriteNumber(13);
        debbie.weather();
        debbie.time();

        String talk = debbie.talk();
        System.out.println(talk);
        double meters = debbie.convertFeetToMeters(150);
        System.out.println("There are " + meters + " in 150 feet.");
        int sum = debbie.addNumbers(7,13,21);
        System.out.println("The sum of your numbers is: " + sum);
        String message = debbie.goodbye();
        System.out.println(message);
    }
}
