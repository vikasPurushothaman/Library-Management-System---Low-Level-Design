package library.observer;

public class ReservationNotifier implements  Observer {
    private  String PatronName;

    public ReservationNotifier(String patronName) {
        this.PatronName = patronName;
    }

    @Override
    public void update(String message) {
        System.out.println("Notification to " + PatronName + ": " + message);
    }
}
