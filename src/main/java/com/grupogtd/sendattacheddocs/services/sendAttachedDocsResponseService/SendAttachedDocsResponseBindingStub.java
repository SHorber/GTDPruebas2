package com.grupogtd.sendattacheddocs.services.sendAttachedDocsResponseService;
import java.util.Vector;

import javax.xml.namespace.QName;
import javax.xml.rpc.Service;

import com.grupogtd.sendattacheddocs.services.sendAttachedDocsResponseService.types.ResponseMessageHeader;
import com.grupogtd.sendattacheddocs.services.sendAttachedDocsResponseService.types.SendAttachedDocsResponseBody;

import org.apache.axis.AxisFault;
import org.apache.axis.NoEndPointException;
import org.apache.axis.client.Call;
import org.apache.axis.description.OperationDesc;
import org.apache.axis.description.ParameterDesc;
import org.apache.axis.encoding.ser.BaseDeserializerFactory;
import org.apache.axis.encoding.ser.BaseSerializerFactory;
import org.apache.axis.utils.JavaUtils;

public class SendAttachedDocsResponseBindingStub extends org.apache.axis.client.Stub implements SendAttachedDocsResponsePortType {
  private Vector cachedSerClasses = new Vector();
  private Vector cachedSerQNames = new Vector();
  private Vector cachedSerFactories = new Vector();
  private Vector cachedDeserFactories = new Vector();

  static OperationDesc[] _operations = new OperationDesc[1]; static  {
    _initOperationDesc1();
  }

  private static void _initOperationDesc1() {
	org.apache.axis.description.OperationDesc oper;
    oper = new OperationDesc();
    oper.setName("sendAttachedDocsResponse");
    ParameterDesc param = new ParameterDesc(new QName("", "ResponseMessageHeader"), (byte)1, new QName("http://oap/services/sendAttachedDocsResponseService/types", "ResponseMessageHeader"), ResponseMessageHeader.class, false, false);
    oper.addParameter(param);
    param = new ParameterDesc(new QName("", "sendAttachedDocsResponseBody"), (byte)1, new QName("http://oap/services/sendAttachedDocsResponseService/types", "sendAttachedDocsResponseBody"), SendAttachedDocsResponseBody.class, false, false);
    oper.addParameter(param);
    oper.setReturnType(new QName("http://www.w3.org/2001/XMLSchema", "int"));
    oper.setReturnClass(int.class);
    oper.setReturnQName(new QName("", "ackResponse"));
    oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
    oper.setUse(org.apache.axis.constants.Use.LITERAL);
    _operations[0] = oper;
  }

//	public SendAttachedDocsResponseBindingStub() {
//		this(null);
//	}
  
  public SendAttachedDocsResponseBindingStub(java.net.URL endpointURL, Service service) throws org.apache.axis.AxisFault {
    this(service);
    this.cachedEndpoint = endpointURL;
  }
  
  public SendAttachedDocsResponseBindingStub(Service service) throws AxisFault {
    if (service == null) {
    	super.service = new org.apache.axis.client.Service();
    } else {
      this.service = service;
    } 
    ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");

    Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
    Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
    Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
    Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
    Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
    Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
    Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
    Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
    Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
    Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
    QName qName = new QName("http://oap/services/sendAttachedDocsResponseService/types", "CodeDescriptionType");
    this.cachedSerQNames.add(qName);
    Class cls = String.class;
    this.cachedSerClasses.add(cls);
    this.cachedSerFactories.add(BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
    this.cachedDeserFactories.add(BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));
    
    qName = new QName("http://oap/services/sendAttachedDocsResponseService/types", "DateFormatType");
    this.cachedSerQNames.add(qName);
    cls = String.class;
    this.cachedSerClasses.add(cls);
    this.cachedSerFactories.add(BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
    this.cachedDeserFactories.add(BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));
    
    qName = new QName("http://oap/services/sendAttachedDocsResponseService/types", "MissingReqDocList");
    this.cachedSerQNames.add(qName);
    cls = com.grupogtd.sendattacheddocs.services.sendAttachedDocsResponseService.types.MissingReqDocList.class;
    this.cachedSerClasses.add(cls);
    this.cachedSerFactories.add(beansf);
    this.cachedDeserFactories.add(beandf);
    
    qName = new QName("http://oap/services/sendAttachedDocsResponseService/types", "OAPTrxIdType");
    this.cachedSerQNames.add(qName);
    cls = String.class;
    this.cachedSerClasses.add(cls);
    this.cachedSerFactories.add(BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
    this.cachedDeserFactories.add(BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));
    
    qName = new QName("http://oap/services/sendAttachedDocsResponseService/types", "ResponseMessageHeader");
    this.cachedSerQNames.add(qName);
    cls = ResponseMessageHeader.class;
    this.cachedSerClasses.add(cls);
    this.cachedSerFactories.add(beansf);
    this.cachedDeserFactories.add(beandf);
    
    qName = new QName("http://oap/services/sendAttachedDocsResponseService/types", "sendAttachedDocsResponseBody");
    this.cachedSerQNames.add(qName);
    cls = SendAttachedDocsResponseBody.class;
    this.cachedSerClasses.add(cls);
    this.cachedSerFactories.add(beansf);
    this.cachedDeserFactories.add(beandf);
  }

  protected Call createCall() throws  java.rmi.RemoteException {
    try {
      Call _call = _createCall();
      if (this.maintainSessionSet) {
        _call.setMaintainSession(this.maintainSession);
      }
      if (this.cachedUsername != null) {
        _call.setUsername(this.cachedUsername);
      }
      if (this.cachedPassword != null) {
        _call.setPassword(this.cachedPassword);
      }
      if (this.cachedEndpoint != null) {
        _call.setTargetEndpointAddress(this.cachedEndpoint);
      }
      if (this.cachedTimeout != null) {
        _call.setTimeout(this.cachedTimeout);
      }
      if (this.cachedPortName != null) {
        _call.setPortName(this.cachedPortName);
      }
      java.util.Enumeration keys = this.cachedProperties.keys();
      while (keys.hasMoreElements()) {
        String key = (String)keys.nextElement();
        _call.setProperty(key, this.cachedProperties.get(key));
      } 

      synchronized (this) {
        if (firstCall()) {
          
          _call.setEncodingStyle(null);
          for (int i = 0; i < this.cachedSerFactories.size(); i++) {
            Class cls = (Class)this.cachedSerClasses.get(i);
            QName qName = 
              (QName)this.cachedSerQNames.get(i);
            Object x = this.cachedSerFactories.get(i);
            if (x instanceof Class) {
              Class sf = 
                (Class)this.cachedSerFactories.get(i);
              Class df = 
                (Class)this.cachedDeserFactories.get(i);
              _call.registerTypeMapping(cls, qName, sf, df, false);
            }
            else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
            	org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)this.cachedSerFactories.get(i);
            	org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)this.cachedDeserFactories.get(i);
              _call.registerTypeMapping(cls, qName, sf, df, false);
            } 
          } 
        } 
      } 
      return _call;
    }
    catch (Throwable _t) {
      throw new AxisFault("Failure trying to get the Call object", _t);
    } 
  }
  
  public int sendAttachedDocsResponse(ResponseMessageHeader responseMessageHeader, SendAttachedDocsResponseBody sendAttachedDocsResponseBody) throws java.rmi.RemoteException {
    if (this.cachedEndpoint == null) {
      throw new NoEndPointException();
    }
    Call _call = createCall();
    _call.setOperation(_operations[0]);
    _call.setUseSOAPAction(true);
    _call.setSOAPActionURI("http://oap/services/sendAttachedDocsResponseService/sendAttachedDocsResponse");
    _call.setEncodingStyle(null);
    _call.setProperty("sendXsiTypes", Boolean.FALSE);
    _call.setProperty("sendMultiRefs", Boolean.FALSE);
    _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
    _call.setOperationName(new QName("http://oap/services/sendAttachedDocsResponseService/types", "sendAttachedDocsResponse"));
    
    setRequestHeaders(_call);
    setAttachments(_call); try {
      Object _resp = _call.invoke(new Object[] { responseMessageHeader, sendAttachedDocsResponseBody });
      
      if (_resp instanceof java.rmi.RemoteException) {
        throw (java.rmi.RemoteException)_resp;
      }
      
      extractAttachments(_call);
      try {
        return ((Integer)_resp).intValue();
      } catch (Exception _exception) {
        return ((Integer)JavaUtils.convert(_resp, int.class)).intValue();
      }
    
    } catch (AxisFault axisFaultException) {
      throw axisFaultException;
    } 
  }
}
