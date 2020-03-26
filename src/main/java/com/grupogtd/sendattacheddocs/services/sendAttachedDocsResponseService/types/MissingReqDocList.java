package com.grupogtd.sendattacheddocs.services.sendAttachedDocsResponseService.types;

import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class MissingReqDocList
  implements Serializable
{
  private int documentType;
  
  public MissingReqDocList(int documentType) { this.documentType = documentType; }








  
  public int getDocumentType() { return this.documentType; }








  
  public void setDocumentType(int documentType) { this.documentType = documentType; }

  
  private Object __equalsCalc = null;
  public boolean equals(Object obj) {
    if (!(obj instanceof MissingReqDocList)) return false; 
    MissingReqDocList other = (MissingReqDocList)obj;
    if (obj == null) return false; 
    if (this == obj) return true; 
    if (this.__equalsCalc != null) {
      return (this.__equalsCalc == obj);
    }
    this.__equalsCalc = obj;
    
    boolean _equals = 
      (this.documentType == other.getDocumentType());
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
    this.__hashCodeCalc = false;
    return _hashCode;
  }


  
  private static TypeDesc typeDesc = new TypeDesc(MissingReqDocList.class, true);
  
  static  {
    typeDesc.setXmlType(new QName("http://oap/services/sendAttachedDocsResponseService/types", "MissingReqDocList"));
    ElementDesc elemField = new ElementDesc();
    elemField.setFieldName("documentType");
    elemField.setXmlName(new QName("", "documentType"));
    elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "int"));
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
  
  public MissingReqDocList() {}
}
