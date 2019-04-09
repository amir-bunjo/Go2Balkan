package ba.go2balkan.services.implementations;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.stereotype.Service;

import ba.go2balkan.model.client.Client;
import ba.go2balkan.repository.ClientRepository;
import ba.go2balkan.services.interfaces.ClientService;

@Service
public class ClientServiceImpl implements ClientService {
	
	private final ClientRepository clientRepository;

	public ClientServiceImpl(ClientRepository clientRepository) {
		this.clientRepository = clientRepository;
	}

	@Override
	public Client saveOrUpdate(Client client) {
		return clientRepository.save(client);
	}

	@Override
	public boolean delete(Client client) {

		try {
			clientRepository.delete(client);
			return true;
		} catch (Exception e){
			return false;
		}
	}

	@Override
	public List<Client> findAll() {

		return StreamSupport.stream(
				clientRepository.findAll().spliterator(), false)
				.collect(Collectors.toList());
	}
	
	
}
