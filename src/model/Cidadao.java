/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Bruno Azzi
 */
@Entity
@Table(name = "cidadao", catalog = "nicesoftdb", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cidadao.findAll", query = "SELECT c FROM Cidadao c"),
    @NamedQuery(name = "Cidadao.findById", query = "SELECT c FROM Cidadao c WHERE c.id = :id"),
    @NamedQuery(name = "Cidadao.findByNome", query = "SELECT c FROM Cidadao c WHERE c.nome = :nome"),
    @NamedQuery(name = "Cidadao.findByEndereco", query = "SELECT c FROM Cidadao c WHERE c.endereco = :endereco"),
    @NamedQuery(name = "Cidadao.findByTelefone", query = "SELECT c FROM Cidadao c WHERE c.telefone = :telefone"),
    @NamedQuery(name = "Cidadao.findByEmail", query = "SELECT c FROM Cidadao c WHERE c.email = :email"),
    @NamedQuery(name = "Cidadao.findByCpf", query = "SELECT c FROM Cidadao c WHERE c.cpf = :cpf")})
public class Cidadao implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "nome")
    private String nome;
    @Basic(optional = false)
    @Column(name = "endereco")
    private String endereco;
    @Basic(optional = false)
    @Column(name = "telefone")
    private String telefone;
    @Column(name = "email")
    private String email;
    @Basic(optional = false)
    @Column(name = "cpf")
    private String cpf;
    @JoinTable(name = "incidente_has_cidadao", joinColumns = {
        @JoinColumn(name = "Cidadao_id", referencedColumnName = "id")}, inverseJoinColumns = {
        @JoinColumn(name = "Incidente_id", referencedColumnName = "id")})
    @ManyToMany(fetch = FetchType.EAGER)
    private List<Incidente> incidenteList;
    @JoinColumn(name = "Intendencia_id", referencedColumnName = "id")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Intendencia intendenciaid;

    public Cidadao() {
    }

    public Cidadao(Integer id) {
        this.id = id;
    }

    public Cidadao(Integer id, String nome, String endereco, String telefone, String cpf) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.cpf = cpf;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cidadao)) {
            return false;
        }
        Cidadao other = (Cidadao) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Cidadao[ id=" + id + " ]";
    }
    
}
