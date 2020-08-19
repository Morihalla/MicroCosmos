package ElementaryParticles.Fermions.Particles.Leptons;

import ElementaryParticles.Fermions.Particles.Quarks.Generation;
import FundamentalInteractions.Electromagnetism;
import FundamentalInteractions.Gravitation;
import FundamentalInteractions.WeakInteraction;
import IntrinsicProperties.ElectricCharge;

public abstract class Lepton implements Electromagnetism, Gravitation, WeakInteraction {
    ElectricCharge electricCharge;
    long mass;
    double Spin = 0.5;
    Generation generation;
}
