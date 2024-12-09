package cibertec.edu.pe.examen.entity;

import jakarta.persistence.*;
import java.util.Date;


@Entity
@Table(name = "Autor")
public class Autor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idAutor;

    @Column(name = "NomAutor", nullable = false, length = 50)
    private String nomAutor;

    @Column(name = "ApeAutor", nullable = false, length = 50)
    private String apeAutor;

    @Column(name = "FechNacAutor", nullable = false)
    private Date fechNacAutor;

    // Getters y setters
    public Integer getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(Integer idAutor) {
        this.idAutor = idAutor;
    }

    public String getNomAutor() {
        return nomAutor;
    }

    public void setNomAutor(String nomAutor) {
        this.nomAutor = nomAutor;
    }

    public String getApeAutor() {
        return apeAutor;
    }

    public void setApeAutor(String apeAutor) {
        this.apeAutor = apeAutor;
    }

    public Date getFechNacAutor() {
        return fechNacAutor;
    }

    public void setFechNacAutor(Date fechNacAutor) {
        this.fechNacAutor = fechNacAutor;
    }
}
