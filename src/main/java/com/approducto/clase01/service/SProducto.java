package com.approducto.clase01.service;

import java.util.List;
import java.util.Map;

import com.approducto.clase01.entity.TProducto;

public interface SProducto {
	List<Map<String, Object>> readAll();
    int create(TProducto tp);
    int update(TProducto tp);
    int delete(int id);
    TProducto read(int id);
    TProducto searchProducto(String nombre);
}
