package org.arbiter.optimize.parameter.continuous;

import org.apache.commons.math3.distribution.RealDistribution;
import org.apache.commons.math3.distribution.UniformRealDistribution;
import org.arbiter.optimize.parameter.ParameterSpace;

public class ContinuousParameterSpace implements ParameterSpace<Double> {

    //TODO: Do we use Apache commons RealDistribution? Works fine, but whether we
    private RealDistribution distribution;

    public ContinuousParameterSpace(double min, double max){
        this(new UniformRealDistribution(min,max));
    }

    public ContinuousParameterSpace(RealDistribution distribution){
        this.distribution = distribution;
    }

    @Override
    public Double randomValue() {
        return distribution.sample();
    }
}