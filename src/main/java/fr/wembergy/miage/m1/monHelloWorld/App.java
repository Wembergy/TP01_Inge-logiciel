package fr.wembergy.miage.m1.monHelloWorld;

import org.apache.log4j.Logger;
/**
 * Hello world!
 *
 */
public class App 
{
    private static final Logger LOGGER = Logger.getLogger(App.class);
	
    public static void main( String[] args )
    {
    	LOGGER.info("ceci est un message de niveau info");
        Hello hello = new Hello();
        hello.setChaine();
        hello.afficheur(hello.getChaine());
    }
}
