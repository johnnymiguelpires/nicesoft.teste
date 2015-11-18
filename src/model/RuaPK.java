/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Bruno Azzi
 */
@Embeddable
public class RuaPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "id")
    private int id;
    @Basic(optional = false)
    @Column(name = "Intendencia_id")
    private int intendenciaid;

    public RuaPK() {
    }

    public RuaPK(int id, int intendenciaid) {
        this.id = id;
        this.intendenciaid = intendenciaid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIntendenciaid() {
        return intendenciaid;
    }

    public void setIntendenciaid(int intendenciaid) {
        this.intendenciaid = intendenciaid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) id;
        hash += (int) intendenciaid;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RuaPK)) {
            return false;
        }
        RuaPK other = (RuaPK) object;
        if (this.id != other.id) {
            return false;
        }
        if (this.intendenciaid != other.intendenciaid) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.RuaPK[ id=" + id + ", intendenciaid=" + intendenciaid + " ]";
    }
    
}
