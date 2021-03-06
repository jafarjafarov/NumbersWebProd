/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services.Interfaces;

import Models.PhoneUser;

/**
 *
 * @author jafar.j
 */
public interface IGetAsteriskUsers {
    public Iterable<PhoneUser> getAllElements();

    public Iterable<PhoneUser> getElementByName(String name);

    public Iterable<PhoneUser> getElementByPhone(String phoneNum);
}
