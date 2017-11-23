package testClasses;

import org.zmeu.blog.jaxb.RetrieveMulderDetailsResponseData;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Heralt on 11.07.2017.
 */
public class MulderDataDAO {
    String humanResourceName;
    String humanResourceCode;

    private List<TimePeriodDAO> timePeriods = new ArrayList<>();
    private List<VerdictDAO> verdicts;

    public MulderDataDAO(RetrieveMulderDetailsResponseData.MulderAgent mulderAgent) {

        this.humanResourceCode = mulderAgent.getMulderCode();
        this.humanResourceName = mulderAgent.getMulderName();

        List<TimePeriodDAO> timePeriods = new ArrayList<>();
        List<RetrieveMulderDetailsResponseData.MulderAgent.TimePeriods.TimePeriod> periods = mulderAgent.getTimePeriods().getTimePeriod();
        for (RetrieveMulderDetailsResponseData.MulderAgent.TimePeriods.TimePeriod timePeriod : periods){
            timePeriods.add(new TimePeriodDAO(timePeriod));
        }
        List<VerdictDAO> verdicts = new ArrayList<>();
        List<RetrieveMulderDetailsResponseData.MulderAgent.Verdicts.Verdict> verdictList = mulderAgent.getVerdicts().getVerdict();

        for (RetrieveMulderDetailsResponseData.MulderAgent.Verdicts.Verdict verdict : verdictList) {
            verdicts.add(new VerdictDAO(verdict));
        }
        this.timePeriods = timePeriods;
        this.verdicts = verdicts;
    }


//    public MulderDataDAO(OSRData osr) {
//        this.humanResourceCode = osr.getOSRCode();
//        this.humanResourceName = osr.getOSRName();
//
//        List<TimePeriodDAO> timePeriods = new ArrayList<>();
//        List<TimePeriod> periods = osr.getTimePeriods().getTimePeriod();
//        for (TimePeriod timePeriod : periods){
//            timePeriods.add(new TimePeriodDAO(timePeriod));
//        }
//        List<VerdictDAO> verdicts = new ArrayList<>();
//        List<Verdict> verdictList = osr.getVerdicts().getVerdict();
//
//        for (Verdict verdict : verdictList) {
//            verdicts.add(new VerdictDAO(verdict));
//        }
//        this.timePeriods = timePeriods;
//        this.verdicts = verdicts;
//    }
//
//    public MulderDataDAO(RetrieveOSRDetailsResponseData.OSR osr) {
//        this.humanResourceCode = osr.getOSRCode();
//        this.humanResourceName = osr.getOSRName();
//        List<TimePeriodDAO> timePeriods = new ArrayList<>();
//        List<RetrieveOSRDetailsResponseData.OSR.TimePeriods.ListofTimePeriod> periods = osr.getTimePeriods().getListofTimePeriod();
//        for (RetrieveOSRDetailsResponseData.OSR.TimePeriods.ListofTimePeriod timePeriod : periods){
//            timePeriods.add(new TimePeriodDAO(timePeriod));
//        }
//        List<VerdictDAO> verdicts = new ArrayList<>();
//        List<RetrieveOSRDetailsResponseData.OSR.Verdicts.Verdict> verdictList = osr.getVerdicts().getVerdict();
//
//        for (RetrieveOSRDetailsResponseData.OSR.Verdicts.Verdict verdict : verdictList) {
//            verdicts.add(new VerdictDAO(verdict));
//        }
//        this.timePeriods = timePeriods;
//        this.verdicts = verdicts;
//
//    }

    public List<TimePeriodDAO> getTimePeriods() {
        return timePeriods;
    }

    public String getHumanResourceName() {
        return humanResourceName;
    }

    public String getHumanResourceCode() {
        return humanResourceCode;
    }

    public List<VerdictDAO> getVerdicts() {
        return verdicts;
    }
}
