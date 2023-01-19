
package events;

public class EventHandler {

    public static EventHandler handler;
    public EventImage eventImage;

    public static EventHandler gEventHandler(){
        if (handler==null) {
            handler = new EventHandler();
            
        }
        return handler;
    }
    
    private EventHandler() {
    }
    
    public void addEventHandler(EventImage event){
        this.eventImage = event;
    }
    
    public EventImage getEvent(){
        return eventImage;
    }
}
