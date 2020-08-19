package ElementaryParticles.Fermions.AntiQuarks;

import ElementaryParticles.Fermions.Quarks.Generation;
import IntrinsicProperties.ElectricCharge;

public class AntiCharm extends AntiQuark {
    Generation generation = Generation.SECOND;
    ElectricCharge electricCharge = ElectricCharge.NEGATIVE;
    double electricChargeValue = -(2/3);
}
