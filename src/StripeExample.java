import java.util.Map;import java.util.HashMap;import com.stripe.model.Charge;import com.stripe.Stripe;import com.stripe.exception.AuthenticationException;import com.stripe.exception.InvalidRequestException;import com.stripe.exception.APIConnectionException;import com.stripe.exception.CardException;import com.stripe.exception.APIException;/** * Created by Hoshiko on 4/19/15. */public class StripeExample{    public static void main(String[] args)        throws AuthenticationException,                InvalidRequestException,                APIConnectionException,                CardException,                APIException {        Stripe.apiKey = "tGN0bIwXnHdwOa85VABjPdSn8nWY7G7I"; // stripe public test key    //Print out the email addresses of all the customers.    //Print out the number of customers.            final Map<String, Object> cardParams = new HashMap<String, Object>();            cardParams.put("number", "4242424242424242");            cardParams.put("exp_month", 12);            cardParams.put("exp_year", 2015);            cardParams.put("cvc", "123");            cardParams.put("name", "J Bindings Cardholder");            cardParams.put("address_line1", "140 2nd Street");            cardParams.put("address_line2", "4th Floor");            cardParams.put("address_city", "San Francisco");            cardParams.put("address_zip", "94105");            cardParams.put("address_state", "CA");            cardParams.put("address_country", "USA");    //Create a charge, then retrieve the same charge.            final Map<String, Object> chargeParams = new HashMap<String, Object>();            chargeParams.put("amount", 100);            chargeParams.put("currency", "usd");            chargeParams.put("card", cardParams);            final Charge charge = Charge.create(chargeParams);            System.out.println(charge);//Refund the charge you created in step 3.//Create, update and then delete a customer.//Create, update and then delete an invoice.//Try creating or retreiving data from one more type of object of your choosing.    }}