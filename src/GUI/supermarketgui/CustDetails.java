/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.supermarketgui;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author nayan
 */
@Entity
@Table(name = "cust_details", catalog = "supermarket", schema = "")
@NamedQueries({
    @NamedQuery(name = "CustDetails.findAll", query = "SELECT c FROM CustDetails c"),
    @NamedQuery(name = "CustDetails.findByCustId", query = "SELECT c FROM CustDetails c WHERE c.custDetailsPK.custId = :custId"),
    @NamedQuery(name = "CustDetails.findByCustFirstName", query = "SELECT c FROM CustDetails c WHERE c.custFirstName = :custFirstName"),
    @NamedQuery(name = "CustDetails.findByCustLastName", query = "SELECT c FROM CustDetails c WHERE c.custLastName = :custLastName"),
    @NamedQuery(name = "CustDetails.findByCustMobile", query = "SELECT c FROM CustDetails c WHERE c.custDetailsPK.custMobile = :custMobile"),
    @NamedQuery(name = "CustDetails.findByCustTotalAmt", query = "SELECT c FROM CustDetails c WHERE c.custTotalAmt = :custTotalAmt")})
public class CustDetails implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CustDetailsPK custDetailsPK;
    @Basic(optional = false)
    @Column(name = "cust_first_name")
    private String custFirstName;
    @Basic(optional = false)
    @Column(name = "cust_last_name")
    private String custLastName;
    @Column(name = "cust_total_amt")
    private Integer custTotalAmt;

    public CustDetails() {
    }

    public CustDetails(CustDetailsPK custDetailsPK) {
        this.custDetailsPK = custDetailsPK;
    }

    public CustDetails(CustDetailsPK custDetailsPK, String custFirstName, String custLastName) {
        this.custDetailsPK = custDetailsPK;
        this.custFirstName = custFirstName;
        this.custLastName = custLastName;
    }

    public CustDetails(int custId, int custMobile) {
        this.custDetailsPK = new CustDetailsPK(custId, custMobile);
    }

    public CustDetailsPK getCustDetailsPK() {
        return custDetailsPK;
    }

    public void setCustDetailsPK(CustDetailsPK custDetailsPK) {
        this.custDetailsPK = custDetailsPK;
    }

    public String getCustFirstName() {
        return custFirstName;
    }

    public void setCustFirstName(String custFirstName) {
        String oldCustFirstName = this.custFirstName;
        this.custFirstName = custFirstName;
        changeSupport.firePropertyChange("custFirstName", oldCustFirstName, custFirstName);
    }

    public String getCustLastName() {
        return custLastName;
    }

    public void setCustLastName(String custLastName) {
        String oldCustLastName = this.custLastName;
        this.custLastName = custLastName;
        changeSupport.firePropertyChange("custLastName", oldCustLastName, custLastName);
    }

    public Integer getCustTotalAmt() {
        return custTotalAmt;
    }

    public void setCustTotalAmt(Integer custTotalAmt) {
        Integer oldCustTotalAmt = this.custTotalAmt;
        this.custTotalAmt = custTotalAmt;
        changeSupport.firePropertyChange("custTotalAmt", oldCustTotalAmt, custTotalAmt);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (custDetailsPK != null ? custDetailsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CustDetails)) {
            return false;
        }
        CustDetails other = (CustDetails) object;
        if ((this.custDetailsPK == null && other.custDetailsPK != null) || (this.custDetailsPK != null && !this.custDetailsPK.equals(other.custDetailsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "GUI.supermarketgui.CustDetails[ custDetailsPK=" + custDetailsPK + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
