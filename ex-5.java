//Main.java

public class Main {
  public static void main(String[] args) {
    Euro balance_start = new Euro(100.0f);
    Euro balance_increased_1 = balance_start.addedCurrency(23.55f, "USD");
    System.out.println(balance_increased_1.balance());
    Euro balance_increased_2 = balance_start.addedCurrency(10.05f, "JPY");
    System.out.println(balance_increased_2.balance());
    Euro balance_decreased_1 = balance_start.subtractedCurrency(23.55f, "CHF");
    System.out.println(balance_decreased_1.balance());
    Euro balance_decreased_2 = balance_start.subtractedCurrency(123.55f, "CHF");
    System.out.println(balance_decreased_2.balance());
  }
}

//FakeCantor.java

import java.util.HashMap;

public class FakeCantor {
  private final HashMap<String, Float> rates = new HashMap<>() {{
    put("USD", 1.0366f);
    put("GBP", 0.87063f);
    put("CHF", 0.9881f);
    put("JPY", 145.12f);
  }};


  public float euroToRate(String currency) {
    return this.rates.get(currency);
  }

  public FakeCantor() {
  }

}

//Euro.java

public class Euro implements Currency {
  private FakeCantor fkc = new FakeCantor();
  private float amount;

  public String symbol() {
    return "€";
  }
  public String abbreviation() {
    return "EUR";
  }
  public float toDollarExchangeRate() {
    return fkc.euroToRate("GPB");
  }
  public String balance() {
    return String.format("%.2f%s", this.amount, this.symbol()) ;
  }
  public Euro(float input_amount) {
    this.amount = input_amount;
  }
  public Euro addedCurrency(float value, String currency) {
    float rate = fkc.euroToRate(currency);
    return new Euro(this.amount + value / rate);
  }
  public Euro subtractedCurrency(float value, String currency) {
    float rate = fkc.euroToRate(currency);
    if (this.amount - value / rate <= 0){
        System.out.println("You don't have much money :(");
        return new Euro(this.amount);
        }
    else{
        return new Euro(this.amount - value / rate);
    }
  }
}

//Currency.java

public interface Currency {
  Currency addedCurrency(float value, String currency);
  Currency subtractedCurrency(float value, String currency);
  String abbreviation();
  String symbol();
  String balance();
  float toDollarExchangeRate();
}
