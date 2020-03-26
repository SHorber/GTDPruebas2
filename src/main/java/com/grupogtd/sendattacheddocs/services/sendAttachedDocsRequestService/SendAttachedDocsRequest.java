package com.grupogtd.sendattacheddocs.services.sendAttachedDocsRequestService;

import java.net.URL;
import javax.xml.rpc.Service;
import javax.xml.rpc.ServiceException;

public interface SendAttachedDocsRequest extends Service {
  String getsendAttachedDocsRequestAddress();
  
  SendAttachedDocsRequestPortType getsendAttachedDocsRequest() throws ServiceException;
  
  SendAttachedDocsRequestPortType getsendAttachedDocsRequest(URL paramURL) throws ServiceException;
}
