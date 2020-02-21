package com.amadeus.booking;

import com.amadeus.Amadeus;
import com.amadeus.Params;
import com.amadeus.Response;
import com.amadeus.exceptions.ResponseException;
import com.amadeus.resources.Resource;

/**
 * <p>
 *   A namespaced client for the
 *   <code>/v1/booking/flight-orders:flightOrderId</code> endpoints.
 * </p>
 *
 * <p>
 *   Access via the Amadeus client object.
 * </p>
 *
 * <pre>
 * Amadeus amadeus = Amadeus.builder("clientId", "secret").build();
 * amadeus.booking.flightOrder;</pre>
 */
public class FlightOrder {
  private Amadeus client;
  private String flightOfferId;

  /**
   * Constructor.
   * @hide
   */
  public FlightOrder(Amadeus client, String flightOfferId) {
    this.client = client;
    this.flightOfferId = flightOfferId;
  }

  /**
   * <p>
   *   Allows you to manipulate a flight order.
   * </p>
   *
   * <pre>
   *  com.amadeus.resources.FlightOrder order = amadeus.booking.flightOrder.(
   * "4BA070CE929E135B3268A9F2D0C51E9D4A6CF318BA10485322FA2C7E78C7852E").get();
   * </pre>
   * @param params the parameters to send to the API
   * @return an API response object
   * @throws ResponseException when an exception occurs
   */

  public com.amadeus.resources.FlightOrder get(Params params) throws ResponseException {
    String path = String.format("/v1/booking/flight-orders/%s", flightOfferId);
    Response response = client.get(path, params);
    return (com.amadeus.resources.FlightOrder) Resource.fromObject(
        response, com.amadeus.resources.FlightOrder.class);
  }
  
  /**
   * Convenience method for calling <code>get</code> without any parameters.
   * @see com.amadeus.booking.FlightOrder#get()
   */
  public com.amadeus.resources.FlightOrder get() throws ResponseException {
    return get(null);
  }
}
