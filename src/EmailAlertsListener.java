public class EmailAlertsListener implements ListenerEvents{
    @Override
    public void update(String filename) {
        System.out.println(filename);

    }
}
