/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customer.login;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "products", catalog = "tejas316", schema = "public")
@NamedQueries({
    @NamedQuery(name = "Products.findAll", query = "SELECT p FROM Products p"),
    @NamedQuery(name = "Products.findByProdId", query = "SELECT p FROM Products p WHERE p.prodId = :prodId"),
    @NamedQuery(name = "Products.findByCatId", query = "SELECT p FROM Products p WHERE p.catId = :catId"),
    @NamedQuery(name = "Products.findByPname", query = "SELECT p FROM Products p WHERE p.pname = :pname"),
    @NamedQuery(name = "Products.findByPdescription", query = "SELECT p FROM Products p WHERE p.pdescription = :pdescription"),
    @NamedQuery(name = "Products.findByPrice", query = "SELECT p FROM Products p WHERE p.price = :price"),
    @NamedQuery(name = "Products.findByGst", query = "SELECT p FROM Products p WHERE p.gst = :gst"),
    @NamedQuery(name = "Products.findByVat", query = "SELECT p FROM Products p WHERE p.vat = :vat")})
public class Products implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "prod_id")
    private BigDecimal prodId;
    @Column(name = "cat_id")
    private Integer catId;
    @Column(name = "pname")
    private String pname;
    @Column(name = "pdescription")
    private String pdescription;
    @Column(name = "price")
    private BigDecimal price;
    @Column(name = "gst")
    private Integer gst;
    @Column(name = "vat")
    private Integer vat;

    public Products() {
    }

    public Products(BigDecimal prodId) {
        this.prodId = prodId;
    }

    public BigDecimal getProdId() {
        return prodId;
    }

    public void setProdId(BigDecimal prodId) {
        BigDecimal oldProdId = this.prodId;
        this.prodId = prodId;
        changeSupport.firePropertyChange("prodId", oldProdId, prodId);
    }

    public Integer getCatId() {
        return catId;
    }

    public void setCatId(Integer catId) {
        Integer oldCatId = this.catId;
        this.catId = catId;
        changeSupport.firePropertyChange("catId", oldCatId, catId);
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        String oldPname = this.pname;
        this.pname = pname;
        changeSupport.firePropertyChange("pname", oldPname, pname);
    }

    public String getPdescription() {
        return pdescription;
    }

    public void setPdescription(String pdescription) {
        String oldPdescription = this.pdescription;
        this.pdescription = pdescription;
        changeSupport.firePropertyChange("pdescription", oldPdescription, pdescription);
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        BigDecimal oldPrice = this.price;
        this.price = price;
        changeSupport.firePropertyChange("price", oldPrice, price);
    }

    public Integer getGst() {
        return gst;
    }

    public void setGst(Integer gst) {
        Integer oldGst = this.gst;
        this.gst = gst;
        changeSupport.firePropertyChange("gst", oldGst, gst);
    }

    public Integer getVat() {
        return vat;
    }

    public void setVat(Integer vat) {
        Integer oldVat = this.vat;
        this.vat = vat;
        changeSupport.firePropertyChange("vat", oldVat, vat);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (prodId != null ? prodId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Products)) {
            return false;
        }
        Products other = (Products) object;
        if ((this.prodId == null && other.prodId != null) || (this.prodId != null && !this.prodId.equals(other.prodId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "customer.login.Products[ prodId=" + prodId + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
