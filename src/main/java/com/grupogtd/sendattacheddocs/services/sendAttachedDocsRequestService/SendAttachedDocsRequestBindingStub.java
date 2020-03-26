package com.grupogtd.sendattacheddocs.services.sendAttachedDocsRequestService;
import java.util.Vector;


import javax.xml.namespace.QName;
import javax.xml.rpc.Service;

import com.grupogtd.sendattacheddocs.services.sendAttachedDocsRequestService.types.ADocsList;
import com.grupogtd.sendattacheddocs.services.sendAttachedDocsRequestService.types.RequestMessageHeader;

import org.apache.axis.AxisFault;
import org.apache.axis.NoEndPointException;
import org.apache.axis.client.Call;
import org.apache.axis.description.OperationDesc;
import org.apache.axis.description.ParameterDesc;
import org.apache.axis.encoding.ser.ArrayDeserializerFactory;
import org.apache.axis.encoding.ser.ArraySerializerFactory;
import org.apache.axis.encoding.ser.BaseDeserializerFactory;
import org.apache.axis.encoding.ser.BaseSerializerFactory;
import org.apache.axis.utils.JavaUtils;

public class SendAttachedDocsRequestBindingStub extends org.apache.axis.client.Stub implements SendAttachedDocsRequestPortType {
  private Vector cachedSerClasses = new Vector();
  private Vector cachedSerQNames = new Vector();
  private Vector cachedSerFactories = new Vector();
  private Vector cachedDeserFactories = new Vector();

  static OperationDesc[] _operations = new OperationDesc[1]; static  {
    _initOperationDesc1();
  }

    private static void _initOperationDesc1() {
	OperationDesc oper = new OperationDesc();
    oper.setName("sendAttachedDocsRequest");
    ParameterDesc param = new ParameterDesc(new QName("", "RequestMessageHeader"), (byte)1, new QName("http://oap/services/sendAttachedDocsRequestService/types", "RequestMessageHeader"), RequestMessageHeader.class, false, false);
    oper.addParameter(param);
    param = new ParameterDesc(new QName("", "sendAttachedDocsRequestBody"), (byte)1, new QName("http://oap/services/sendAttachedDocsRequestService/types", "sendAttachedDocsRequestBody"), ADocsList[].class, false, false);
    param.setItemQName(new QName("", "attachedDocsList"));
    oper.addParameter(param);
    oper.setReturnType(new QName("http://www.w3.org/2001/XMLSchema", "int"));
    oper.setReturnClass(int.class);
    oper.setReturnQName(new QName("", "ackResponse"));
    oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
    oper.setUse(org.apache.axis.constants.Use.LITERAL);
    _operations[0] = oper;
  }

  public SendAttachedDocsRequestBindingStub() throws org.apache.axis.AxisFault { 
	  this(null); 
  }

  public SendAttachedDocsRequestBindingStub(java.net.URL endpointURL, Service service) throws AxisFault {
    this(service);
    this.cachedEndpoint = endpointURL;
  }
  
  public SendAttachedDocsRequestBindingStub(Service service) throws AxisFault {
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
    Class arraysf = ArraySerializerFactory.class;
    Class arraydf = ArrayDeserializerFactory.class;
    Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
    Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
    Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
    Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
    QName qName = new QName("http://oap/services/sendAttachedDocsRequestService/types", "ADocsList");
    this.cachedSerQNames.add(qName);
    Class cls = ADocsList.class;
    this.cachedSerClasses.add(cls);
    this.cachedSerFactories.add(beansf);
    this.cachedDeserFactories.add(beandf);
    
    qName = new QName("http://oap/services/sendAttachedDocsRequestService/types", "DateFormatType");
    this.cachedSerQNames.add(qName);
    cls = String.class;
    this.cachedSerClasses.add(cls);
    this.cachedSerFactories.add(BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
    this.cachedDeserFactories.add(BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));
    
    qName = new QName("http://oap/services/sendAttachedDocsRequestService/types", "OAPTrxIdType");
    this.cachedSerQNames.add(qName);
    cls = String.class;
    this.cachedSerClasses.add(cls);
    this.cachedSerFactories.add(BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
    this.cachedDeserFactories.add(BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));
    
    qName = new QName("http://oap/services/sendAttachedDocsRequestService/types", "RequestMessageHeader");
    this.cachedSerQNames.add(qName);
    cls = RequestMessageHeader.class;
    this.cachedSerClasses.add(cls);
    this.cachedSerFactories.add(beansf);
    this.cachedDeserFactories.add(beandf);
    
    qName = new QName("http://oap/services/sendAttachedDocsRequestService/types", "sendAttachedDocsRequestBody");
    this.cachedSerQNames.add(qName);
    cls = ADocsList[].class;
    this.cachedSerClasses.add(cls);
    qName = new QName("http://oap/services/sendAttachedDocsRequestService/types", "ADocsList");
    QName qName2 = new QName("", "attachedDocsList");
    this.cachedSerFactories.add(new ArraySerializerFactory(qName, qName2));
    this.cachedDeserFactories.add(new ArrayDeserializerFactory());
    
    qName = new QName("http://oap/services/sendAttachedDocsRequestService/types", "TNDataType");
    this.cachedSerQNames.add(qName);
    cls = String.class;
    this.cachedSerClasses.add(cls);
    this.cachedSerFactories.add(BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
    this.cachedDeserFactories.add(BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));
  }

  
  protected Call createCall() throws java.rmi.RemoteException {
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
            	 org.apache.axis.encoding.SerializerFactory sf =(org.apache.axis.encoding.SerializerFactory)this.cachedSerFactories.get(i);
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
  
  public int sendAttachedDocsRequest(RequestMessageHeader requestMessageHeader, ADocsList[] sendAttachedDocsRequestBody) throws java.rmi.RemoteException {
    if (this.cachedEndpoint == null) {
      throw new NoEndPointException();
    }
    Call _call = createCall();
    _call.setOperation(_operations[0]);
    _call.setUseSOAPAction(true);
    _call.setSOAPActionURI("http://oap/services/sendAttachedDocsRequestService/sendAttachedDocsRequest");
    _call.setEncodingStyle(null);
    _call.setProperty("sendXsiTypes", Boolean.FALSE);
    _call.setProperty("sendMultiRefs", Boolean.FALSE);
    _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
    _call.setOperationName(new QName("http://oap/services/sendAttachedDocsRequestService/types", "sendAttachedDocsRequest"));
    
    setRequestHeaders(_call);
    setAttachments(_call); try {
      Object _resp = _call.invoke(new Object[] { requestMessageHeader, sendAttachedDocsRequestBody });
      
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
