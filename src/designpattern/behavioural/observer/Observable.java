package designpattern.behavioural.observer;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Observable {

    private List<Observer> mesObservateurs;

    public Observable() {
        mesObservateurs = new LinkedList<>();
    }

    protected void notifyObservers(){

        /*for(Observer unObserver : mesObservateurs){
            unObserver.update();
        }*/

        mesObservateurs.forEach(Observer::update);
    }

    public void addObserver(Observer unObserver){
        if (Objects.nonNull(unObserver) && !mesObservateurs.contains(unObserver)) {
            mesObservateurs.add(unObserver);
        }
    }

    public void removeObserver(Observer unObserver){
        if (//mesObservateurs.contains(unObserver)&&
                Objects.nonNull(unObserver)
        ){
            mesObservateurs.remove(unObserver);
        }
    }
}
