package com.ociweb.iot.hz;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Ignore;
import org.junit.Test;

import com.ociweb.iot.hardware.impl.test.TestHardware;
import com.ociweb.iot.maker.FogRuntime;
import com.ociweb.pronghorn.stage.scheduling.ScriptedNonThreadScheduler;

/**
 * Unit test for simple App.
 */
public class AppTest { 

	//this test reqires network connectivity of some kind 
	// HZ  may end up hanging this test if it can not find what it is lookoing for.
	 @Ignore
	    public void testApp()
	    {
	    	FogRuntime runtime = FogRuntime.test(new IoTApp());
			ScriptedNonThreadScheduler scheduler = (ScriptedNonThreadScheduler)runtime.getScheduler();
	    
	    	scheduler.startup();
	    	    	
	    	TestHardware hardware = (TestHardware)runtime.getHardware();
	    	
	    	
	    	int iterations = 10;
			while (--iterations >= 0) {
				    		
					scheduler.run();
					
					//test application here
					
			}
	    }
}
