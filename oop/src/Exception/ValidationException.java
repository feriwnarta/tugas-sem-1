/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exception;

/**
 *
 * @author Feri Winarta
 */
public class ValidationException extends Throwable{
    public ValidationException(String message) {
        super(message);
    }
}
