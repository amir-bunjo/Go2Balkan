package ba.go2balkan.services.interfaces;

import java.util.List;

import ba.go2balkan.model.cb.CbCreditCard;

public interface CbCreditCardService {
    CbCreditCard saveOrUpdate(CbCreditCard cbCreditCard);
    boolean delete(CbCreditCard cbCreditCard);
    List<CbCreditCard> findAll();
}
