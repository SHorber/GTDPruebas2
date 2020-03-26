package com.grupogtd.sendattacheddocs.services.sendAttachedDocsRequestService;

import java.rmi.Remote;
import java.rmi.RemoteException;
import com.grupogtd.sendattacheddocs.services.sendAttachedDocsRequestService.types.ADocsList;
import com.grupogtd.sendattacheddocs.services.sendAttachedDocsRequestService.types.RequestMessageHeader;

public interface SendAttachedDocsRequestPortType extends Remote {
  int sendAttachedDocsRequest(RequestMessageHeader paramRequestMessageHeader, ADocsList[] paramArrayOfADocsList) throws RemoteException;
}
