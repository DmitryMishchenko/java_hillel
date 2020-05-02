package l14_l15_listener.animals.observable;

import l14_l15_listener.animals.Animal;

public interface Observer {
    void handle(Animal animal);
}
