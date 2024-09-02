public class LogginListener implements ListenerEvents{
    @Override
    public void update(String filename) {
        System.out.println(filename);
    }
}
