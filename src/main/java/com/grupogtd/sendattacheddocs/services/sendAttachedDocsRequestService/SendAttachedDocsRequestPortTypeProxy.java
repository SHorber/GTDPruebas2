package com.grupogtd.sendattacheddocs.services.sendAttachedDocsRequestService;

import java.rmi.RemoteException;

import com.grupogtd.sendattacheddocs.services.sendAttachedDocsRequestService.types.ADocsList;
import com.grupogtd.sendattacheddocs.services.sendAttachedDocsRequestService.types.RequestMessageHeader;

public class SendAttachedDocsRequestPortTypeProxy implements SendAttachedDocsRequestPortType { 
	private String _endpoint;
  
  public SendAttachedDocsRequestPortTypeProxy() {
    this._endpoint = null;
    this.sendAttachedDocsRequestPortType = null;

    _initSendAttachedDocsRequestPortTypeProxy();
  } private SendAttachedDocsRequestPortType sendAttachedDocsRequestPortType; public SendAttachedDocsRequestPortTypeProxy(String endpoint) {
    this._endpoint = null;
    this.sendAttachedDocsRequestPortType = null;
    this._endpoint = endpoint;
    _initSendAttachedDocsRequestPortTypeProxy();
  }
  
  private void _initSendAttachedDocsRequestPortTypeProxy() {
    try {
      this.sendAttachedDocsRequestPortType = (new SendAttachedDocsRequestLocator()).getsendAttachedDocsRequest();
      if (this.sendAttachedDocsRequestPortType != null) {
        if (this._endpoint != null) {
          ((javax.xml.rpc.Stub)this.sendAttachedDocsRequestPortType)._setProperty("javax.xml.rpc.service.endpoint.address", this._endpoint);
        } else {
          this._endpoint = (String)((javax.xml.rpc.Stub)this.sendAttachedDocsRequestPortType)._getProperty("javax.xml.rpc.service.endpoint.address");
        }
      
      }
    } catch (javax.xml.rpc.ServiceException serviceException) {}
  }

  public String getEndpoint() { return this._endpoint; }

  public void setEndpoint(String endpoint) {
    this._endpoint = endpoint;
    if (this.sendAttachedDocsRequestPortType != null) {
      ((javax.xml.rpc.Stub)this.sendAttachedDocsRequestPortType)._setProperty("javax.xml.rpc.service.endpoint.address", this._endpoint);
    }
  }
  
  public SendAttachedDocsRequestPortType getSendAttachedDocsRequestPortType() {
    if (this.sendAttachedDocsRequestPortType == null)
      _initSendAttachedDocsRequestPortTypeProxy(); 
    return this.sendAttachedDocsRequestPortType;
  }
  
  public int sendAttachedDocsRequest(RequestMessageHeader requestMessageHeader, ADocsList[] sendAttachedDocsRequestBody) throws RemoteException {
    if (this.sendAttachedDocsRequestPortType == null)
      _initSendAttachedDocsRequestPortTypeProxy(); 
    return this.sendAttachedDocsRequestPortType.sendAttachedDocsRequest(requestMessageHeader, sendAttachedDocsRequestBody);
  } }
