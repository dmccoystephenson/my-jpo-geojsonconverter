
package us.dot.its.jpo.geojsonconverter.pojos.spat;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import us.dot.its.jpo.geojsonconverter.DateJsonMapper;
import us.dot.its.jpo.ode.plugin.j2735.J2735IntersectionStatusObject;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class IntersectionStatusObject {
    private static Logger logger = LoggerFactory.getLogger(IntersectionStatusObject.class);

    private Boolean manualControlIsEnabled = false;
    private Boolean stopTimeIsActivated = false;
    private Boolean failureFlash = false;
    private Boolean preemptIsActive = false;
    private Boolean signalPriorityIsActive = false;
    private Boolean fixedTimeOperation = false;
    private Boolean trafficDependentOperation = false;
    private Boolean standbyOperation = false;
    private Boolean failureMode = false;
    private Boolean off = false;
    private Boolean recentMAPmessageUpdate = false;
    private Boolean recentChangeInMAPassignedLanesIDsUsed = false;
    private Boolean noValidMAPisAvailableAtThisTime = false;
    private Boolean noValidSPATisAvailableAtThisTime = false;

    public Boolean getManualControlIsEnabled() {
        return manualControlIsEnabled;
    }

    public void setManualControlIsEnabled(Boolean manualControlIsEnabled) {
        this.manualControlIsEnabled = manualControlIsEnabled;
    }

    public Boolean getStopTimeIsActivated() {
        return stopTimeIsActivated;
    }

    public void setStopTimeIsActivated(Boolean stopTimeIsActivated) {
        this.stopTimeIsActivated = stopTimeIsActivated;
    }

    public Boolean getFailureFlash() {
        return failureFlash;
    }

    public void setFailureFlash(Boolean failureFlash) {
        this.failureFlash = failureFlash;
    }

    public Boolean getPreemptIsActive() {
        return preemptIsActive;
    }

    public void setPreemptIsActive(Boolean preemptIsActive) {
        this.preemptIsActive = preemptIsActive;
    }

    public Boolean getSignalPriorityIsActive() {
        return signalPriorityIsActive;
    }

    public void setSignalPriorityIsActive(Boolean signalPriorityIsActive) {
        this.signalPriorityIsActive = signalPriorityIsActive;
    }

    public Boolean getFixedTimeOperation() {
        return fixedTimeOperation;
    }

    public void setFixedTimeOperation(Boolean fixedTimeOperation) {
        this.fixedTimeOperation = fixedTimeOperation;
    }

    public Boolean getTrafficDependentOperation() {
        return trafficDependentOperation;
    }

    public void setTrafficDependentOperation(Boolean trafficDependentOperation) {
        this.trafficDependentOperation = trafficDependentOperation;
    }

    public Boolean getStandbyOperation() {
        return standbyOperation;
    }

    public void setStandbyOperation(Boolean standbyOperation) {
        this.standbyOperation = standbyOperation;
    }

    public Boolean getFailureMode() {
        return failureMode;
    }

    public void setFailureMode(Boolean failureMode) {
        this.failureMode = failureMode;
    }

    public Boolean getOff() {
        return off;
    }

    public void setOff(Boolean off) {
        this.off = off;
    }

    public Boolean getRecentMAPmessageUpdate() {
        return recentMAPmessageUpdate;
    }

    public void setRecentMAPmessageUpdate(Boolean recentMAPmessageUpdate) {
        this.recentMAPmessageUpdate = recentMAPmessageUpdate;
    }

    public Boolean getRecentChangeInMAPassignedLanesIDsUsed() {
        return recentChangeInMAPassignedLanesIDsUsed;
    }

    public void setRecentChangeInMAPassignedLanesIDsUsed(Boolean recentChangeInMAPassignedLanesIDsUsed) {
        this.recentChangeInMAPassignedLanesIDsUsed = recentChangeInMAPassignedLanesIDsUsed;
    }

    public Boolean getNoValidMAPisAvailableAtThisTime() {
        return noValidMAPisAvailableAtThisTime;
    }

    public void setNoValidMAPisAvailableAtThisTime(Boolean noValidMAPisAvailableAtThisTime) {
        this.noValidMAPisAvailableAtThisTime = noValidMAPisAvailableAtThisTime;
    }

    public Boolean getNoValidSPATisAvailableAtThisTime() {
        return noValidSPATisAvailableAtThisTime;
    }

    public void setNoValidSPATisAvailableAtThisTime(Boolean noValidSPATisAvailableAtThisTime) {
        this.noValidSPATisAvailableAtThisTime = noValidSPATisAvailableAtThisTime;
    }

    public void setStatus(J2735IntersectionStatusObject status){
        switch(status){
            case MANUALCONTROLISENABLED:
                setManualControlIsEnabled(true);
                break;
            case STOPTIMEISACTIVATED:
                setStopTimeIsActivated(true);
                break;
            case FAILUREFLASH:
                setFailureFlash(true);
                break;
            case PREEMPTISACTIVE:
                setPreemptIsActive(true);
                break;
            case SIGNALPRIORITYISACTIVE:
                setSignalPriorityIsActive(true);
                break;
            case FIXEDTIMEOPERATION:
                setFixedTimeOperation(true);
                break;
            case TRAFFICDEPENDENTOPERATION:
                setTrafficDependentOperation(true);
                break;
            case STANDBYOPERATION:
                setStandbyOperation(true);
                break;
            case FAILUREMODE:
                setFailureMode(true);
                break;
            case OFF:
                setOff(true);
                break;
            case RECENTMAPMESSAGEUPDATE:
                setRecentMAPmessageUpdate(true);
                break;
            case RECENTCHANGEINMAPASSIGNEDLANESIDSUSED:
                setRecentChangeInMAPassignedLanesIDsUsed(true);
                break;
            case NOVALIDMAPISAVAILABLEATTHISTIME:
                setNoValidMAPisAvailableAtThisTime(true);
                break;
            case NOVALIDSPATISAVAILABLEATTHISTIME:
                setNoValidSPATisAvailableAtThisTime(true);
                break;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof IntersectionStatusObject)) {
            return false;
        }
        IntersectionStatusObject intersectionStatusObject = (IntersectionStatusObject) o;
        return manualControlIsEnabled == intersectionStatusObject.manualControlIsEnabled && stopTimeIsActivated == intersectionStatusObject.stopTimeIsActivated && failureFlash == intersectionStatusObject.failureFlash && preemptIsActive == intersectionStatusObject.preemptIsActive && signalPriorityIsActive == intersectionStatusObject.signalPriorityIsActive && fixedTimeOperation == intersectionStatusObject.fixedTimeOperation && trafficDependentOperation == intersectionStatusObject.trafficDependentOperation && standbyOperation == intersectionStatusObject.standbyOperation && failureMode == intersectionStatusObject.failureMode && off == intersectionStatusObject.off && recentMAPmessageUpdate == intersectionStatusObject.recentMAPmessageUpdate && recentChangeInMAPassignedLanesIDsUsed == intersectionStatusObject.recentChangeInMAPassignedLanesIDsUsed && noValidMAPisAvailableAtThisTime == intersectionStatusObject.noValidMAPisAvailableAtThisTime && noValidSPATisAvailableAtThisTime == intersectionStatusObject.noValidSPATisAvailableAtThisTime;
    }

    @Override
    public int hashCode() {
        return Objects.hash(manualControlIsEnabled, stopTimeIsActivated, failureFlash, preemptIsActive, signalPriorityIsActive, fixedTimeOperation, trafficDependentOperation, standbyOperation, failureMode, off, recentMAPmessageUpdate, recentChangeInMAPassignedLanesIDsUsed, noValidMAPisAvailableAtThisTime, noValidSPATisAvailableAtThisTime);
    }

    @Override
    public String toString() {
        ObjectMapper mapper = DateJsonMapper.getInstance();
        String testReturn = "";
        try {
            testReturn = (mapper.writeValueAsString(this));
        } catch (JsonProcessingException e) {
            logger.error(e.getMessage(), e);
        }
        return testReturn;
    }

}
