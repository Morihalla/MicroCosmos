package ElementaryParticles.Fermions.Antiparticles.AntiLeptons;

import ElementaryParticles.Fermions.Particles.Quarks.Generation;
import FundamentalInteractions.Electromagnetism;
import FundamentalInteractions.Gravitation;
import FundamentalInteractions.WeakInteraction;
import IntrinsicProperties.ElectricCharge;

public abstract class AntiLepton implements Electromagnetism, Gravitation, WeakInteraction {
    ElectricCharge electricCharge;
    long mass;
    double Spin = 0.5;
    Generation generation;
}
