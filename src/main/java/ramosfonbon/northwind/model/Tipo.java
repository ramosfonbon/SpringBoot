package ramosfonbon.northwind.model;

import javax.persistence.*;

@Entity
@Table(name = "tipo")
public class Tipo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int tipoId;

    @Column(name = "descripcion")
    private String descripcion;



    public Tipo() {
    }

    public Tipo(int tipoId, String descripcion) {
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

}
