package ba.go2balkan.services.interfaces;

import java.util.List;

import ba.go2balkan.model.cb.CbInternetConnectionType;

public interface CbInternetConnectionTypeService {
    CbInternetConnectionType saveOrUpdate(CbInternetConnectionType cbInternetConnectionType);
    boolean delete(CbInternetConnectionType cbInternetConnectionType);
    List<CbInternetConnectionType> findAll();
}
