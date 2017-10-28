package example.controller;

import example.entity.Bank;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService()
public class BankController
{
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

        for( Bank b : allBanks )
        {

            if( creditScore <= b.getMinCreditScore() )
            {

                filteredBanks.add( b );
            }
        }
        return filteredBanks;
    }

    private void addBanksToList()
    {
        banks = new ArrayList<>();
        int[] minCreditScores = { 300, 50 };
        String[] translatorIds = { "group3.reciplist.xmltranslator", "group3.reciplist.jsontranslator" };

        for( int i = 0; i < minCreditScores.length; i++ )
        {
            banks.add( new Bank( translatorIds[ i ], "Bank " + i, minCreditScores[ i ] ) );
        }
    }
}
