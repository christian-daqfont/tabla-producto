/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.approducto.clase01.service;

import com.approducto.clase01.dao.IProducto;
import com.approducto.clase01.entity.TProducto;

import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author admin
 */
@Service
public class ProductoService implements SProducto{
    
    @Autowired
    private IProducto iproducto;

	@Override
	public List<Map<String, Object>> readAll() {
		return iproducto.readAll();
	}

	@Override
	public int create(TProducto tp) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(TProducto tp) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public TProducto read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TProducto searchProducto(String nombre) {
		// TODO Auto-generated method stub
		return null;
	}
    
}
