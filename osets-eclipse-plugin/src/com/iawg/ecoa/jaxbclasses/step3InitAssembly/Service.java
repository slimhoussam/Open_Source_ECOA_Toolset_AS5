//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.07.20 at 08:12:05 AM BST 
//

package com.iawg.ecoa.jaxbclasses.step3InitAssembly;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for Service complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="Service">
 *   &lt;complexContent>
 *     &lt;extension base="{http://docs.oasis-open.org/ns/opencsa/sca/200912}Contract">
 *       &lt;attribute name="promote" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Service")
public class Service extends Contract {

	@XmlAttribute(name = "promote", required = true)
	@XmlSchemaType(name = "anyURI")
	protected String promote;

	/**
	 * Gets the value of the promote property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPromote() {
		return promote;
	}

	/**
	 * Sets the value of the promote property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPromote(String value) {
		this.promote = value;
	}

}
