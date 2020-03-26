package com.grupogtd.sendattacheddocs.services.sendAttachedDocsResponseService;

import java.net.URL;
import javax.xml.rpc.Service;
import javax.xml.rpc.ServiceException;

public interface SendAttachedDocsResponse extends Service {
  String getsendAttachedDocsResponseAddress();
  
  SendAttachedDocsResponsePortType getsendAttachedDocsResponse() throws ServiceException;
  
  SendAttachedDocsResponsePortType getsendAttachedDocsResponse(URL paramURL) throws ServiceException;
}
