package com.grupogtd.sendattacheddocs.services.sendAttachedDocsResponseService;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;
import javax.xml.rpc.Stub;

import com.grupogtd.sendattacheddocs.services.sendAttachedDocsResponseService.types.ResponseMessageHeader;
import com.grupogtd.sendattacheddocs.services.sendAttachedDocsResponseService.types.SendAttachedDocsResponseBody;

public class SendAttachedDocsResponsePortTypeProxy implements
		SendAttachedDocsResponsePortType {
	private String _endpoint;

	public SendAttachedDocsResponsePortTypeProxy() {
		this._endpoint = null;
		this.sendAttachedDocsResponsePortType = null;

		_initSendAttachedDocsResponsePortTypeProxy();
	}

	private SendAttachedDocsResponsePortType sendAttachedDocsResponsePortType;

	public SendAttachedDocsResponsePortTypeProxy(String endpoint) {
		this._endpoint = null;
		this.sendAttachedDocsResponsePortType = null;
		this._endpoint = endpoint;
		_initSendAttachedDocsResponsePortTypeProxy();
	}

	private void _initSendAttachedDocsResponsePortTypeProxy() {
		try {
			this.sendAttachedDocsResponsePortType = (new SendAttachedDocsResponseLocator())
					.getsendAttachedDocsResponse();
			if (this.sendAttachedDocsResponsePortType != null) {
				if (this._endpoint != null) {
					((Stub) this.sendAttachedDocsResponsePortType)
							._setProperty(
									"javax.xml.rpc.service.endpoint.address",
									this._endpoint);
				} else {
					this._endpoint = (String) ((Stub) this.sendAttachedDocsResponsePortType)
							._getProperty("javax.xml.rpc.service.endpoint.address");
				}

			}
		} catch (ServiceException serviceException) {
		}
	}

	public String getEndpoint() {
		return this._endpoint;
	}

	public void setEndpoint(String endpoint) {
		this._endpoint = endpoint;
		if (this.sendAttachedDocsResponsePortType != null) {
			((Stub) this.sendAttachedDocsResponsePortType)._setProperty(
					"javax.xml.rpc.service.endpoint.address", this._endpoint);
		}
	}

	public SendAttachedDocsResponsePortType getSendAttachedDocsResponsePortType() {
		if (this.sendAttachedDocsResponsePortType == null)
			_initSendAttachedDocsResponsePortTypeProxy();
		return this.sendAttachedDocsResponsePortType;
	}

	public int sendAttachedDocsResponse(
			ResponseMessageHeader responseMessageHeader,
			SendAttachedDocsResponseBody sendAttachedDocsResponseBody)
			throws RemoteException {
		if (this.sendAttachedDocsResponsePortType == null)
			_initSendAttachedDocsResponsePortTypeProxy();
		return this.sendAttachedDocsResponsePortType.sendAttachedDocsResponse(
				responseMessageHeader, sendAttachedDocsResponseBody);
	}
}
