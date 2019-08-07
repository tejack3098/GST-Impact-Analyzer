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
@Table(name = "orders", catalog = "tejas316", schema = "public")
@NamedQueries({
    @NamedQuery(name = "Orders_1.findAll", query = "SELECT o FROM Orders_1 o"),
    @NamedQuery(name = "Orders_1.findByOrdId", query = "SELECT o FROM Orders_1 o WHERE o.ordId = :ordId"),
    @NamedQuery(name = "Orders_1.findByProdId", query = "SELECT o FROM Orders_1 o WHERE o.prodId = :prodId"),
    @NamedQuery(name = "Orders_1.findByPname", query = "SELECT o FROM Orders_1 o WHERE o.pname = :pname"),
    @NamedQuery(name = "Orders_1.findByPrice", query = "SELECT o FROM Orders_1 o WHERE o.price = :price"),
    @NamedQuery(name = "Orders_1.findByGst", query = "SELECT o FROM Orders_1 o WHERE o.gst = :gst"),
    @NamedQuery(name = "Orders_1.findByVat", query = "SELECT o FROM Orders_1 o WHERE o.vat = :vat")})
public class Orders_1 implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ord_id")
    private Integer ordId;
    @Column(name = "prod_id")
    private Integer prodId;
    @Column(name = "pname")
    private String pname;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "price")
    private BigDecimal price;
    @Column(name = "gst")
    private Integer gst;
    @Column(name = "vat")
    private Integer vat;

    public Orders_1() {
    }

    public Orders_1(Integer ordId) {
        this.ordId = ordId;
    }

    public Integer getOrdId() {
        return ordId;
    }

    public void setOrdId(Integer ordId) {
        Integer oldOrdId = this.ordId;
        this.ordId = ordId;
        changeSupport.firePropertyChange("ordId", oldOrdId, ordId);
    }

    public Integer getProdId() {
        return prodId;
    }

    public void setProdId(Integer prodId) {
        Integer oldProdId = this.prodId;
        this.prodId = prodId;
        changeSupport.firePropertyChange("prodId", oldProdId, prodId);
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        String oldPname = this.pname;
        this.pname = pname;
        changeSupport.firePropertyChange("pname", oldPname, pname);
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
        hash += (ordId != null ? ordId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Orders_1)) {
            return false;
        }
        Orders_1 other = (Orders_1) object;
        if ((this.ordId == null && other.ordId != null) || (this.ordId != null && !this.ordId.equals(other.ordId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "customer.login.Orders_1[ ordId=" + ordId + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
