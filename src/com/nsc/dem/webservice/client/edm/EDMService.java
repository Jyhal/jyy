
package com.nsc.dem.webservice.client.edm;

import javax.activation.DataHandler;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.1 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebService(name = "EDMService", targetNamespace = "http://www.example.org/EDMService/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface EDMService {


    /**
     * 
     * @param pwd
     * @param param
     * @return
     *     returns byte[]
     */
    @WebMethod(action = "http://www.example.org/EDMService/getUserInfo")
    @WebResult(name = "out", targetNamespace = "")
    @RequestWrapper(localName = "getUserInfo", targetNamespace = "http://www.example.org/EDMService/", className = "com.nsc.dem.webservice.client.edm.GetUserInfo")
    @ResponseWrapper(localName = "getUserInfoResponse", targetNamespace = "http://www.example.org/EDMService/", className = "com.nsc.dem.webservice.client.edm.GetUserInfoResponse")
    public byte[] getUserInfo(
        @WebParam(name = "param", targetNamespace = "")
        String param,
        @WebParam(name = "pwd", targetNamespace = "")
        String pwd
        );

    /**
     * 
     * @param stream
     * @return
     *     returns boolean
     * @throws Exception_Exception
     */
    @WebMethod(action = "http://www.example.org/EDMService/publishReviewPlanInfo")
    @WebResult(name = "out", targetNamespace = "")
    @RequestWrapper(localName = "publishReviewPlanInfo", targetNamespace = "http://www.example.org/EDMService/", className = "com.nsc.dem.webservice.client.edm.PublishReviewPlanInfo")
    @ResponseWrapper(localName = "publishReviewPlanInfoResponse", targetNamespace = "http://www.example.org/EDMService/", className = "com.nsc.dem.webservice.client.edm.PublishReviewPlanInfoResponse")
    public boolean publishReviewPlanInfo(
        @WebParam(name = "stream", targetNamespace = "")
        String stream)
        throws Exception_Exception
    ;

    /**
     * 
     * @param pwd
     * @param param
     * @throws Exception_Exception
     */
    @WebMethod(action = "http://www.example.org/EDMService/crossdomainStatistics")
    @RequestWrapper(localName = "crossdomainStatistics", targetNamespace = "http://www.example.org/EDMService/", className = "com.nsc.dem.webservice.client.edm.CrossdomainStatistics")
    @ResponseWrapper(localName = "crossdomainStatisticsResponse", targetNamespace = "http://www.example.org/EDMService/", className = "com.nsc.dem.webservice.client.edm.CrossdomainStatisticsResponse")
    public void crossdomainStatistics(
        @WebParam(name = "param", targetNamespace = "")
        String param,
        @WebParam(name = "pwd", targetNamespace = "")
        String pwd)
        throws Exception_Exception
    ;

    /**
     * 
     * @param pwd
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod(action = "http://www.example.org/EDMService/receiveFileList")
    @WebResult(name = "out", targetNamespace = "")
    @RequestWrapper(localName = "receiveFileList", targetNamespace = "http://www.example.org/EDMService/", className = "com.nsc.dem.webservice.client.edm.ReceiveFileList")
    @ResponseWrapper(localName = "receiveFileListResponse", targetNamespace = "http://www.example.org/EDMService/", className = "com.nsc.dem.webservice.client.edm.ReceiveFileListResponse")
    public boolean receiveFileList(
        @WebParam(name = "arg0", targetNamespace = "")
        DataHandler arg0,
        @WebParam(name = "pwd", targetNamespace = "")
        String pwd);

    /**
     * 
     * @param pwd
     * @param unitName
     * @param ftpLonginName
     * @param ftpPort
     * @param ftpLoginPass
     * @param ftpIp
     * @param wsAdd
     * @param unitCode
     * @return
     *     returns boolean
     * @throws Exception_Exception
     */
    @WebMethod(action = "http://www.example.org/EDMService/saveServersInfo")
    @WebResult(name = "out", targetNamespace = "")
    @RequestWrapper(localName = "saveServersInfo", targetNamespace = "http://www.example.org/EDMService/", className = "com.nsc.dem.webservice.client.edm.SaveServersInfo")
    @ResponseWrapper(localName = "saveServersInfoResponse", targetNamespace = "http://www.example.org/EDMService/", className = "com.nsc.dem.webservice.client.edm.SaveServersInfoResponse")
    public boolean saveServersInfo(
        @WebParam(name = "unitCode", targetNamespace = "")
        String unitCode,
        @WebParam(name = "unitName", targetNamespace = "")
        String unitName,
        @WebParam(name = "ftpIp", targetNamespace = "")
        String ftpIp,
        @WebParam(name = "ftpLonginName", targetNamespace = "")
        String ftpLonginName,
        @WebParam(name = "ftpLoginPass", targetNamespace = "")
        String ftpLoginPass,
        @WebParam(name = "ftpPort", targetNamespace = "")
        String ftpPort,
        @WebParam(name = "wsAdd", targetNamespace = "")
        String wsAdd,
        @WebParam(name = "pwd", targetNamespace = "")
        String pwd)
        throws Exception_Exception
    ;

    /**
     * 
     * @param pwd
     * @return
     *     returns java.lang.String
     * @throws Exception_Exception
     */
    @WebMethod(action = "http://www.example.org/EDMService/findServersInfo")
    @WebResult(name = "out", targetNamespace = "")
    @RequestWrapper(localName = "findServersInfo", targetNamespace = "http://www.example.org/EDMService/", className = "com.nsc.dem.webservice.client.edm.FindServersInfo")
    @ResponseWrapper(localName = "findServersInfoResponse", targetNamespace = "http://www.example.org/EDMService/", className = "com.nsc.dem.webservice.client.edm.FindServersInfoResponse")
    public String findServersInfo(
        @WebParam(name = "pwd", targetNamespace = "")
        String pwd)
        throws Exception_Exception
    ;

    /**
     * 
     * @param pwd
     * @param ftpContent
     * @param intenterContent
     * @throws Exception_Exception
     */
    @WebMethod(action = "http://www.example.org/EDMService/receiveAllServersInfo")
    @RequestWrapper(localName = "receiveAllServersInfo", targetNamespace = "http://www.example.org/EDMService/", className = "com.nsc.dem.webservice.client.edm.ReceiveAllServersInfo")
    @ResponseWrapper(localName = "receiveAllServersInfoResponse", targetNamespace = "http://www.example.org/EDMService/", className = "com.nsc.dem.webservice.client.edm.ReceiveAllServersInfoResponse")
    public void receiveAllServersInfo(
        @WebParam(name = "ftpContent", targetNamespace = "")
        String ftpContent,
        @WebParam(name = "intenterContent", targetNamespace = "")
        String intenterContent,
        @WebParam(name = "pwd", targetNamespace = "")
        String pwd)
        throws Exception_Exception
    ;

    /**
     * 
     * @param pwd
     * @param ftpContent
     * @param intenterContent
     * @throws Exception_Exception
     */
    @WebMethod(action = "http://www.example.org/EDMService/receivePartServersInfo")
    @RequestWrapper(localName = "receivePartServersInfo", targetNamespace = "http://www.example.org/EDMService/", className = "com.nsc.dem.webservice.client.edm.ReceivePartServersInfo")
    @ResponseWrapper(localName = "receivePartServersInfoResponse", targetNamespace = "http://www.example.org/EDMService/", className = "com.nsc.dem.webservice.client.edm.ReceivePartServersInfoResponse")
    public void receivePartServersInfo(
        @WebParam(name = "ftpContent", targetNamespace = "")
        String ftpContent,
        @WebParam(name = "intenterContent", targetNamespace = "")
        String intenterContent,
        @WebParam(name = "pwd", targetNamespace = "")
        String pwd)
        throws Exception_Exception
    ;

    /**
     * 
     * @param pwd
     * @param username
     * @param fileName
     * @param password
     * @return
     *     returns java.lang.String
     * @throws Exception_Exception
     */
    @WebMethod(action = "http://www.example.org/EDMService/getFileInfo")
    @WebResult(name = "out", targetNamespace = "")
    @RequestWrapper(localName = "getDownLoadFile", targetNamespace = "http://www.example.org/EDMService/", className = "com.nsc.dem.webservice.client.edm.GetDownLoadFile")
    @ResponseWrapper(localName = "getDownLoadFileResponse", targetNamespace = "http://www.example.org/EDMService/", className = "com.nsc.dem.webservice.client.edm.GetDownLoadFileResponse")
    public String getDownLoadFile(
        @WebParam(name = "username", targetNamespace = "")
        String username,
        @WebParam(name = "password", targetNamespace = "")
        String password,
        @WebParam(name = "fileName", targetNamespace = "")
        String fileName,
        @WebParam(name = "pwd", targetNamespace = "")
        String pwd)
        throws Exception_Exception
    ;

    /**
     * 
     * @param pwd
     * @param methodname
     * @return
     *     returns java.lang.String
     * @throws Exception_Exception
     */
    @WebMethod(action = "http://www.example.org/EDMService/doExceuteTask")
    @WebResult(name = "out", targetNamespace = "")
    @RequestWrapper(localName = "doExceuteTask", targetNamespace = "http://www.example.org/EDMService/", className = "com.nsc.dem.webservice.client.edm.DoExceuteTask")
    @ResponseWrapper(localName = "doExceuteTaskResponse", targetNamespace = "http://www.example.org/EDMService/", className = "com.nsc.dem.webservice.client.edm.DoExceuteTaskResponse")
    public String doExceuteTask(
        @WebParam(name = "methodname", targetNamespace = "")
        String methodname,
        @WebParam(name = "pwd", targetNamespace = "")
        String pwd)
        throws Exception_Exception
    ;

    /**
     * 
     * @param failFileID
     * @param pwd
     * @param successFileID
     * @param unitCode
     * @return
     *     returns boolean
     */
    @WebMethod(action = "http://www.example.org/EDMService/receiveSynFileID")
    @WebResult(name = "out", targetNamespace = "")
    @RequestWrapper(localName = "receiveSynFileID", targetNamespace = "http://www.example.org/EDMService/", className = "com.nsc.dem.webservice.client.edm.ReceiveSynFileID")
    @ResponseWrapper(localName = "receiveSynFileIDResponse", targetNamespace = "http://www.example.org/EDMService/", className = "com.nsc.dem.webservice.client.edm.ReceiveSynFileIDResponse")
    public boolean receiveSynFileID(
        @WebParam(name = "successFileID", targetNamespace = "")
        String successFileID,
        @WebParam(name = "failFileID", targetNamespace = "")
        String failFileID,
        @WebParam(name = "unitCode", targetNamespace = "")
        String unitCode,
        @WebParam(name = "pwd", targetNamespace = "")
        String pwd);

}
