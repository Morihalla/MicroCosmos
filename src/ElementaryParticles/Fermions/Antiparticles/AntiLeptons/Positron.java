package ElementaryParticles.Fermions.Antiparticles.AntiLeptons;

import ElementaryParticles.Fermions.Particles.Quarks.Generation;
import IntrinsicProperties.ElectricCharge;

public class Positron extends AntiLepton {
    Generation generation = Generation.FIRST;
    ElectricCharge electricCharge = ElectricCharge.POSITIVE;
    double electricChargeValue = 1;
}
