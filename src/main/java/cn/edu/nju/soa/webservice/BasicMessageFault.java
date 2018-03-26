
package cn.edu.nju.soa.webservice;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.2.3
 * 2018-03-26T19:06:38.544+08:00
 * Generated source version: 3.2.3
 */

@WebFault(name = "InvalidParamFault", targetNamespace = "http://jw.nju.edu.cn/schema")
public class BasicMessageFault extends Exception {

    private cn.edu.nju.soa.model.ParamFaultType invalidParamFault;

    public BasicMessageFault() {
        super();
    }

    public BasicMessageFault(String message) {
        super(message);
    }

    public BasicMessageFault(String message, cn.edu.nju.soa.model.ParamFaultType invalidParamFault) {
        super(message);
        this.invalidParamFault = invalidParamFault;
    }

    public BasicMessageFault(String message, cn.edu.nju.soa.model.ParamFaultType invalidParamFault, Throwable cause) {
        super(message, cause);
        this.invalidParamFault = invalidParamFault;
    }

    public cn.edu.nju.soa.model.ParamFaultType getFaultInfo() {
        return this.invalidParamFault;
    }
}
