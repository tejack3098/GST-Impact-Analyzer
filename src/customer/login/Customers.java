/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customer.login;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author tejas
 */
@Entity
@Table(name = "customers", catalog = "tejas316", schema = "public")
@NamedQueries({
    @NamedQuery(name = "Customers.findAll", query = "SELECT c FROM Customers c"),
    @NamedQuery(name = "Customers.findByCustId", query = "SELECT c FROM Customers c WHERE c.custId = :custId"),
    @NamedQuery(name = "Customers.findByForname", query = "SELECT c FROM Customers c WHERE c.forname = :forname"),
    @NamedQuery(name = "Customers.findBySurname", query = "SELECT c FROM Customers c WHERE c.surname = :surname"),
    @NamedQuery(name = "Customers.findByAddress", query = "SELECT c FROM Customers c WHERE c.address = :address"),
    @NamedQuery(name = "Customers.findByPostcode", query = "SELECT c FROM Customers c WHERE c.postcode = :postcode"),
    @NamedQuery(name = "Customers.findByPhone", query = "SELECT c FROM Customers c WHERE c.phone = :phone"),
    @NamedQuery(name = "Customers.findByEmail", query = "SELECT c FROM Customers c WHERE c.email = :email")})
public class Customers implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "cust_id")
    private Integer custId;
    @Basic(optional = false)
    @Column(name = "forname")
    private String forname;
    @Basic(optional = false)
    @Column(name = "surname")
    private String surname;
    @Basic(optional = false)
    @Column(name = "address")
    private String address;
    @Basic(optional = false)
    @Column(name = "postcode")
    private String postcode;
    @Basic(optional = false)
    @Column(name = "phone")
    private String phone;
    @Basic(optional = false)
    @Column(name = "email")
    private String email;

    public Customers() {
    }

    public Customers(Integer custId) {
        this.custId = custId;
    }

    public Customers(Integer custId, String forname, String surname, String address, String postcode, String phone, String email) {
        this.custId = custId;
        this.forname = forname;
        this.surname = surname;
        this.address = address;
        this.postcode = postcode;
        this.phone = phone;
        this.email = email;
    }

    public Integer getCustId() {
        return custId;
    }

    public void setCustId(Integer custId) {
        Integer oldCustId = this.custId;
        this.custId = custId;
        changeSupport.firePropertyChange("custId", oldCustId, custId);
    }

    public String getForname() {
        return forname;
    }

    public void setForname(String forname) {
        String oldForname = this.forname;
        this.forname = forname;
        changeSupport.firePropertyChange("forname", oldForname, forname);
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        String oldSurname = this.surname;
        this.surname = surname;
        changeSupport.firePropertyChange("surname", oldSurname, surname);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        String oldAddress = this.address;
        this.address = address;
        changeSupport.firePropertyChange("address", oldAddress, address);
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        String oldPostcode = this.postcode;
        this.postcode = postcode;
        changeSupport.firePropertyChange("postcode", oldPostcode, postcode);
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        String oldPhone = this.phone;
        this.phone = phone;
        changeSupport.firePropertyChange("phone", oldPhone, phone);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        String oldEmail = this.email;
        this.email = email;
        changeSupport.firePropertyChange("email", oldEmail, email);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (custId != null ? custId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Customers)) {
            return false;
        }
        Customers other = (Customers) object;
        if ((this.custId == null && other.custId != null) || (this.custId != null && !this.custId.equals(other.custId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "customer.login.Customers[ custId=" + custId + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
