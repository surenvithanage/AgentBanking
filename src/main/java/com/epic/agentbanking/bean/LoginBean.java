/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epic.agentbanking.bean;

/**
 *
 * @author shalini_w
 */
public class LoginBean {
    private String username;
    private String password;
    private byte attempts;
    private String status;
    private String message;
    private String choosesection;
    private String hchoosesection;
    private String version;
    private String logo;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public byte getAttempts() {
        return attempts;
    }

    public void setAttempts(byte attempts) {
        this.attempts = attempts;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getChoosesection() {
        return choosesection;
    }

    public void setChoosesection(String choosesection) {
        this.choosesection = choosesection;
    }

    public String getHchoosesection() {
        return hchoosesection;
    }

    public void setHchoosesection(String hchoosesection) {
        this.hchoosesection = hchoosesection;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }
    
    
}
