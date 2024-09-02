import java.util.ArrayList;
import java.util.EventListener;
import java.util.List;

public class EventManager {
    private List<ListenerEvents> listener = new ArrayList<ListenerEvents>();

    public void subscribe(ListenerEvents suscriber){
        System.out.println("Suscribe\n");
        listener.add(suscriber);
    }
    public void unsubscribe(ListenerEvents suscriber){
        System.out.println("unsuscribe\n");
        listener.remove(suscriber);
    }

    public void notifyListeners(){
        for (ListenerEvents s : listener) {
            s.update("Hola\n");
        }
    }


}
