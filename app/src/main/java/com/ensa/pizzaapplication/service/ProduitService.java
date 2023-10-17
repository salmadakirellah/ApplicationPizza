package com.ensa.pizzaapplication.service;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;
import com.ensa.pizzaapplication.classes.Produit;
import com.ensa.pizzaapplication.dao.IDao;

public class ProduitService implements IDao<Produit> {
    private List<Produit> prods;

    public ProduitService() {
        prods = new ArrayList<>();
        // Vous pouvez ajouter des produits initiaux si nécessaire
    }
    @Override
    public boolean create(Produit o) {
        Log.d("Create : ", o.toString());
        return prods.add(o);
    }

    @Override
    public Produit findById(int id) {
        Log.d("FindById : ", id+"");
        for(Produit f : prods)
            if(f.getId() == id)
                return f;
        return null;
    }

    @Override
    public List<Produit> findAll() {
        Log.d("findAll : ", prods.size()+"");
        return prods;
    }

    @Override
    public boolean delete(Produit o) {
        Log.d("Delete : ", o.toString());
        return prods.remove(o);
    }

    @Override
    public boolean update(Produit o) {
        Produit f = findById(o.getId());
        f.setNom(o.getNom());
        f.setPhoto(o.getPhoto());
        f.setNbringredients(o.getNbringredients());
        f.setDuree(o.getDuree());
        f.setDetailsingred(o.getDetailsingred());
        f.setPreparation (o.getPreparation());
        f.setComp(o.getComp());
        f.setDescription(o.getDescription());
        return false;
    }
}
