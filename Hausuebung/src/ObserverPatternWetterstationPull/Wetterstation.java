package ObserverPatternWetterstationPull;

import java.util.ArrayList;
import java.util.List;

public abstract class Wetterstation {
    private final List<ClientPull> clientsPull = new ArrayList<ClientPull>();

    public void registerClient(ClientPull newClient){
        clientsPull.add(newClient);
    }

    public void unregisterClient(ClientPull clientToUnregister){
        clientsPull.remove(clientToUnregister);
    }

    public void notifyClients(Wetter wetter){
        for(ClientPull cp : clientsPull){
            cp.update(wetter);
        }
    }
}
