/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Bruno Azzi
 */
@Entity
@Table(name = "incidente", catalog = "nicesoftdb", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Incidente.findAll", query = "SELECT i FROM Incidente i"),
    @NamedQuery(name = "Incidente.findById", query = "SELECT i FROM Incidente i WHERE i.id = :id"),
    @NamedQuery(name = "Incidente.findByDescricao", query = "SELECT i FROM Incidente i WHERE i.descricao = :descricao"),
    @NamedQuery(name = "Incidente.findByDataCriacao", query = "SELECT i FROM Incidente i WHERE i.dataCriacao = :dataCriacao")})
public class Incidente implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "descricao")
    private String descricao;
    @Basic(optional = false)
    @Column(name = "data_criacao")
    @Temporal(TemporalType.DATE)
    private Date dataCriacao;
    @ManyToMany(mappedBy = "incidenteList", fetch = FetchType.EAGER)
    private List<Cidadao> cidadaoList;
    @JoinColumn(name = "Ordem_de_servico_id", referencedColumnName = "id")
    @ManyToOne(fetch = FetchType.EAGER)
    private OrdemDeServico ordemdeservicoid;
    @JoinColumn(name = "Usuario_id", referencedColumnName = "id")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Usuario usuarioid;
    @JoinColumn(name = "Prioridade_id", referencedColumnName = "id")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Prioridade prioridadeid;
    @JoinColumns({
        @JoinColumn(name = "Rua_id", referencedColumnName = "id"),
        @JoinColumn(name = "Rua_Intendencia_id", referencedColumnName = "Intendencia_id")})
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Rua rua;

    public Incidente() {
    }

    public Incidente(Integer id) {
        this.id = id;
    }

    public Incidente(Integer id, String descricao, Date dataCriacao) {
        this.id = id;
        this.descricao = descricao;
        this.dataCriacao = dataCriacao;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    @XmlTransient
    public List<Cidadao> getCidadaoList() {
        return cidadaoList;
    }

    public void setCidadaoList(List<Cidadao> cidadaoList) {
        this.cidadaoList = cidadaoList;
    }

    public OrdemDeServico getOrdemdeservicoid() {
        return ordemdeservicoid;
    }

    public void setOrdemdeservicoid(OrdemDeServico ordemdeservicoid) {
        this.ordemdeservicoid = ordemdeservicoid;
    }

    public Usuario getUsuarioid() {
        return usuarioid;
    }

    public void setUsuarioid(Usuario usuarioid) {
        this.usuarioid = usuarioid;
    }

    public Prioridade getPrioridadeid() {
        return prioridadeid;
    }

    public void setPrioridadeid(Prioridade prioridadeid) {
        this.prioridadeid = prioridadeid;
    }

    public Rua getRua() {
        return rua;
    }

    public void setRua(Rua rua) {
        this.rua = rua;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Incidente)) {
            return false;
        }
        Incidente other = (Incidente) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Incidente[ id=" + id + " ]";
    }
    
}
