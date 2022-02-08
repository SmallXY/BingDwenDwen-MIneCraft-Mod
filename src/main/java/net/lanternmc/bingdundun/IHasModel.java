package net.lanternmc.bingdundun;

/**
 * Every item that implements this interface needs to register it's own model.
 * 
 * @author Subaro
 */
public interface IHasModel {

    /**
     * This method is called if the client proxy is ready to receive registrations for models.
     */
    void registerModel();
}