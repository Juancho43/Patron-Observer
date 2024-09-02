import java.util.ArrayList;
import java.util.List;

public class data {
    private Editor editor;

    private List<ListenerEvents> listeners = new ArrayList<>();

    public data() {
        editor = new Editor();
        listeners.add(new EmailAlertsListener());
        listeners.add(new EmailAlertsListener());
        listeners.add(new LogginListener());
        listeners.add(new LogginListener());

        editor.events.subscribe(listeners.get(0));
        editor.events.subscribe(listeners.get(1));
        editor.events.subscribe(listeners.get(2));
        editor.events.subscribe(listeners.get(3));
        editor.OpenFile();
        editor.SaveFile();

        editor.events.unsubscribe(listeners.get(2));
    }


    public void play(){

    }
}

