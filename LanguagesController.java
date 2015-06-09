/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.ResourceBundle;

/**
 *
 * @author albert.motos
 */
public class LanguagesController {
    
    private Map<String, Locale> supportedLanguages;
    private ResourceBundle translation;

    public LanguagesController() {
        Locale Spanish = new Locale("Spanish","Español","es");
        supportedLanguages = new HashMap();
        supportedLanguages.put("Spanish", Spanish);
        supportedLanguages.put("English",Locale.ENGLISH); 
    }

    
    public LanguagesController(String language){
        this();
        
        translation = ResourceBundle.getBundle("javaapplication1/languages", supportedLanguages.getOrDefault(language, Locale.ENGLISH));
        
    }

    public String getWord(String keyword)
    {
        try {
            return translation.getString(keyword);
        } catch (Exception e) {
            return "Undefined";
        }
        
    }

}
