package ObserverPatternWetterstationPush;

import java.util.ArrayList;
import java.util.List;

public abstract class Wetterstation {
    private final List<ClientPush> clientsPull = new ArrayList<ClientPush>();

    public void registerClient(ClientPush newClient){
        clientsPull.add(newClient);
    }

    public void unregisterClient(ClientPush clientToUnregister){
        clientsPull.remove(clientToUnregister);
    }

    public void notifyClients(int humidity, int temperature){
        for(ClientPush cp : clientsPull){
            cp.update(humidity, temperature);
        }
    }
}
