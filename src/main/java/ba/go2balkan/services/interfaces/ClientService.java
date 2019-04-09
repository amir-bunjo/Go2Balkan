package ba.go2balkan.services.interfaces;

import java.util.List;

import ba.go2balkan.model.client.Client;

public interface ClientService {
	Client saveOrUpdate(Client client);
	boolean delete(Client client);
	List<Client> findAll();
}
