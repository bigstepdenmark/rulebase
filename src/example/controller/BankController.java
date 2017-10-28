package example.controller;

import example.entity.Bank;
import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService()
public class BankController
{
    private static final int[] minCreditScores = { 300, 50, 450, 700, 140 };
    private List<Bank> banks;

    public BankController()
    {
        addBanksToList();
    }

    @WebMethod
    public List<Bank> getBanks()
    {
        return banks;
    }

    @WebMethod
    public List<Bank> getFilteredBanks( int creditScore )
    {
        List<Bank> filteredBanks = new ArrayList<>();
        List<Bank> allBanks = getBanks();

        for (Bank b: allBanks) {

            if(creditScore <= b.getMinCreditScore()){

                filteredBanks.add(b);
            }
        }
        return filteredBanks;
    }

    private void addBanksToList()
    {
        banks = new ArrayList<>();

        for( int i = 0; i < minCreditScores.length; i++ )
        {
            banks.add( new Bank( 1, "Bank " + i, minCreditScores[ i ] ) );
        }
    }
}
