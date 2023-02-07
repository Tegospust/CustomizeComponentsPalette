/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ounis.customjlist;

import javax.swing.JList;

import java.io.Serializable;

/**
 *  Źródła:
 *  https://stackoverflow.com/questions/11200391/adding-component-to-palette-on-netbeans-ide
 *  https://stackoverflow.com/questions/17131589/how-to-change-non-editable-generated-code-in-netbeans
 * 
 * @author AndroidDev
 */
public class CustomJList extends JList implements Serializable {
    private String cname;
    public String getCName() {
        return this.cname;
    }
    public void setCName(String aNewCName) {
        this.cname = aNewCName;
    }
    
    private boolean active;
    public boolean isActive() {
        return this.active;
    }
    
}
    

