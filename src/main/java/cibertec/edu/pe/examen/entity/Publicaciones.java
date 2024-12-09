package cibertec.edu.pe.examen.entity;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Publicacion")
public class Publicaciones {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idPublicacion;

    @Column(name = "Titulo", nullable = false, length = 250)
    private String titulo;

    @Column(name = "Resumen", nullable = false, length = 250)
    private String resumen;

    @Column(name = "FechPublicacion", nullable = false)
    private Date fechPublicacion;

    @ManyToOne
    @JoinColumn(name = "IdAutor", nullable = false)
    private Autor autor;

    // Getters y setters
    public Integer getIdPublicacion() {
        return idPublicacion;
    }

    public void setIdPublicacion(Integer idPublicacion) {
        this.idPublicacion = idPublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    public Date getFechPublicacion() {
        return fechPublicacion;
    }

    public void setFechPublicacion(Date fechPublicacion) {
        this.fechPublicacion = fechPublicacion;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }
}
