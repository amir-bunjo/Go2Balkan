package ba.go2balkan.services.implementations;

import ba.go2balkan.model.cb.CbCreditCard;
import ba.go2balkan.repository.CbCreditCardRepository;
import ba.go2balkan.services.interfaces.CbCreditCardService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CbCreditCardServiceImpl implements CbCreditCardService {

    private final CbCreditCardRepository cbCreditCardRepository;

    public CbCreditCardServiceImpl(CbCreditCardRepository cbCreditCardRepository) {
        this.cbCreditCardRepository = cbCreditCardRepository;
    }

    @Override
    public CbCreditCard saveOrUpdate(CbCreditCard cbCreditCard) {
        return cbCreditCardRepository.save(cbCreditCard);
    }

    @Override
    public boolean delete(CbCreditCard cbCreditCard) {
        try {
            cbCreditCardRepository.delete(cbCreditCard);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public List<CbCreditCard> findAll() {
        return cbCreditCardRepository.findAll();
    }
}
