package pan.enrollmentforecast.DataProvider;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.*;

/**
 * This class echoes a string called from JavaScript.
 */
public class DataProvider extends CordovaPlugin {

    /**
     * Executes the request and returns PluginResult.
     *
     * @param action        The action to execute.
     * @param args          JSONArry of arguments for the plugin.
     * @param callbackId    The callback id used when calling back into JavaScript.
     * @return              A PluginResult object with a status and message.
     */
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
       
            System.out.println("In execute! ");
            if (action.equals("getExamList")) {
                callbackContext.success ( "Success!!!" );        
                return true; 
                
            } else {
                return false;
            }
        
    }
}
