package com.grupogtd.sendattacheddocs.services.sendAttachedDocsResponseService;

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

public class SendAttachedDocsResponseLocator
  extends Service implements SendAttachedDocsResponse {
  public SendAttachedDocsResponseLocator(EngineConfiguration config) { super(config); }
  
  public SendAttachedDocsResponseLocator() {}
  
  public SendAttachedDocsResponseLocator(String wsdlLoc, QName sName) throws ServiceException { super(wsdlLoc, sName); }

  private String sendAttachedDocsResponse_address = "http://10.129.1.122/NPCWebApp/services/sendAttachedDocsResponse/";

  public String getsendAttachedDocsResponseAddress() { return this.sendAttachedDocsResponse_address; }
  
  private String sendAttachedDocsResponseWSDDServiceName = "sendAttachedDocsResponse";
  
  public String getsendAttachedDocsResponseWSDDServiceName() { return this.sendAttachedDocsResponseWSDDServiceName; }
  
  public void setsendAttachedDocsResponseWSDDServiceName(String name) { this.sendAttachedDocsResponseWSDDServiceName = name; }
  
  public SendAttachedDocsResponsePortType getsendAttachedDocsResponse() throws ServiceException {
    URL endpoint;
    try {
      endpoint = new URL(this.sendAttachedDocsResponse_address);
    }
    catch (MalformedURLException e) {
      throw new ServiceException(e);
    } 
    return getsendAttachedDocsResponse(endpoint);
  }
  
  public SendAttachedDocsResponsePortType getsendAttachedDocsResponse(URL portAddress) throws ServiceException {
    try {
      SendAttachedDocsResponseBindingStub _stub = new SendAttachedDocsResponseBindingStub(portAddress, this);
      _stub.setPortName(getsendAttachedDocsResponseWSDDServiceName());
      return _stub;
    }
    catch (AxisFault e) {
      return null;
    } 
  }
  public void setsendAttachedDocsResponseEndpointAddress(String address) { this.sendAttachedDocsResponse_address = address; }

  public Remote getPort(Class serviceEndpointInterface) throws ServiceException {
    try {
      if (SendAttachedDocsResponsePortType.class.isAssignableFrom(serviceEndpointInterface)) {
        SendAttachedDocsResponseBindingStub _stub = new SendAttachedDocsResponseBindingStub(new URL(this.sendAttachedDocsResponse_address), this);
        _stub.setPortName(getsendAttachedDocsResponseWSDDServiceName());
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
    if ("sendAttachedDocsResponse".equals(inputPortName)) {
      return getsendAttachedDocsResponse();
    }
    
    Remote _stub = getPort(serviceEndpointInterface);
    ((Stub)_stub).setPortName(portName);
    return _stub;
  }

  public QName getServiceName() { return new QName("http://oap/services/sendAttachedDocsResponseService", "sendAttachedDocsResponse"); }

  private HashSet ports = null;
  
  public Iterator getPorts() {
    if (this.ports == null) {
      this.ports = new HashSet();
      this.ports.add(new QName("http://oap/services/sendAttachedDocsResponseService", "sendAttachedDocsResponse"));
    } 
    return this.ports.iterator();
  }

  public void setEndpointAddress(String portName, String address) throws ServiceException {
    if ("sendAttachedDocsResponse".equals(portName)) {
      setsendAttachedDocsResponseEndpointAddress(address);
    }
    else {
      
      throw new ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
    } 
  }

  public void setEndpointAddress(QName portName, String address) throws ServiceException { setEndpointAddress(portName.getLocalPart(), address); }
}