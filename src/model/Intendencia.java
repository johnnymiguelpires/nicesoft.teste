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
@Table(name = "intendencia", catalog = "nicesoftdb", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Intendencia.findAll", query = "SELECT i FROM Intendencia i"),
    @NamedQuery(name = "Intendencia.findById", query = "SELECT i FROM Intendencia i WHERE i.id = :id"),
    @NamedQuery(name = "Intendencia.findByNome", query = "SELECT i FROM Intendencia i WHERE i.nome = :nome"),
    @NamedQuery(name = "Intendencia.findByQuantidadeDeHabitantes", query = "SELECT i FROM Intendencia i WHERE i.quantidadeDeHabitantes = :quantidadeDeHabitantes"),
    @NamedQuery(name = "Intendencia.findByKmDeExtencao", query = "SELECT i FROM Intendencia i WHERE i.kmDeExtencao = :kmDeExtencao"),
    @NamedQuery(name = "Intendencia.findByAreaAbrangida", query = "SELECT i FROM Intendencia i WHERE i.areaAbrangida = :areaAbrangida")})
public class Intendencia implements Serializable {
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
    @Column(name = "quantidade_de_habitantes")
    private int quantidadeDeHabitantes;
    @Basic(optional = false)
    @Column(name = "km_de_extencao")
    private int kmDeExtencao;
    @Basic(optional = false)
    @Column(name = "area_abrangida")
    private int areaAbrangida;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "intendenciaid", fetch = FetchType.LAZY)
    private List<OrdemDeServico> ordemDeServicoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "intendenciaid", fetch = FetchType.LAZY)
    private List<Cidadao> cidadaoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "intendencia", fetch = FetchType.LAZY)
    private List<Rua> ruaList;

    public Intendencia() {
    }

    public Intendencia(Integer id) {
        this.id = id;
    }

    public Intendencia(String nome, int quantidadeDeHabitantes, int kmDeExtencao, int areaAbrangida) {
        this.nome = nome;
        this.quantidadeDeHabitantes = quantidadeDeHabitantes;
        this.kmDeExtencao = kmDeExtencao;
        this.areaAbrangida = areaAbrangida;
    }

    public Intendencia(Integer id, String nome, int quantidadeDeHabitantes, int kmDeExtencao, int areaAbrangida) {
        this.id = id;
        this.nome = nome;
        this.quantidadeDeHabitantes = quantidadeDeHabitantes;
        this.kmDeExtencao = kmDeExtencao;
        this.areaAbrangida = areaAbrangida;
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

    public int getQuantidadeDeHabitantes() {
        return quantidadeDeHabitantes;
    }

    public void setQuantidadeDeHabitantes(int quantidadeDeHabitantes) {
        this.quantidadeDeHabitantes = quantidadeDeHabitantes;
    }

    public int getKmDeExtencao() {
        return kmDeExtencao;
    }

    public void setKmDeExtencao(int kmDeExtencao) {
        this.kmDeExtencao = kmDeExtencao;
    }

    public int getAreaAbrangida() {
        return areaAbrangida;
    }

    public void setAreaAbrangida(int areaAbrangida) {
        this.areaAbrangida = areaAbrangida;
    }

    @XmlTransient
    public List<OrdemDeServico> getOrdemDeServicoList() {
        return ordemDeServicoList;
    }

    public void setOrdemDeServicoList(List<OrdemDeServico> ordemDeServicoList) {
        this.ordemDeServicoList = ordemDeServicoList;
    }

    @XmlTransient
    public List<Cidadao> getCidadaoList() {
        return cidadaoList;
    }

    public void setCidadaoList(List<Cidadao> cidadaoList) {
        this.cidadaoList = cidadaoList;
    }

    @XmlTransient
    public List<Rua> getRuaList() {
        return ruaList;
    }

    public void setRuaList(List<Rua> ruaList) {
        this.ruaList = ruaList;
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
        if (!(object instanceof Intendencia)) {
            return false;
        }
        Intendencia other = (Intendencia) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Intendencia[ id=" + id + " ]";
    }
    
}
