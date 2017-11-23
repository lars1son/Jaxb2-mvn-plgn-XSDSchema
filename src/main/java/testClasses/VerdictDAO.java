package testClasses;

import org.zmeu.blog.jaxb.RetrieveMulderDetailsResponseData;

/**
 * Created by Heralt on 11.07.2017.
 */
public class VerdictDAO {
    private int numberOfCases;
    private String verdictType;


    public VerdictDAO(RetrieveMulderDetailsResponseData.MulderAgent.Verdicts.Verdict verdict){
        this.numberOfCases = verdict.getNumberOfCases();
        this.verdictType = verdict.getVerdictType();
    }

    public int getNumberOfCases() {
        return numberOfCases;
    }

    public String getVerdictType() {
        return verdictType;
    }
}
