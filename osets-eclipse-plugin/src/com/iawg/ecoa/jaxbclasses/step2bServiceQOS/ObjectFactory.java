//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.07.20 at 08:12:04 AM BST 
//

package com.iawg.ecoa.jaxbclasses.step2bServiceQOS;

import javax.xml.bind.annotation.XmlRegistry;

/**
 * This object contains factory methods for each Java content interface and Java
 * element interface generated in the com.iawg.ecoa.jaxbclasses.step2bServiceQOS
 * package.
 * <p>
 * An ObjectFactory allows you to programatically construct new instances of the
 * Java representation for XML content. The Java representation of XML content
 * can consist of schema derived interfaces and classes representing the binding
 * of schema type definitions, element declarations and model groups. Factory
 * methods for each of these are provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

	/**
	 * Create a new ObjectFactory that can be used to create new instances of
	 * schema derived classes for package:
	 * com.iawg.ecoa.jaxbclasses.step2bServiceQOS
	 * 
	 */
	public ObjectFactory() {
	}

	/**
	 * Create an instance of {@link Use }
	 * 
	 */
	public Use createUse() {
		return new Use();
	}

	/**
	 * Create an instance of {@link ServiceInstanceQoS }
	 * 
	 */
	public ServiceInstanceQoS createServiceInstanceQoS() {
		return new ServiceInstanceQoS();
	}

	/**
	 * Create an instance of {@link Operations }
	 * 
	 */
	public Operations createOperations() {
		return new Operations();
	}

	/**
	 * Create an instance of {@link Data }
	 * 
	 */
	public Data createData() {
		return new Data();
	}

	/**
	 * Create an instance of {@link RequestResponse }
	 * 
	 */
	public RequestResponse createRequestResponse() {
		return new RequestResponse();
	}

	/**
	 * Create an instance of {@link Event }
	 * 
	 */
	public Event createEvent() {
		return new Event();
	}

	/**
	 * Create an instance of {@link OperationRate }
	 * 
	 */
	public OperationRate createOperationRate() {
		return new OperationRate();
	}

}
