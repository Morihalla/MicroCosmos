package ElementaryParticles.Fermions.AntiQuarks;

import ElementaryParticles.Fermions.Quarks.Generation;
import IntrinsicProperties.ElectricCharge;

public class AntiDown extends AntiQuark {
    Generation generation = Generation.FIRST;
    ElectricCharge electricCharge = ElectricCharge.POSITIVE;
    double electricChargeValue = 1/3;
}
