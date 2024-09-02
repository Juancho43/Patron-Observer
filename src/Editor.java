public class Editor {
    public EventManager events;
    public Editor() {
        this.events = new EventManager();
    }
    public void OpenFile(){
        System.out.println("Abrir archivo");
        events.notifyListeners();
    }
    public void SaveFile(){
        System.out.println("Guardar archivo");
        events.notifyListeners();
    }
}
