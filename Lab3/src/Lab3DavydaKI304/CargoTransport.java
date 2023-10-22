package Lab3DavydaKI304;

/**
 * Interface for cargo transport vehicles.
 *
 * This interface defines methods for loading and unloading cargo on a cargo transport vehicle.
 */
public interface CargoTransport {
    /**
     * Loads cargo onto the transport vehicle.
     *
     * @param weight The weight of the cargo to be loaded.
     */
    void loadCargo(int weight);

    /**
     * Unloads cargo from the transport vehicle.
     *
     * @param weight The weight of the cargo to be unloaded.
     */
    void unloadCargo(int weight);
}
