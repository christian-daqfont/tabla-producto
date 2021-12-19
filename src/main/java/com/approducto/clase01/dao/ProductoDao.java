package com.approducto.clase01.dao;

import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.approducto.clase01.entity.TProducto;


@Repository
public class ProductoDao implements IProducto {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<Map<String, Object>> readAll() {
		return jdbcTemplate.queryForList("select *from producto");
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
