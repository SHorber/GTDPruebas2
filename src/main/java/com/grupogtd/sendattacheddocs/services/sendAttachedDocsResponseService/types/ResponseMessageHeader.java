package com.grupogtd.sendattacheddocs.services.sendAttachedDocsResponseService.types;

import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class ResponseMessageHeader
  implements Serializable
{
  private String OAPTrxId;
  private String messageTimeStamp;
  
  public ResponseMessageHeader(String OAPTrxId, String messageTimeStamp) {
    this.OAPTrxId = OAPTrxId;
    this.messageTimeStamp = messageTimeStamp;
  }

  public String getOAPTrxId() { return this.OAPTrxId; }

  public void setOAPTrxId(String OAPTrxId) { this.OAPTrxId = OAPTrxId; }

  public String getMessageTimeStamp() { return this.messageTimeStamp; }

  public void setMessageTimeStamp(String messageTimeStamp) { this.messageTimeStamp = messageTimeStamp; }

  private Object __equalsCalc = null;
  public boolean equals(Object obj) {
    if (!(obj instanceof ResponseMessageHeader)) return false; 
    ResponseMessageHeader other = (ResponseMessageHeader)obj;
    if (obj == null) return false; 
    if (this == obj) return true; 
    if (this.__equalsCalc != null) {
      return (this.__equalsCalc == obj);
    }
    this.__equalsCalc = obj;
    
    boolean _equals = 
      (((this.OAPTrxId == null && other.getOAPTrxId() == null) || (
      this.OAPTrxId != null && 
      this.OAPTrxId.equals(other.getOAPTrxId()))) && ((
      this.messageTimeStamp == null && other.getMessageTimeStamp() == null) || (
      this.messageTimeStamp != null && 
      this.messageTimeStamp.equals(other.getMessageTimeStamp()))));
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
    if (getOAPTrxId() != null) {
      _hashCode += getOAPTrxId().hashCode();
    }
    if (getMessageTimeStamp() != null) {
      _hashCode += getMessageTimeStamp().hashCode();
    }
    this.__hashCodeCalc = false;
    return _hashCode;
  }

  private static TypeDesc typeDesc = new TypeDesc(ResponseMessageHeader.class, true);
  
  static  {
    typeDesc.setXmlType(new QName("http://oap/services/sendAttachedDocsResponseService/types", "ResponseMessageHeader"));
    ElementDesc elemField = new ElementDesc();
    elemField.setFieldName("OAPTrxId");
    elemField.setXmlName(new QName("", "OAPTrxId"));
    elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
    elemField.setNillable(false);
    typeDesc.addFieldDesc(elemField);
    elemField = new ElementDesc();
    elemField.setFieldName("messageTimeStamp");
    elemField.setXmlName(new QName("", "messageTimeStamp"));
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
  
  public ResponseMessageHeader() {}
}
