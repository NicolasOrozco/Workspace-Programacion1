package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;

public class Tienda {
    public String nombre;
    public Collection<Producto> productos;
    public Collection<Proveedor> proveedores;

    /**
     * Método constructor de la clase tienda
     * @param nombre
     */
    public Tienda(String nombre){
        this.nombre = nombre;
        productos = new LinkedList<>();
        proveedores = new LinkedList<>();
    }

    /**
     * Método para evitar la duplicación de productos
     * @param id
     * @return
     */
    public boolean verificarProducto(String id){
        boolean centinela = false;
        for(Producto producto : productos){
            if(producto.getId().equals(id)){
                centinela = true;
                break;
            }
        }
        return centinela;
    }

    /**
     * Método para agregar un nuevo producto
     * @param producto
     */
    public void agregarProducto(Producto producto){
        if(!verificarProducto(producto.getId())){
            productos.add(producto);
        }
    }

    /**
     * Método para eliminar un producto de la lista de productos
     * @param id
     */
    public void eliminarProducto(String id){
        for(Producto producto : productos){
            if(producto.getId().equals(id)){
                productos.remove(producto);
                break;
            }
        }
    }

    /**
     *Método para evitar la duplicación de proveedores
     * @param id
     * @return
     */
    public boolean verificarProveedor(String id){
        boolean centinela = false;
        for(Proveedor proveedor : proveedores){
            if(proveedor.getId().equals(id)){
                centinela = true;
                break;
            }
        }
        return centinela;
    }

    /**
     * Método para agregar un nuevo proveedor
     * @param proveedor
     */
    public void agregarProveedor(Proveedor proveedor){
        if(!verificarProveedor(proveedor.getId())){
            proveedores.add(proveedor);
        }
    }

    /**
     * Método para eliminar un proveedor de la lista de proveedores
     * @param id
     */
    public void eliminarProveedor(String id){
        for(Proveedor proveedor : proveedores){
            if(proveedor.getId().equals(id)){
                proveedores.remove(proveedor);
                break;
            }
        }
    }

    /*
     * Getters y Setters de la clase Tienda
     */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Collection<Producto> getProductos() {
        return productos;
    }

    public void setProductos(Collection<Producto> productos) {
        this.productos = productos;
    }

    public Collection<Proveedor> getProveedores() {
        return proveedores;
    }

    public void setProveedores(Collection<Proveedor> proveedores) {
        this.proveedores = proveedores;
    }

    /**
     * Método toString de la clase Tienda
     */
    @Override
    public String toString() {
        return "Tienda [nombre=" + nombre + ", productos=" + productos + ", proveedores=" + proveedores + "]";
    }
 
    
    
    

}
