package ba.go2balkan.services.interfaces;

import java.util.List;

import ba.go2balkan.model.cb.CbTaxe;

public interface CbTaxeService {
    CbTaxe saveOrUpdate(CbTaxe cbTaxe);
    boolean delete(CbTaxe cbTaxe);
    List<CbTaxe> findAll();
}
