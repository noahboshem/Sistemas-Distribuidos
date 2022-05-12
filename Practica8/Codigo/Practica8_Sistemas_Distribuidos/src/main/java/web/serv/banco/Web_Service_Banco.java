/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package web.serv.banco;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Noe.Rosales
 */
@WebService(serviceName = "Web_Service_Banco")
public class Web_Service_Banco {

    /**
     * This is a sample web service operation
     */

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Pagar")
    public Boolean Pagar(@WebParam(name = "Numero_Tarjeta") int Numero_Tarjeta, @WebParam(name = "Monto") int Monto, @WebParam(name = "Nombre") String Nombre, @WebParam(name = "CVV") String CVV) {
        //TODO write your implementation code here:
        
        
        return true;
    }
}
