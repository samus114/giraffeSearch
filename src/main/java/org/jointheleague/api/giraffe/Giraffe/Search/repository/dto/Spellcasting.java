
package org.jointheleague.api.giraffe.Giraffe.Search.repository.dto;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "level",
        "spellcasting_ability",
        "info"
})
@Generated("jsonschema2pojo")
public class Spellcasting {

    @JsonProperty("level")
    private Integer level;
    @JsonProperty("spellcasting_ability")
    private SpellcastingAbility spellcastingAbility;
    @JsonProperty("info")
    private List<Info> info = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("level")
    public Integer getLevel() {
        return level;
    }

    @JsonProperty("level")
    public void setLevel(Integer level) {
        this.level = level;
    }

    @JsonProperty("spellcasting_ability")
    public SpellcastingAbility getSpellcastingAbility() {
        return spellcastingAbility;
    }

    @JsonProperty("spellcasting_ability")
    public void setSpellcastingAbility(SpellcastingAbility spellcastingAbility) {
        this.spellcastingAbility = spellcastingAbility;
    }

    @JsonProperty("info")
    public List<Info> getInfo() {
        return info;
    }

    @JsonProperty("info")
    public void setInfo(List<Info> info) {
        this.info = info;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}