package ramosfonbon.northwind.modelrelation;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import javax.persistence.*;

@Entity
@Table(name = "producto")
public class ProductoTipoRelation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int productoId;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "precio")
    private double precio;

    @Column(name = "existencia")
    private int existencia;

    //@JsonBackReference
    @ManyToOne
    @NotFound(action = NotFoundAction.IGNORE)
    @JoinColumn(name = "tipoId")
    private TipoBaseRelation tipo;

    public ProductoTipoRelation() {
    }


    public ProductoTipoRelation(int productoId, String nombre, double precio, int existencia,
                                TipoBaseRelation tipo) {
        this.productoId = productoId;
        this.nombre = nombre;
        this.precio = precio;
        this.existencia = existencia;
        this.tipo = tipo;
    }

    public int getProductoId() {
        return productoId;
    }

    public void setProductoId(int productoId) {
        this.productoId = productoId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getExistencia() {
        return existencia;
    }

    public void setExistencia(int existencia) {
        this.existencia = existencia;
    }

    public TipoBaseRelation getTipo() {
        return tipo;
    }

    public void setTipo(TipoBaseRelation tipo) {
        this.tipo = tipo;
    }


}
