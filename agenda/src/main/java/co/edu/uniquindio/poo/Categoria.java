
package co.edu.uniquindio.poo;

public enum Categoria {
   
    OFICINA("Oficina"),
    FIESTA("Fiesta"),
    AMIGOS("Amigos"),
     FAMILIA("Familia");
    public String nombreCategoria;
    
    public String getNombreCategoria() {
        return nombreCategoria;
    }

    private Categoria(String nombreCategoria){
        this.nombreCategoria = nombreCategoria;
    }
}
