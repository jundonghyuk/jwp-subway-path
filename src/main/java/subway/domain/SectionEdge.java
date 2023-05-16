package subway.domain;

import org.jgrapht.graph.DefaultWeightedEdge;

public class SectionEdge extends DefaultWeightedEdge {

    private final Section section;

    public SectionEdge(Section section) {
        this.section = section;
    }

    public Long getUpBoundStationId() {
        return section.getUpBoundStationId();
    }

    public Long getDownBoundStationId() {
        return section.getDownBoundStationId();
    }

    @Override
    protected double getWeight() {
        return section.getDistance();
    }

    public Section getSection() {
        return section;
    }
}
