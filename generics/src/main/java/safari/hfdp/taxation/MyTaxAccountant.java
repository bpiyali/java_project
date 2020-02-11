package safari.hfdp.taxation;

import java.util.Arrays;
import java.util.List;

public class MyTaxAccountant {
  public static void prepareTaxes(Taxable t) {
  }

  // "Co-variance"
  public static void prepareBulkTaxes(List<? extends Taxable> lt) {
    // OK for List<Taxable> BUT NOT for List<Individual>
//    lt.add(new Individual());
    for (Taxable t : lt) {
      prepareTaxes(t);
    }
  }

  // ? super X is usually called "contravariance"
  public static void collectIndividualClients(List<? super Individual> cl) {
    cl.add(new Individual());
    cl.add(new Retiree());
//    Individual i = cl.get(0);
  }

  public static void main(String[] args) {
    List<Taxable> clients = Arrays.asList(
        new Individual(), new Retiree(), new Corporation(), new Charity()
    );

    collectIndividualClients(clients);
    prepareBulkTaxes(clients);

    List<Individual> billsClients = Arrays.asList(new Individual(), new Retiree());
    collectIndividualClients(billsClients);

    prepareBulkTaxes(billsClients);

//    prepareBulkTaxes(Arrays.asList("Fred"));

    List<Object> lo = Arrays.asList();
    collectIndividualClients(lo);
  }
}
