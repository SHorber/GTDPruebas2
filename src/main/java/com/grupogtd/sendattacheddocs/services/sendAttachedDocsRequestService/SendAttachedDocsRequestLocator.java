package com.grupogtd.sendattacheddocs.services.sendAttachedDocsRequestService;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.Remote;
import java.util.HashSet;
import java.util.Iterator;
import javax.xml.namespace.QName;
import javax.xml.rpc.ServiceException;
import org.apache.axis.AxisFault;
import org.apache.axis.EngineConfiguration;
import org.apache.axis.client.Service;
import org.apache.axis.client.Stub;

public class SendAttachedDocsRequestLocator extends Service implements SendAttachedDocsRequest {
  public SendAttachedDocsRequestLocator() {}
  
  public SendAttachedDocsRequestLocator(EngineConfiguration config) { super(config); }

  public SendAttachedDocsRequestLocator(String wsdlLoc, QName sName) throws ServiceException { super(wsdlLoc, sName); }

  private String sendAttachedDocsRequest_address = System.getProperty("com.grupogtd.oap.external.sendAttachedDocsRequest.endpoint","http://10.129.1.122/NPCWebApp/services/sendAttachedDocsRequest/");

  public String getsendAttachedDocsRequestAddress() { return this.sendAttachedDocsRequest_address; }

  private String sendAttachedDocsRequestWSDDServiceName = "sendAttachedDocsRequest";

  public String getsendAttachedDocsRequestWSDDServiceName() { return this.sendAttachedDocsRequestWSDDServiceName; }
  
  public void setsendAttachedDocsRequestWSDDServiceName(String name) { this.sendAttachedDocsRequestWSDDServiceName = name; }
  
  public SendAttachedDocsRequestPortType getsendAttachedDocsRequest() throws ServiceException {
    URL endpoint;
    try {
      endpoint = new URL(this.sendAttachedDocsRequest_address);
    }
    catch (MalformedURLException e) {
      throw new ServiceException(e);
    } 
    return getsendAttachedDocsRequest(endpoint);
  }
  
  public SendAttachedDocsRequestPortType getsendAttachedDocsRequest(URL portAddress) throws ServiceException {
    try {
      SendAttachedDocsRequestBindingStub _stub = new SendAttachedDocsRequestBindingStub(portAddress, this);
      _stub.setPortName(getsendAttachedDocsRequestWSDDServiceName());
      return _stub;
    }
    catch (AxisFault e) {
      return null;
    } 
  }
  
  public void setsendAttachedDocsRequestEndpointAddress(String address) { this.sendAttachedDocsRequest_address = address; }

  public Remote getPort(Class serviceEndpointInterface) throws ServiceException {
    try {
      if (SendAttachedDocsRequestPortType.class.isAssignableFrom(serviceEndpointInterface)) {
        SendAttachedDocsRequestBindingStub _stub = new SendAttachedDocsRequestBindingStub(new URL(this.sendAttachedDocsRequest_address), this);
        _stub.setPortName(getsendAttachedDocsRequestWSDDServiceName());
        return _stub;
      }
    
    } catch (Throwable t) {
      throw new ServiceException(t);
    } 
    throw new ServiceException("There is no stub implementation for the interface:  " + ((serviceEndpointInterface == null) ? "null" : serviceEndpointInterface.getName()));
  }

  public Remote getPort(QName portName, Class serviceEndpointInterface) throws ServiceException {
    if (portName == null) {
      return getPort(serviceEndpointInterface);
    }
    String inputPortName = portName.getLocalPart();
    if ("sendAttachedDocsRequest".equals(inputPortName)) {
      return getsendAttachedDocsRequest();
    }
    
    Remote _stub = getPort(serviceEndpointInterface);
    ((Stub)_stub).setPortName(portName);
    return _stub;
  }

  public QName getServiceName() { return new QName("http://oap/services/sendAttachedDocsRequestService", "sendAttachedDocsRequest"); }

  private HashSet ports = null;
  
  public Iterator getPorts() {
    if (this.ports == null) {
      this.ports = new HashSet();
      this.ports.add(new QName("http://oap/services/sendAttachedDocsRequestService", "sendAttachedDocsRequest"));
    } 
    return this.ports.iterator();
  }

  public void setEndpointAddress(String portName, String address) throws ServiceException {
    if ("sendAttachedDocsRequest".equals(portName)) {
      setsendAttachedDocsRequestEndpointAddress(address);
    }
    else {
      
      throw new ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
    } 
  }

  public void setEndpointAddress(QName portName, String address) throws ServiceException { setEndpointAddress(portName.getLocalPart(), address); }
}