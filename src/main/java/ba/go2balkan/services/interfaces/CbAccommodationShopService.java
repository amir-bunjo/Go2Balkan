package ba.go2balkan.services.interfaces;

import java.util.List;

import ba.go2balkan.model.cb.CbAccommodationShop;

public interface CbAccommodationShopService {
    CbAccommodationShop saveOrUpdate(CbAccommodationShop cbAccommodationShop);
    boolean delete(CbAccommodationShop cbAccommodationShop);
    List<CbAccommodationShop> findAll();
}
