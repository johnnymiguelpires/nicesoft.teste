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
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
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
@Table(name = "ordem_de_servico", catalog = "nicesoftdb", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OrdemDeServico.findAll", query = "SELECT o FROM OrdemDeServico o"),
    @NamedQuery(name = "OrdemDeServico.findById", query = "SELECT o FROM OrdemDeServico o WHERE o.id = :id"),
    @NamedQuery(name = "OrdemDeServico.findByResponsavelExecucao", query = "SELECT o FROM OrdemDeServico o WHERE o.responsavelExecucao = :responsavelExecucao"),
    @NamedQuery(name = "OrdemDeServico.findByDataExecucao", query = "SELECT o FROM OrdemDeServico o WHERE o.dataExecucao = :dataExecucao"),
    @NamedQuery(name = "OrdemDeServico.findByDataCriacao", query = "SELECT o FROM OrdemDeServico o WHERE o.dataCriacao = :dataCriacao")})
public class OrdemDeServico implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "responsavel_execucao")
    private String responsavelExecucao;
    @Basic(optional = false)
    @Column(name = "data_execucao")
    @Temporal(TemporalType.DATE)
    private Date dataExecucao;
    @Basic(optional = false)
    @Column(name = "data_criacao")
    @Temporal(TemporalType.DATE)
    private Date dataCriacao;
    @OneToMany(mappedBy = "ordemdeservicoid", fetch = FetchType.EAGER)
    private List<Incidente> incidenteList;
    @JoinColumn(name = "Intendencia_id", referencedColumnName = "id")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Intendencia intendenciaid;
    @JoinColumn(name = "Usuario_id", referencedColumnName = "id")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Usuario usuarioid;
    @JoinColumn(name = "Ordem_status_id", referencedColumnName = "id")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private OrdemStatus ordemstatusid;

    public OrdemDeServico() {
    }

    public OrdemDeServico(Integer id) {
        this.id = id;
    }

    public OrdemDeServico(Integer id, String responsavelExecucao, Date dataExecucao, Date dataCriacao) {
        this.id = id;
        this.responsavelExecucao = responsavelExecucao;
        this.dataExecucao = dataExecucao;
        this.dataCriacao = dataCriacao;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getResponsavelExecucao() {
        return responsavelExecucao;
    }

    public void setResponsavelExecucao(String responsavelExecucao) {
        this.responsavelExecucao = responsavelExecucao;
    }

    public Date getDataExecucao() {
        return dataExecucao;
    }

    public void setDataExecucao(Date dataExecucao) {
        this.dataExecucao = dataExecucao;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    @XmlTransient
    public List<Incidente> getIncidenteList() {
        return incidenteList;
    }

    public void setIncidenteList(List<Incidente> incidenteList) {
        this.incidenteList = incidenteList;
    }

    public Intendencia getIntendenciaid() {
        return intendenciaid;
    }

    public void setIntendenciaid(Intendencia intendenciaid) {
        this.intendenciaid = intendenciaid;
    }

    public Usuario getUsuarioid() {
        return usuarioid;
    }

    public void setUsuarioid(Usuario usuarioid) {
        this.usuarioid = usuarioid;
    }

    public OrdemStatus getOrdemstatusid() {
        return ordemstatusid;
    }

    public void setOrdemstatusid(OrdemStatus ordemstatusid) {
        this.ordemstatusid = ordemstatusid;
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
        if (!(object instanceof OrdemDeServico)) {
            return false;
        }
        OrdemDeServico other = (OrdemDeServico) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.OrdemDeServico[ id=" + id + " ]";
    }
    
}
