package com.grupogtd.sendattacheddocs.services.sendAttachedDocsResponseService.types;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Arrays;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class SendAttachedDocsResponseBody
  implements Serializable
{
  private int mandatoryDocsCompleted;
  private int documentAttachOnDate;
  private MissingReqDocList[] missingRequiredDocList;
  private int responseCode;
  private String responseCodeDescription;
  
  public SendAttachedDocsResponseBody(int mandatoryDocsCompleted, int documentAttachOnDate, MissingReqDocList[] missingRequiredDocList, int responseCode, String responseCodeDescription) {
    this.mandatoryDocsCompleted = mandatoryDocsCompleted;
    this.documentAttachOnDate = documentAttachOnDate;
    this.missingRequiredDocList = missingRequiredDocList;
    this.responseCode = responseCode;
    this.responseCodeDescription = responseCodeDescription;
  }

  public int getMandatoryDocsCompleted() { return this.mandatoryDocsCompleted; }

  public void setMandatoryDocsCompleted(int mandatoryDocsCompleted) { this.mandatoryDocsCompleted = mandatoryDocsCompleted; }

  public int getDocumentAttachOnDate() { return this.documentAttachOnDate; }

  public void setDocumentAttachOnDate(int documentAttachOnDate) { this.documentAttachOnDate = documentAttachOnDate; }

  public MissingReqDocList[] getMissingRequiredDocList() { return this.missingRequiredDocList; }

  public void setMissingRequiredDocList(MissingReqDocList[] missingRequiredDocList) { this.missingRequiredDocList = missingRequiredDocList; }

  public MissingReqDocList getMissingRequiredDocList(int i) { return this.missingRequiredDocList[i]; }

  public void setMissingRequiredDocList(int i, MissingReqDocList _value) { this.missingRequiredDocList[i] = _value; }

  public int getResponseCode() { return this.responseCode; }

  public void setResponseCode(int responseCode) { this.responseCode = responseCode; }

  public String getResponseCodeDescription() { return this.responseCodeDescription; }

  public void setResponseCodeDescription(String responseCodeDescription) { this.responseCodeDescription = responseCodeDescription; }

  private Object __equalsCalc = null;
  public boolean equals(Object obj) {
    if (!(obj instanceof SendAttachedDocsResponseBody)) return false; 
    SendAttachedDocsResponseBody other = (SendAttachedDocsResponseBody)obj;
    if (obj == null) return false; 
    if (this == obj) return true; 
    if (this.__equalsCalc != null) {
      return (this.__equalsCalc == obj);
    }
    this.__equalsCalc = obj;
    
    boolean _equals = 
      (this.mandatoryDocsCompleted == other.getMandatoryDocsCompleted() && 
      this.documentAttachOnDate == other.getDocumentAttachOnDate() && ((
      this.missingRequiredDocList == null && other.getMissingRequiredDocList() == null) || (
      this.missingRequiredDocList != null && 
      Arrays.equals(this.missingRequiredDocList, other.getMissingRequiredDocList()))) && 
      this.responseCode == other.getResponseCode() && ((
      this.responseCodeDescription == null && other.getResponseCodeDescription() == null) || (
      this.responseCodeDescription != null && 
      this.responseCodeDescription.equals(other.getResponseCodeDescription()))));
    this.__equalsCalc = null;
    return _equals;
  }
  private boolean __hashCodeCalc = false;
  
  public int hashCode() {
    if (this.__hashCodeCalc) {
      return 0;
    }
    this.__hashCodeCalc = true;
    int _hashCode = 1;
    _hashCode += getMandatoryDocsCompleted();
    _hashCode += getDocumentAttachOnDate();
    if (getMissingRequiredDocList() != null) {
      for (int i = 0; 
        i < Array.getLength(getMissingRequiredDocList()); 
        i++) {
        Object obj = Array.get(getMissingRequiredDocList(), i);
        if (obj != null && 
          !obj.getClass().isArray()) {
          _hashCode += obj.hashCode();
        }
      } 
    }
    _hashCode += getResponseCode();
    if (getResponseCodeDescription() != null) {
      _hashCode += getResponseCodeDescription().hashCode();
    }
    this.__hashCodeCalc = false;
    return _hashCode;
  }

  private static TypeDesc typeDesc = new TypeDesc(SendAttachedDocsResponseBody.class, true);
  
  static  {
    typeDesc.setXmlType(new QName("http://oap/services/sendAttachedDocsResponseService/types", "sendAttachedDocsResponseBody"));
    ElementDesc elemField = new ElementDesc();
    elemField.setFieldName("mandatoryDocsCompleted");
    elemField.setXmlName(new QName("", "mandatoryDocsCompleted"));
    elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "int"));
    elemField.setNillable(false);
    typeDesc.addFieldDesc(elemField);
    elemField = new ElementDesc();
    elemField.setFieldName("documentAttachOnDate");
    elemField.setXmlName(new QName("", "documentAttachOnDate"));
    elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "int"));
    elemField.setNillable(false);
    typeDesc.addFieldDesc(elemField);
    elemField = new ElementDesc();
    elemField.setFieldName("missingRequiredDocList");
    elemField.setXmlName(new QName("", "missingRequiredDocList"));
    elemField.setXmlType(new QName("http://oap/services/sendAttachedDocsResponseService/types", "MissingReqDocList"));
    elemField.setMinOccurs(0);
    elemField.setNillable(false);
    elemField.setMaxOccursUnbounded(true);
    typeDesc.addFieldDesc(elemField);
    elemField = new ElementDesc();
    elemField.setFieldName("responseCode");
    elemField.setXmlName(new QName("", "responseCode"));
    elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "int"));
    elemField.setNillable(false);
    typeDesc.addFieldDesc(elemField);
    elemField = new ElementDesc();
    elemField.setFieldName("responseCodeDescription");
    elemField.setXmlName(new QName("", "responseCodeDescription"));
    elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
    elemField.setNillable(false);
    typeDesc.addFieldDesc(elemField);
  }

  public static TypeDesc getTypeDesc() { return typeDesc; }

  public static Serializer getSerializer(String mechType, Class _javaType, QName _xmlType) {
    return 
      new BeanSerializer(
        _javaType, _xmlType, typeDesc);
  }

  public static Deserializer getDeserializer(String mechType, Class _javaType, QName _xmlType) {
    return 
      new BeanDeserializer(
        _javaType, _xmlType, typeDesc);
  }
  
  public SendAttachedDocsResponseBody() {}
}
