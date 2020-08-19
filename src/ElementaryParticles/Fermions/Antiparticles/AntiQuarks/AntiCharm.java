package ElementaryParticles.Fermions.Antiparticles.AntiQuarks;

import ElementaryParticles.Fermions.Particles.Quarks.Generation;
import IntrinsicProperties.ElectricCharge;

public class AntiCharm extends AntiQuark {
    Generation generation = Generation.SECOND;
    ElectricCharge electricCharge = ElectricCharge.NEGATIVE;
    double electricChargeValue = -(2/3);
}
