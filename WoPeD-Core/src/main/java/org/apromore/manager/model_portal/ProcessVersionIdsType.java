
package org.apromore.manager.model_portal;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for ProcessVersion_idsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProcessVersion_idsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProcessVersion_id" type="{http://www.apromore.org/manager/model_portal}ProcessVersion_idType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProcessVersion_idsType", propOrder = {
    "processVersionId"
})
public class ProcessVersionIdsType {

    @XmlElement(name = "ProcessVersion_id", required = true)
    protected List<ProcessVersionIdType> processVersionId;

    /**
     * Gets the value of the processVersionId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the processVersionId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProcessVersionId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProcessVersionIdType }
     * 
     * 
     */
    public List<ProcessVersionIdType> getProcessVersionId() {
        if (processVersionId == null) {
            processVersionId = new ArrayList<ProcessVersionIdType>();
        }
        return this.processVersionId;
    }

}
