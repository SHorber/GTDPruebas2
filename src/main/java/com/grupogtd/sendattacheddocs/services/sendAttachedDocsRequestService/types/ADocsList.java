package com.grupogtd.sendattacheddocs.services.sendAttachedDocsRequestService.types;

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

public class ADocsList
  implements Serializable
{
  private int documentType;
  private String telephoneNumberDoc;
  private byte[] documentBinFile;
  
  public ADocsList(int documentType, String telephoneNumberDoc, byte[] documentBinFile) {
    this.documentType = documentType;
    this.telephoneNumberDoc = telephoneNumberDoc;
    this.documentBinFile = documentBinFile;
  }

  public int getDocumentType() { return this.documentType; }

  public void setDocumentType(int documentType) { this.documentType = documentType; }
  
  public String getTelephoneNumberDoc() { return this.telephoneNumberDoc; }

  public void setTelephoneNumberDoc(String telephoneNumberDoc) { this.telephoneNumberDoc = telephoneNumberDoc; }

  public byte[] getDocumentBinFile() { return this.documentBinFile; }

  public void setDocumentBinFile(byte[] documentBinFile) { this.documentBinFile = documentBinFile; }

  private Object __equalsCalc = null;
  public boolean equals(Object obj) {
    if (!(obj instanceof ADocsList)) return false; 
    ADocsList other = (ADocsList)obj;
    if (obj == null) return false; 
    if (this == obj) return true; 
    if (this.__equalsCalc != null) {
      return (this.__equalsCalc == obj);
    }
    this.__equalsCalc = obj;
    
    boolean _equals = 
      (this.documentType == other.getDocumentType() && ((
      this.telephoneNumberDoc == null && other.getTelephoneNumberDoc() == null) || (
      this.telephoneNumberDoc != null && 
      this.telephoneNumberDoc.equals(other.getTelephoneNumberDoc()))) && ((
      this.documentBinFile == null && other.getDocumentBinFile() == null) || (
      this.documentBinFile != null && 
      Arrays.equals(this.documentBinFile, other.getDocumentBinFile()))));
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
    _hashCode += getDocumentType();
    if (getTelephoneNumberDoc() != null) {
      _hashCode += getTelephoneNumberDoc().hashCode();
    }
    if (getDocumentBinFile() != null) {
      for (int i = 0; 
        i < Array.getLength(getDocumentBinFile()); 
        i++) {
        Object obj = Array.get(getDocumentBinFile(), i);
        if (obj != null && 
          !obj.getClass().isArray()) {
          _hashCode += obj.hashCode();
        }
      } 
    }
    this.__hashCodeCalc = false;
    return _hashCode;
  }

  private static TypeDesc typeDesc = new TypeDesc(ADocsList.class, true);
  
  static  {
    typeDesc.setXmlType(new QName("http://oap/services/sendAttachedDocsRequestService/types", "ADocsList"));
    ElementDesc elemField = new ElementDesc();
    elemField.setFieldName("documentType");
    elemField.setXmlName(new QName("", "documentType"));
    elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "int"));
    elemField.setNillable(false);
    typeDesc.addFieldDesc(elemField);
    elemField = new ElementDesc();
    elemField.setFieldName("telephoneNumberDoc");
    elemField.setXmlName(new QName("", "telephoneNumberDoc"));
    elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
    elemField.setNillable(false);
    typeDesc.addFieldDesc(elemField);
    elemField = new ElementDesc();
    elemField.setFieldName("documentBinFile");
    elemField.setXmlName(new QName("", "documentBinFile"));
    elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
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
  
  public ADocsList() {}
}
