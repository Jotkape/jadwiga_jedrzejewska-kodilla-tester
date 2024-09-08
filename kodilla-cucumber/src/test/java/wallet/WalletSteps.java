package wallet;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class WalletSteps {
    private Wallet wallet;
    private CashSlot cashSlot;

    @Before
    public void resetState() {
        wallet = new Wallet();
        cashSlot = new CashSlot();
    }

    @Given("I have deposited ${int} in my wallet")
    public void i_have_deposited_$int_in_my_wallet(int amount) {
        wallet.deposit(amount);
        assertEquals(amount, wallet.getBalance());
    }

    @When("I request ${int}")
    public void i_request_$int(int amount) {
        Cashier cashier = new Cashier(cashSlot);
        cashier.withdraw(wallet, amount);
    }
    @Then("${int} should be dispensed")
    public void $int_should_be_dispensed(int amount) {
        assertEquals(amount, cashSlot.getContents());
    }
    @Then("the balance of my wallet should be ${int}")
    public void the_balance_of_my_wallet_should_be_$int(int amount) {
        assertEquals(amount,  wallet.getBalance(), "incorrect wallet balance");
    }
}
