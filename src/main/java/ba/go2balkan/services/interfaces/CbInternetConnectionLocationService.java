package ba.go2balkan.services.interfaces;

import java.util.List;

import ba.go2balkan.model.cb.CbInternetConnectionLocation;

public interface CbInternetConnectionLocationService {
    CbInternetConnectionLocation saveOrUpdate(CbInternetConnectionLocation cbInternetConnectionLocation);
    boolean delete(CbInternetConnectionLocation cbInternetConnectionLocation);
    List<CbInternetConnectionLocation> findAll();
}
