/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sonar;

import java.io.Serializable;
import java.util.Set;

/**
 *
 * @author Herianto
 */
public class Person implements Serializable{
    private static final long serialVersionUID = 1905122041950251207L;

    private String name;
    private Address address;  // Noncompliant; Address isn't serializable
    private Set batchId;
}
