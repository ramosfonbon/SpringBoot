package ramosfonbon.northwind.modelrelation;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "tipo")
public class TipoRelation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int tipoId;

    @Column(name = "descripcion")
    private String descripcion;


    @JsonManagedReference
    @OneToMany(mappedBy = "tipo", fetch = FetchType.LAZY,
            cascade = CascadeType.DETACH, orphanRemoval = false)
    private Set<ProductoRelation> productos;

    public TipoRelation() {
    }

    public TipoRelation(int tipoId, String descripcion) {
        this.tipoId = tipoId;
        this.descripcion = descripcion;
    }

    public int getTipoId() {
        return tipoId;
    }

    public void setTipoId(int tipoId) {
        this.tipoId = tipoId;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

  /*  public Set<ProductoRelation> getProductos() {
        return productos;
    }

    public void setProductos(Set<ProductoRelation> productos) {
        this.productos = productos;
    }
*/
}

