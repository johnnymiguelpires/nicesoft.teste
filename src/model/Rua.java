/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Bruno Azzi
 */
@Entity
@Table(name = "rua", catalog = "nicesoftdb", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Rua.findAll", query = "SELECT r FROM Rua r"),
    @NamedQuery(name = "Rua.findById", query = "SELECT r FROM Rua r WHERE r.ruaPK.id = :id"),
    @NamedQuery(name = "Rua.findByDescricao", query = "SELECT r FROM Rua r WHERE r.descricao = :descricao"),
    @NamedQuery(name = "Rua.findByIntendenciaid", query = "SELECT r FROM Rua r WHERE r.ruaPK.intendenciaid = :intendenciaid")})
public class Rua implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected RuaPK ruaPK;
    @Basic(optional = false)
    @Column(name = "descricao")
    private String descricao;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "rua", fetch = FetchType.EAGER)
    private List<Incidente> incidenteList;
    @JoinColumn(name = "Tipo_rua_id", referencedColumnName = "id")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private TipoRua tiporuaid;
    @JoinColumn(name = "Intendencia_id", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Intendencia intendencia;

    public Rua() {
    }

    public Rua(RuaPK ruaPK) {
        this.ruaPK = ruaPK;
    }

    public Rua(RuaPK ruaPK, String descricao) {
        this.ruaPK = ruaPK;
        this.descricao = descricao;
    }

    public Rua(int id, int intendenciaid) {
        this.ruaPK = new RuaPK(id, intendenciaid);
    }

    public RuaPK getRuaPK() {
        return ruaPK;
    }

    public void setRuaPK(RuaPK ruaPK) {
        this.ruaPK = ruaPK;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @XmlTransient
    public List<Incidente> getIncidenteList() {
        return incidenteList;
    }

    public void setIncidenteList(List<Incidente> incidenteList) {
        this.incidenteList = incidenteList;
    }

    public TipoRua getTiporuaid() {
        return tiporuaid;
    }

    public void setTiporuaid(TipoRua tiporuaid) {
        this.tiporuaid = tiporuaid;
    }

    public Intendencia getIntendencia() {
        return intendencia;
    }

    public void setIntendencia(Intendencia intendencia) {
        this.intendencia = intendencia;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ruaPK != null ? ruaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Rua)) {
            return false;
        }
        Rua other = (Rua) object;
        if ((this.ruaPK == null && other.ruaPK != null) || (this.ruaPK != null && !this.ruaPK.equals(other.ruaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Rua[ ruaPK=" + ruaPK + " ]";
    }
    
}
