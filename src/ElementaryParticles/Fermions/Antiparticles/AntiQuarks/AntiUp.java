package ElementaryParticles.Fermions.Antiparticles.AntiQuarks;

import ElementaryParticles.Fermions.Particles.Quarks.Generation;
import IntrinsicProperties.ElectricCharge;

public class AntiUp extends AntiQuark {
    Generation generation = Generation.FIRST;
    ElectricCharge electricCharge = ElectricCharge.NEGATIVE;
    double electricChargeValue = -(2/3);
}
