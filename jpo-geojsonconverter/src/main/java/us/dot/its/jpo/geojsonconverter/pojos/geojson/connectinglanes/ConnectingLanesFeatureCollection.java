package us.dot.its.jpo.geojsonconverter.pojos.geojson.connectinglanes;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import us.dot.its.jpo.geojsonconverter.DateJsonMapper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@JsonIgnoreProperties(value={ "type" }, allowGetters=true)
@JsonPropertyOrder({"type", "features"})
public class ConnectingLanesFeatureCollection<TFeature> {
    private static Logger logger = LoggerFactory.getLogger(ConnectingLanesFeatureCollection.class);

    private final TFeature[] features;

    @JsonCreator
    public ConnectingLanesFeatureCollection(@JsonProperty("features") TFeature[] features) {
        this.features = features;
    }

    @JsonProperty("type")
    public String getType() {
        return "FeatureCollection";
    }

    public TFeature[] getFeatures() {
        return features;
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
