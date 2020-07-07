package com.cibertec.interfaces;

import java.util.List;

import com.cibertec.entidad.Producto;

public interface ProductoDAO {
	public int addProducto(Producto pro);

	public int updateProducto(Producto pro);

	public int deleteProducto(int id);

	public List<Producto> listProducto();
}