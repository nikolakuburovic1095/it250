/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.methotels.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import org.apache.tapestry5.beaneditor.Validate;
import org.apache.tapestry5.ioc.annotations.Inject;

/**
 *
 * @author ubuntu
 */
@Entity
@Table(name = "soba")
@NamedQueries({
    @NamedQuery(name = "Soba.findAll", query = "SELECT s FROM Soba s")})
public class Soba implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Validate("required, max=900")
    @Column(name = "ID_Soba")
    private Integer iDSoba;
    
    @Basic(optional = false)
    @Validate("required, minLength=5")
    @Column(name = "Ime")
    private String ime;
    
    @Basic(optional = false)
    @Validate("required, max=9")
    @Column(name = "Sprat")
    private int sprat;
    
    @Basic(optional = false)
    @Validate("required, minLength=2")
    @Column(name = "TV")
    private String tv;
    
    @Basic(optional = false)
    @Validate("required, minLength=2")
    @Column(name = "Internet")
    private String internet;
    
    @Basic(optional = false)
    @Validate("required, minLength=2")
    @Column(name = "Djakuzi")
    private String djakuzi;

    @Inject
    public Soba() {
    }

    public Soba(Integer iDSoba) {
        this.iDSoba = iDSoba;
    }

    public Soba(Integer iDSoba, String ime, int sprat, String tv, String internet, String djakuzi) {
        this.iDSoba = iDSoba;
        this.ime = ime;
        this.sprat = sprat;
        this.tv = tv;
        this.internet = internet;
        this.djakuzi = djakuzi;
    }

    public Integer getIDSoba() {
        return iDSoba;
    }

    public void setIDSoba(Integer iDSoba) {
        this.iDSoba = iDSoba;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public int getSprat() {
        return sprat;
    }

    public void setSprat(int sprat) {
        this.sprat = sprat;
    }

    public String getTv() {
        return tv;
    }

    public void setTv(String tv) {
        this.tv = tv;
    }

    public String getInternet() {
        return internet;
    }

    public void setInternet(String internet) {
        this.internet = internet;
    }

    public String getDjakuzi() {
        return djakuzi;
    }

    public void setDjakuzi(String djakuzi) {
        this.djakuzi = djakuzi;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDSoba != null ? iDSoba.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Soba)) {
            return false;
        }
        Soba other = (Soba) object;
        if ((this.iDSoba == null && other.iDSoba != null) || (this.iDSoba != null && !this.iDSoba.equals(other.iDSoba))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.methotels.entities.Soba[ iDSoba=" + iDSoba + " ]";
    }
    
}
