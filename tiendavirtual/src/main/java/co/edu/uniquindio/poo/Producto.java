package co.edu.uniquindio.poo;

import java.time.LocalDate;

public class Producto {
    public String nombre;
    public String id;
    public int stock;
    public String talla;
    public String color;
    public String descripcion;
    public LocalDate fechaLanzamiento;
    public int precio;
    public CategoriaProducto categoria;
    
    /**
     * Método constructor de la clase Producto
     * @param nombre
     * @param id
     * @param stock
     * @param talla
     * @param color
     * @param descripcion
     * @param fechaLanzamiento
     * @param precio
     * @param categoria
     */
    public Producto(String nombre, String id, int stock, String talla, String color, String descripcion, LocalDate fechaLanzamiento, int precio, CategoriaProducto categoria){
        this.nombre = nombre;
        this.id = id;
        this.stock = stock;
        this.talla = talla;
        this.color = color;
        this.descripcion = descripcion;
        this.fechaLanzamiento = fechaLanzamiento;
        this.precio = precio;
        this.categoria = categoria;
    }


    /*
     * Getters y Setters de la clase Producto
     */
    
    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public void setFechaLanzamiento(LocalDate fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public CategoriaProducto getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaProducto categoria) {
        this.categoria = categoria;
    }


    /**
     * Método toString de la clase Producto
     */
    @Override
    public String toString() {
        return "Producto [nombre=" + nombre + ", id=" + id + ", stock=" + stock + ", talla=" + talla + ", color="
                + color + ", descripcion=" + descripcion + ", fechaLanzamiento=" + fechaLanzamiento + ", precio="
                + precio + ", categoria=" + categoria + "]";
    }

}
