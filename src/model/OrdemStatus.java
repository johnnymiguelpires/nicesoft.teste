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
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name = "ordem_status", catalog = "nicesoftdb", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OrdemStatus.findAll", query = "SELECT o FROM OrdemStatus o"),
    @NamedQuery(name = "OrdemStatus.findById", query = "SELECT o FROM OrdemStatus o WHERE o.id = :id"),
    @NamedQuery(name = "OrdemStatus.findByStatus", query = "SELECT o FROM OrdemStatus o WHERE o.status = :status")})
public class OrdemStatus implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "status")
    private String status;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ordemstatusid", fetch = FetchType.EAGER)
    private List<OrdemDeServico> ordemDeServicoList;

    public OrdemStatus() {
    }

    public OrdemStatus(Integer id) {
        this.id = id;
    }

    public OrdemStatus(Integer id, String status) {
        this.id = id;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @XmlTransient
    public List<OrdemDeServico> getOrdemDeServicoList() {
        return ordemDeServicoList;
    }

    public void setOrdemDeServicoList(List<OrdemDeServico> ordemDeServicoList) {
        this.ordemDeServicoList = ordemDeServicoList;
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
        if (!(object instanceof OrdemStatus)) {
            return false;
        }
        OrdemStatus other = (OrdemStatus) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.OrdemStatus[ id=" + id + " ]";
    }
    
}
