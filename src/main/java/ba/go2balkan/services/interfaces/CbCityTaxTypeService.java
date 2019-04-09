package ba.go2balkan.services.interfaces;

import java.util.List;

import ba.go2balkan.model.cb.CbCityTaxType;

public interface CbCityTaxTypeService {
    CbCityTaxType saveOrUpdate(CbCityTaxType cbCityTaxType);
    boolean delete(CbCityTaxType cbCityTaxType);
    List<CbCityTaxType> findAll();
}
