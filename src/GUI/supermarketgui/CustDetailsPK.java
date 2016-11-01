/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.supermarketgui;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author nayan
 */
@Embeddable
public class CustDetailsPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "cust_id")
    private int custId;
    @Basic(optional = false)
    @Column(name = "cust_mobile")
    private int custMobile;

    public CustDetailsPK() {
    }

    public CustDetailsPK(int custId, int custMobile) {
        this.custId = custId;
        this.custMobile = custMobile;
    }

    public int getCustId() {
        return custId;
    }

    public void setCustId(int custId) {
        this.custId = custId;
    }

    public int getCustMobile() {
        return custMobile;
    }

    public void setCustMobile(int custMobile) {
        this.custMobile = custMobile;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) custId;
        hash += (int) custMobile;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CustDetailsPK)) {
            return false;
        }
        CustDetailsPK other = (CustDetailsPK) object;
        if (this.custId != other.custId) {
            return false;
        }
        if (this.custMobile != other.custMobile) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "GUI.supermarketgui.CustDetailsPK[ custId=" + custId + ", custMobile=" + custMobile + " ]";
    }
    
}
