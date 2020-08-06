package com.udemy.compras.service;

import com.udemy.compras.persistence.Compra;
import com.udemy.compras.repository.CompraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class CompraService {

    @Autowired
    private CompraRepository rep;

    public Compra findById(Long id){
        return rep.findById(id).orElse(null);
    }

    public List<Compra> findAll(){
        return rep.findAll();
    }

    @Transactional
    public Compra saveCompra(Compra c){
        return rep.save(c);
    }

    @Transactional
    public Boolean deleteById(Long id){
        if (rep.findById(id).isPresent()){
            rep.deleteById(id);
            return true;
        }
        return false;
    }
}
