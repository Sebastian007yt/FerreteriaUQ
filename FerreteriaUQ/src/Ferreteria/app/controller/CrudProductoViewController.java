package Ferreteria.app.controller;

import Ferreteria.app.Excepciones.yaExiste;
import Ferreteria.app.model.Ferreteria;
import Ferreteria.app.model.Producto;

public class CrudProductoViewController {

	ModelFactoryController modelFactoryController;
	Ferreteria ferreteria;

	public CrudProductoViewController() {

		modelFactoryController = ModelFactoryController.getInstance();
		ferreteria = modelFactoryController.getFerreteria();
	}

	public void crearProducto(Producto productoNuevo) throws yaExiste {
		modelFactoryController.crearProducto(productoNuevo);
	}

	public void actualizarProducto(String nombreProducto, int codigoProducto, double precio, String categoria,
			String marca) {
		modelFactoryController.actualizarProducto(nombreProducto, codigoProducto, precio, categoria, marca);
	}
	
	public Boolean eliminarProducto(int codigoProducto){
		return modelFactoryController.eliminarProducto(codigoProducto);
	}
	
	public Producto obtenerProducto(int codigoProducto){
		return modelFactoryController.obtenerProducto(codigoProducto);
	}

	public Ferreteria getFerreteria() {
		return ferreteria;
	}

	public void setFerreteria(Ferreteria ferreteria) {
		this.ferreteria = ferreteria;
	}
}
