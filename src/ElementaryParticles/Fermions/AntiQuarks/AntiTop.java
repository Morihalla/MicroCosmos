package ElementaryParticles.Fermions.AntiQuarks;

import ElementaryParticles.Fermions.Quarks.Generation;
import IntrinsicProperties.ElectricCharge;

public class AntiTop extends AntiQuark {
    Generation generation = Generation.THIRD;
    ElectricCharge electricCharge = ElectricCharge.NEGATIVE;
    double electricChargeValue = -(2/3);
}
