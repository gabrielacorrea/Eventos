package com.eventos.ED;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@SequenceGenerator(name = "SEQ_EVENTOS", sequenceName = "SEQ_EVENTOS", initialValue = 1, allocationSize = 1)
@Table(name = "EVENTOS")
public class EventosED implements Serializable {

    private static final long serialVersionUID = 1L;
    private Long idEvento;
    private String titulo;
    private String dataEvento;
    private String hrInicio;
    private String hrFim;
    private String nomeLocal;
    private String enderecoEvento;
    private String imagem;
    private String descricaoEvento;
    private String precoIngresso;
    private String enderecoCompra;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_EVENTOS")
    public Long getIdEvento() {
        return idEvento;
    }

    public void setIdEvento(Long idEvento) {
        this.idEvento = idEvento;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDataEvento() {
        return dataEvento;
    }

    public void setDataEvento(String dataEvento) {
        this.dataEvento = dataEvento;
    }

    public String getHrInicio() {
        return hrInicio;
    }

    public void setHrInicio(String hrInicio) {
        this.hrInicio = hrInicio;
    }

    public String getHrFim() {
        return hrFim;
    }

    public void setHrFim(String hrFim) {
        this.hrFim = hrFim;
    }

    public String getNomeLocal() {
        return nomeLocal;
    }

    public void setNomeLocal(String nomeLocal) {
        this.nomeLocal = nomeLocal;
    }

    public String getEnderecoEvento() {
        return enderecoEvento;
    }

    public void setEnderecoEvento(String enderecoEvento) {
        this.enderecoEvento = enderecoEvento;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public String getDescricaoEvento() {
        return descricaoEvento;
    }

    public String getPrecoIngresso() {
        return precoIngresso;
    }

    public void setPrecoIngresso(String precoIngresso) {
        this.precoIngresso = precoIngresso;
    }

    public String getEnderecoCompra() {
        return enderecoCompra;
    }

    public void setEnderecoCompra(String enderecoCompra) {
        this.enderecoCompra = enderecoCompra;
    }

    public void setDescricaoEvento(String descricaoEvento) {
        this.descricaoEvento = descricaoEvento;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + (this.idEvento != null ? this.idEvento.hashCode() : 0);
        hash = 83 * hash + (this.titulo != null ? this.titulo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final EventosED other = (EventosED) obj;
        if (this.idEvento != other.idEvento && (this.idEvento == null || !this.idEvento.equals(other.idEvento))) {
            return false;
        }
        if ((this.titulo == null) ? (other.titulo != null) : !this.titulo.equals(other.titulo)) {
            return false;
        }
        if ((this.precoIngresso == null) ? (other.precoIngresso != null) : !this.precoIngresso.equals(other.precoIngresso)) {
            return false;
        }
        return true;
    }
}
