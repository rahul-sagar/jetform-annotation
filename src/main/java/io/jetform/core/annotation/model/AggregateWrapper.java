package io.jetform.core.annotation.model;

import io.jetform.core.annotation.Aggregate;
import io.jetform.core.enums.AggregationType;

public class AggregateWrapper {
	private String element;
	private AggregationType aggregateType;

	public AggregateWrapper(Aggregate aggregate) {
        setElement(aggregate.element());
        setAggregateType(aggregate.type());
	}

	public String getElement() {
		return element;
	}

	public void setElement(String element) {
		this.element = element;
	}

	public AggregationType getAggregateType() {
		return aggregateType;
	}

	public void setAggregateType(AggregationType aggregateType) {
		this.aggregateType = aggregateType;
	}

	@Override
	public String toString() {
		return "AggregateWrapper [element=" + element + ", aggregateType=" + aggregateType + "]";
	}
	
}
