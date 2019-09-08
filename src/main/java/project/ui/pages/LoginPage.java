/*
 * @(#) LoginPage.java Copyright (c) 2019 Jala Foundation.
 * 2643 Av. Melchor Perez de Olguin, Colquiri Sud, Cochabamba, Bolivia.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Jala Foundation, ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Jala Foundation.
 */

package project.ui.pages;

import core.selenium.AmazonConfig;
import core.utils.AmazonUtils;
import org.openqa.selenium.By;

/**
 * LoginPage class.
 *
 * @author John Salazar Pinto
 * @version 1.0
 */
public class LoginPage extends AmazonUtils {
    AmazonConfig amazonConfig;

    /**
     * Fills user name and password.
     */
    public void fillUserNamePassword() {
        sendKey(By.id("ap_email"), amazonConfig.getInstance().getUsername());
        click(By.cssSelector(".a-button-inner > #continue"));
        sendKey(By.id("ap_password"), amazonConfig.getInstance().getPassword());
        click(By.id("signInSubmit"));
    }

    /**
     * Get the result of the math operation.
     */
    public String message() {
        return message(By.className("a-row"));
    }
}
