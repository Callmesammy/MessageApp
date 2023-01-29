
package Handdlers;


public class eventHanderl {
    
    public static eventHanderl Instance;

    eventImage imageEvent;
    
    public static eventHanderl getInstance(){
        if (Instance == null) {
            Instance = new eventHanderl();
        }
        return Instance;
}
    
    private eventHanderl() {
    }
    
    public void addEventImage(eventImage event){
        this.imageEvent = event;
    }
    
    public eventImage getEventImage(){
        return imageEvent;
    }
}
