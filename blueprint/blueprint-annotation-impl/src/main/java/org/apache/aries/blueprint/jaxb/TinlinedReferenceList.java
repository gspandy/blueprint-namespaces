//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.3 in JDK 1.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.04.23 at 12:57:08 PM EDT 
//


package org.apache.aries.blueprint.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 
 *                 The Tinlined-reference-list type is used for inlined (i.e. non top level)
 *                 <reference-list> elements.
 *                 
 * 			
 * 
 * <p>Java class for Tinlined-reference-list complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Tinlined-reference-list">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.osgi.org/xmlns/blueprint/v1.0.0}Treference-list">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.osgi.org/xmlns/blueprint/v1.0.0}GserviceReferenceElements"/>
 *         &lt;any/>
 *       &lt;/sequence>
 *       &lt;attribute name="depends-on" type="{http://www.osgi.org/xmlns/blueprint/v1.0.0}TdependsOn" />
 *       &lt;attribute name="interface" type="{http://www.osgi.org/xmlns/blueprint/v1.0.0}Tclass" />
 *       &lt;attribute name="filter" type="{http://www.w3.org/2001/XMLSchema}normalizedString" />
 *       &lt;attribute name="component-name" type="{http://www.osgi.org/xmlns/blueprint/v1.0.0}Tidref" />
 *       &lt;attribute name="availability" type="{http://www.osgi.org/xmlns/blueprint/v1.0.0}Tavailability" />
 *       &lt;attribute name="member-type" type="{http://www.osgi.org/xmlns/blueprint/v1.0.0}Tservice-use" default="service-object" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Tinlined-reference-list", namespace = "http://www.osgi.org/xmlns/blueprint/v1.0.0")
public class TinlinedReferenceList
    extends TreferenceList
{


}
