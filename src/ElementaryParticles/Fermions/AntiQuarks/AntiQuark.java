package ElementaryParticles.Fermions.AntiQuarks;

import ElementaryParticles.Fermions.Quarks.Generation;
import IntrinsicProperties.ElectricCharge;

public abstract class AntiQuark {
    ElectricCharge electricCharge;
    double electricChargeValue;
    long mass;
    String colorCharge;
    double Spin = 0.5;
    Generation generation;
}
